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

	protected val String callStack = GlobalConstants.Parameters.CALL_STACK.toString
	protected val String operation = GlobalConstants.Parameters.OPERATION.toString
	protected val String parameter = GlobalConstants.Parameters.PARAMETER.toString
	protected val String callState = GlobalConstants.Parameters.CALL_STATE.toString
	protected val String iteratorTemplate = GlobalConstants.Parameters.ITERATOR_TEMPLATE.toString
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
					#[
						createParameterQuery(CompoundTerm(callStack), CompoundTerm(parameter),
							converter.convert(selector.ref.ref), variable, CompoundTerm(operation),
							CompoundTerm(callState))]
				} else {
					val innerQuery = createParameterQuery(CompoundTerm(callStack), CompoundTerm(parameter),
						converter.convert(selector.ref.ref), CompoundTerm(iteratorTemplate), CompoundTerm(operation),
						CompoundTerm(callState))

					#[createForAllQuery(CompoundTerm(iteratorTemplate), innerQuery, variable)]
				}
			} else {
				selector.ref.literals.map [ literal |
					createParameterQuery(CompoundTerm(callStack), CompoundTerm(parameter),
						converter.convert(selector.ref.ref), converter.convert(literal), CompoundTerm(operation),
						CompoundTerm(callState))
				]
			}

		if (selector.ref.negated) {
			query.map[entry|negate(entry)]
		} else {
			query
		}
	}

	def dispatch generateDataSelectorTerm(AttributeClassSelector selector) {
		characteristicClasses.add(selector.ref)

		selector.ref.members.map [ member |
			createParameterQuery(CompoundTerm(callStack), CompoundTerm(parameter), converter.convert(member.ref),
				CompoundTerm('''«GlobalConstants.Prefixes.CLASS_VARIABLE»«selector.ref.name»_«member.ref.name»'''),
				CompoundTerm(operation), CompoundTerm(callState))
		]
	}

	def dispatch generateDestinationSelectorTerm(PropertySelector selector) {
		val query = if (selector.ref.isIsVariableSelector) {
				this.freeVariables.add(selector.ref.variable)

				val variable = createFreeVariableTerm(selector.ref.variable)
				if (selector.ref.variable instanceof CharacteristicVariable) {
					#[createPropertyQuery(CompoundTerm(operation), converter.convert(selector.ref.ref), variable)]
				} else {
					val innerQuery = createPropertyQuery(CompoundTerm(operation), converter.convert(selector.ref.ref),
						CompoundTerm(iteratorTemplate))

					#[createForAllQuery(CompoundTerm(iteratorTemplate), innerQuery, variable)]
				}
			} else {
				selector.ref.literals.map [ literal |
					createPropertyQuery(CompoundTerm(operation), converter.convert(selector.ref.ref),
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
		characteristicClasses.add(selector.ref)

		selector.ref.members.map [ member |
			createPropertyQuery(CompoundTerm(operation), converter.convert(member.ref),
				CompoundTerm('''«GlobalConstants.Prefixes.CLASS_VARIABLE»«selector.ref.name»_«member.ref.name»'''))
		]
	}

	def dispatch generateDestinationSelectorTerm(NodeIdentitiySelector selector) {
		val unification = Unification(CompoundTerm(operation), converter.convert(selector))

		#[unification]
	}

	def generate() {
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
			createCallStackUnification(CompoundTerm(callStack), CompoundTerm(operation)),
			createStackValidCall(CompoundTerm(callStack)), isUsedInOperationCheck(),
			expressionsToLogicalAnd(dataSelectorTerm), expressionsToLogicalAnd(destinationSelectorTerm),
			if (characteristicClasses.size > 0) {
				expressionsToLogicalAnd(characteristicsClassesTerms)
			}, if (rule.condition !== null) {
				new ConditionMapper(rule.condition.operation).conditionTerm
			}]
		subRule.body = expressionsToLogicalAnd(subRuleComponents)

		// Create rules parameters
		var List<CompoundTerm> parametersList = new ArrayList<CompoundTerm>
		parametersList.addAll(CompoundTerm("QueryType"), CompoundTerm(operation), CompoundTerm(callStack))
		parametersList.add(parameterTerm())

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

	abstract def Expression createParameterQuery(Expression stack, Expression parameter, Expression attribute,
		Expression value, Expression operation, Expression stateVariable)

	abstract def String queryTypeIdentification()

	abstract def CompoundTerm parameterTerm()

	abstract def CompoundTerm isUsedInOperationCheck()

}
