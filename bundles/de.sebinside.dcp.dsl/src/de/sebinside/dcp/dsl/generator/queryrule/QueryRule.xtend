package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.AnySelector
import de.sebinside.dcp.dsl.dSL.AttributeClassSelector
import de.sebinside.dcp.dsl.dSL.AttributeSelector
import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicVariable
import de.sebinside.dcp.dsl.dSL.CharacteristicVariableType
import de.sebinside.dcp.dsl.dSL.GlobalConstantDefinition
import de.sebinside.dcp.dsl.dSL.GlobalSetConstantDefinition
import de.sebinside.dcp.dsl.dSL.GlobalValueConstantDefinition
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.dSL.NodeTypeSelector
import de.sebinside.dcp.dsl.dSL.PropertyClassSelector
import de.sebinside.dcp.dsl.dSL.PropertySelector
import de.sebinside.dcp.dsl.dSL.Rule
import de.sebinside.dcp.dsl.generator.GlobalConstants
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import de.sebinside.dcp.dsl.generator.util.ConditionMapper
import java.util.ArrayList
import java.util.LinkedHashSet
import java.util.List
import java.util.Set
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.util.DSLGeneratorUtils.*
import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*

abstract class QueryRule {

	protected val String node = GlobalConstants.Parameters.NODE.toString
	protected val String fromNode = GlobalConstants.Parameters.NODE_FROM.toString
	protected val String pin = GlobalConstants.Parameters.PIN.toString
	protected val String stack = GlobalConstants.Parameters.CALL_STACK.toString
	
	protected val String iteratorTemplate1 = GlobalConstants.Parameters.ITERATOR_TEMPLATE_1.toString
	protected val String iteratorTemplate2 = GlobalConstants.Parameters.ITERATOR_TEMPLATE_2.toString
	val queryTypeTerm = createQueryTypeUnification(queryTypeIdentification)

	var Rule rule = null
	var String nameBase = null
	var Converter converter = null

	var Set<CharacteristicClass> characteristicClasses = new LinkedHashSet<CharacteristicClass>
	var Set<CharacteristicVariableType> freeVariables = new LinkedHashSet<CharacteristicVariableType>

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
	
	def dispatch generateDataSelectorTerm(AnySelector selector) {
		#[]
	}

	def dispatch generateDestinationSelectorTerm(PropertySelector selector, String nodeName) {
		val query = if (selector.ref.isIsVariableSelector) {
				this.freeVariables.add(selector.ref.variable)

				val variable = createFreeVariableTerm(selector.ref.variable)
				if (selector.ref.variable instanceof CharacteristicVariable) {
					// single characteristic selected
					// nodeCharacteristic(N, CT, V)
					// nodeCharacteristic(node, selector.ref.ref, variable)
					#[createPropertyQuery(CompoundTerm(nodeName), converter.convert(selector.ref.ref), variable)]
				} else {
					// set of characteristics selected
					// setof(R, nodeCharacteristic(N, CT, R), variable)
					// setof(R, nodeCharacteristic(node, selector.ref.ref, R), variable)
					val innerQuery = createPropertyQuery(CompoundTerm(nodeName), converter.convert(selector.ref.ref),
						CompoundTerm(iteratorTemplate2))

					#[createSetOfQuery(CompoundTerm(iteratorTemplate2), innerQuery, variable)]
				}
			} else {
				// nodeCharacteristic(node, selector.ref.ref, literal)
				// -> for each literal in selector.ref.literals
				selector.ref.literals.map [ literal |
					createPropertyQuery(CompoundTerm(nodeName), converter.convert(selector.ref.ref),
						converter.convert(literal))
				]
			}

		if (selector.ref.negated) {
			query.map[entry|negate(entry)]
		} else {
			query
		}
	}

	def dispatch generateDestinationSelectorTerm(PropertyClassSelector selector, String nodeName) {
		// stays the same
		characteristicClasses.add(selector.ref)

		selector.ref.members.map [ member |
			createPropertyQuery(CompoundTerm(nodeName), converter.convert(member.ref),
				CompoundTerm('''«GlobalConstants.Prefixes.CLASS_VARIABLE»«selector.ref.name»_«member.ref.name»'''))
		]
	}

