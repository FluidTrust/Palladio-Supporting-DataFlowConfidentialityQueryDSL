package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.AttributeClassSelector
import de.sebinside.dcp.dsl.dSL.AttributeSelector
import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicVariable
import de.sebinside.dcp.dsl.dSL.CharacteristicVariableType
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.dSL.PropertyClassSelector
import de.sebinside.dcp.dsl.dSL.PropertySelector
import de.sebinside.dcp.dsl.dSL.Rule
import de.sebinside.dcp.dsl.generator.GlobalConstants
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.util.DSLGeneratorUtils.*
import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import de.sebinside.dcp.dsl.generator.util.ConditionMapper

abstract class QueryRule {

	protected val String node = GlobalConstants.Parameters.NODE.toString
	protected val String pin = GlobalConstants.Parameters.PIN.toString
	protected val String stack = GlobalConstants.Parameters.CALL_STACK.toString
	
	protected val String iteratorTemplate1 = GlobalConstants.Parameters.ITERATOR_TEMPLATE_1.toString
	protected val String iteratorTemplate2 = GlobalConstants.Parameters.ITERATOR_TEMPLATE_2.toString
	val queryTypeTerm = createQueryTypeUnification(queryTypeIdentification)

	var Rule rule = null
	var String nameBase = null
	var Converter converter = null

	var Set<CharacteristicClass> characteristicClasses = new HashSet<CharacteristicClass>
	var Set<CharacteristicVariableType> freeVariables = new HashSet<CharacteristicVariableType>

	new(Rule rule, String nameBase, Converter converter) {
		this.rule = rule
		this.nameBase = nameBase
		this.converter = converter
	}

	def dispatch generateDataSelectorTerm(AttributeSelector selector) {
		val query = if (selector.ref.isIsVariableSelector) {
				this.freeVariables.add(selector.ref.variable)

				val variable = createFreeVariableTerm(selector.ref.variable)
				if (selector.ref.variable instanceof CharacteristicVariable) { 
				// single characteristic selected
				// characteristic(N, PIN, CT, V, S)
				// characteristic(node, pin, selector.ref.ref, variable, stack) -> for each literal in selector.ref.literals

					#[
						createParameterQuery(CompoundTerm(node), CompoundTerm(pin),
							converter.convert(selector.ref.ref), variable, CompoundTerm(stack))]
				} else { 
				// set of characteristics selected
				// setof(V, characteristic(node, pin, selector.ref.ref, V, stack)				
					val innerQuery = createParameterQuery(CompoundTerm(node), CompoundTerm(pin),
						converter.convert(selector.ref.ref), CompoundTerm(iteratorTemplate1), CompoundTerm(stack))

					#[createSetOfQuery(CompoundTerm(iteratorTemplate1), innerQuery, variable)]
				}
			} else {
				// characteristic(node, pin, selector.ref.ref, selector.ref.literals, stack) 
				// -> for each literal in selector.ref.literals
				selector.ref.literals.map [ literal |
					createParameterQuery(CompoundTerm(node), CompoundTerm(pin),
						converter.convert(selector.ref.ref), converter.convert(literal), CompoundTerm(stack))
				]
			} 

		if (selector.ref.negated) {
			query.map[entry|negate(entry)]
		} else {
			query
		}
	}

	def dispatch generateDataSelectorTerm(AttributeClassSelector selector) {
		// stays the same
		characteristicClasses.add(selector.ref)

		selector.ref.members.map [ member |
			createParameterQuery(CompoundTerm(node), CompoundTerm(pin), converter.convert(member.ref),
				CompoundTerm('''«GlobalConstants.Prefixes.CLASS_VARIABLE»«selector.ref.name»_«member.ref.name»'''), CompoundTerm(stack))
		]
	}

	def dispatch generateDestinationSelectorTerm(PropertySelector selector) {
		val query = if (selector.ref.isIsVariableSelector) {
				this.freeVariables.add(selector.ref.variable)

				val variable = createFreeVariableTerm(selector.ref.variable)
				if (selector.ref.variable instanceof CharacteristicVariable) {
					// single characteristic selected
					// nodeCharacteristic(N, CT, V)
					// nodeCharacteristic(node, selector.ref.ref, variable)
					#[createPropertyQuery(CompoundTerm(node), converter.convert(selector.ref.ref), variable)]
				} else {
					// set of characteristics selected
					// setof(R, nodeCharacteristic(N, CT, R), variable)
					// setof(R, nodeCharacteristic(node, selector.ref.ref, R), variable)
					val innerQuery = createPropertyQuery(CompoundTerm(node), converter.convert(selector.ref.ref),
						CompoundTerm(iteratorTemplate2))

					#[createSetOfQuery(CompoundTerm(iteratorTemplate2), innerQuery, variable)]
				}
			} else {
				// nodeCharacteristic(node, selector.ref.ref, literal)
				// -> for each literal in selector.ref.literals
				selector.ref.literals.map [ literal |
					createPropertyQuery(CompoundTerm(node), converter.convert(selector.ref.ref),
						converter.convert(literal))
				]
			}

		if (selector.ref.negated) {
			query.map[entry|negate(entry)]
		} else {
			query
		}
	}

	def dispatch generateDestinationSelectorTerm(PropertyClassSelector selector) {
		// stays the same
		characteristicClasses.add(selector.ref)

		selector.ref.members.map [ member |
			createPropertyQuery(CompoundTerm(node), converter.convert(member.ref),
				CompoundTerm('''«GlobalConstants.Prefixes.CLASS_VARIABLE»«selector.ref.name»_«member.ref.name»'''))
		]
	}

	def dispatch generateDestinationSelectorTerm(NodeIdentitiySelector selector) {
		// node can be actor(selector), store(selector), process(selector)
		// -> each of the three in disjunction?
		val unification = Unification(CompoundTerm(node), converter.convert(selector))

		#[unification]
	}

	def generate() { // Important for generating the actual query rule body
		val subRule = Rule('''«nameBase»_«queryTypeIdentification»''')

		// Map all data selectors to parts of a rule
		val dataSelectorTerm = rule.dataSelectors.map[selector|generateDataSelectorTerm(selector)].map [ queries |
			expressionsToLogicalAnd(queries)
		]

		// Map all destination selectors to parts of a rule
		val destinationSelectorTerm = rule.destinationSelectors.map [ selector |
			generateDestinationSelectorTerm(selector)
		].map[queries|expressionsToLogicalAnd(queries)]

		// Create characteristics class terms
		val characteristicsClassesTerms = characteristicClasses.map[clazz|createCharacteristicsClassTerm(clazz)]

		// Create final rule body
		val subRuleComponents = #[queryTypeTerm,
			createPinLocationQuery(CompoundTerm(node), CompoundTerm(pin)), // input/output pin
			createFlowTreeCall(CompoundTerm(node), CompoundTerm(pin), CompoundTerm(stack)), // flowTree 
			expressionsToLogicalAnd(destinationSelectorTerm), // set of nodeCharacteristic
			expressionsToLogicalAnd(dataSelectorTerm), // set of characteristic
			
			if (characteristicClasses.size > 0) {
				expressionsToLogicalAnd(characteristicsClassesTerms)
			}, if (rule.condition !== null) {
				new ConditionMapper(rule.condition.operation).conditionTerm
			}]
		subRule.body = expressionsToLogicalAnd(subRuleComponents)

		// Create rules parameters
		var List<CompoundTerm> parametersList = new ArrayList<CompoundTerm>
		parametersList.addAll(CompoundTerm("QueryType"), CompoundTerm(node), CompoundTerm(pin), CompoundTerm(stack))

		// Add all (unique) classes members names to the list
		val classTerms = characteristicClasses.toList.map [ clazz |
			clazz.members.map[member|'''«GlobalConstants.Prefixes.CLASS_VARIABLE»«clazz.name»_«member.ref.name»''']
		].toSet.flatten.map[term|CompoundTerm(term)]
		parametersList.addAll(classTerms)

		// Add all free variables
		val freeVariableTerms = freeVariables.map [ variable |
			createFreeVariableTerm(variable)
		]
		parametersList.addAll(freeVariableTerms)

		subRule.head.arguments.addAll(parametersList)
		subRule
	}

	abstract def Expression createPinLocationQuery(Expression node, Expression pin)

	abstract def String queryTypeIdentification()
}