	def dispatch generateDestinationSelectorTerm(NodeIdentitiySelector selector, String nodeName) {
		val unification = Unification(CompoundTerm(nodeName), converter.convert(selector))

		#[unification]
	}
	
	def dispatch generateDestinationSelectorTerm(NodeTypeSelector selector, String nodeName) {
		val term = switch (selector.type) {
			case ACTOR: {
				CompoundTerm("actor", CompoundTerm(nodeName))
			}
			case ACTORPROCESS: {
				CompoundTerm("actorprocess", #[CompoundTerm(nodeName), CompoundTerm("_")])
			}
			case PROCESS: {
				CompoundTerm("process", CompoundTerm(nodeName))
			}
			case STORE: {
				CompoundTerm("store", CompoundTerm(nodeName))
			}
			
		}
		#[term]
	}

	def generate(Iterable<GlobalConstantDefinition> globalConstants) { // Important for generating the actual query rule body
		val subRule = Rule('''«nameBase»_«queryTypeIdentification»''')

		// Map all data selectors to parts of a rule
		val dataSelectorTerm = rule.dataSelectors.map[selector|generateDataSelectorTerm(selector)].map [ queries |
			expressionsToLogicalAnd(queries)
		].filterNull

		// Map all destination selectors to parts of a rule
		val destinationSelectorTerm = rule.destinationSelectors.map [ selector |
			generateDestinationSelectorTerm(selector, node)
		].map[queries|expressionsToLogicalAnd(queries)]
		
		// Map all destination selectors of FROM to parts of a rule
		val fromSelectorTerm = rule.from === null
				? #[]
				: {
					val selectorTerms = rule.from.destinationSelectors.map[s|generateDestinationSelectorTerm(s, fromNode)].map[queries|expressionsToLogicalAnd(queries)]
					val fromCheckTerm = CompoundTerm("traversedNode", #[CompoundTerm(stack), CompoundTerm(fromNode)])
					selectorTerms + #[fromCheckTerm]
				}

		// Create characteristics class terms
		val characteristicsClassesTerms = characteristicClasses.map[clazz|createCharacteristicsClassTerm(clazz)]

		// Create all global constants
		val globalConstantExpressions = globalConstants.map[generateGlobalConstant]

		// Create final rule body
		val subRuleComponents = new ArrayList<Expression>
		subRuleComponents += queryTypeTerm
		subRuleComponents += globalConstantExpressions
		subRuleComponents += createPinLocationQuery(CompoundTerm(node), CompoundTerm(pin)) // input/output pin
		subRuleComponents += createFlowTreeCall(CompoundTerm(node), CompoundTerm(pin), CompoundTerm(stack)) // flowTree 
		subRuleComponents += expressionsToLogicalAnd(destinationSelectorTerm) // set of nodeCharacteristic
		subRuleComponents += fromSelectorTerm.empty ? #[] : #[expressionsToLogicalAnd(fromSelectorTerm)] // set of nodeCharacteristic for FROM
		subRuleComponents += dataSelectorTerm.empty ? #[] : #[expressionsToLogicalAnd(dataSelectorTerm)] // set of characteristic
		if (characteristicClasses.size > 0) {
			subRuleComponents += expressionsToLogicalAnd(characteristicsClassesTerms)
		}
		if (rule.condition !== null) {
			subRuleComponents += new ConditionMapper(rule.condition.operation, converter).conditionTerm
		}

		subRule.body = expressionsToLogicalAnd(subRuleComponents)

		// Create rules parameters
		var List<CompoundTerm> parametersList = new ArrayList<CompoundTerm>
		parametersList.addAll(CompoundTerm("QueryType"), CompoundTerm(node), CompoundTerm(pin), CompoundTerm(stack))
		if (rule.from !== null) {
			parametersList.add(CompoundTerm(fromNode))
		}

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
	
	protected def dispatch Expression generateGlobalConstant(GlobalValueConstantDefinition definition) {
		val constantTerm = createFreeVariableTerm(definition.variable)
		val literal = definition.literals.findFirst[true]
		Unification(constantTerm, converter.convert(literal))
	}
	
	protected def dispatch Expression generateGlobalConstant(GlobalSetConstantDefinition definition) {
		val constantTerm = createFreeVariableTerm(definition.variable)
		val values = definition.literals.map[l|converter.convert(l)].filter(Expression)
		Unification(constantTerm, List(values))
	}
}
