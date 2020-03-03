package de.sebinside.dcp.dsl.generator

import de.sebinside.dcp.dsl.dSL.AttributeClassSelector
import de.sebinside.dcp.dsl.dSL.AttributeSelector
import de.sebinside.dcp.dsl.dSL.PropertyClassSelector
import de.sebinside.dcp.dsl.dSL.PropertySelector
import de.sebinside.dcp.dsl.dSL.Rule
import java.util.ArrayList
import java.util.List
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.DSLGeneratorUtils.*
import static de.sebinside.dcp.dsl.generator.PrologUtils.*
import java.util.HashSet
import java.util.Set
import de.sebinside.dcp.dsl.dSL.CharacteristicClass

abstract class QueryRule {

	val callStack = CompoundTerm("S")
	val operation = CompoundTerm("OP")
	val parameter = CompoundTerm("P")
	val callState = CompoundTerm("ST")
	val queryTypeTerm = createQueryTypeUnification(queryTypeIdentification)
	val callStackUnification = createCallStackUnification(callStack, operation)
	var Rule rule = null
	var String nameBase = null

	new(Rule rule, String nameBase) {
		this.rule = rule
		this.nameBase = nameBase
	}

	def generate() {
		val subRule = Rule('''«nameBase»_«queryTypeIdentification»''')
		val Set<CharacteristicClass> characteristicClasses = new HashSet<CharacteristicClass>
		// These are all the elements of a query rule
		// Map all data selectors to parts of a rule
		val dataSelectorTerm = rule.dataSelectors.map [ selector |
			switch selector {
				AttributeSelector: {
					val queries = new ArrayList<Expression>

					// Create a query for every literal of the selector
					selector.ref.literals.forEach [ literal |
						val query = createParameterQuery(queryTypeIdentification, callStack, parameter,
							AtomicQuotedString(selector.ref.ref.name), AtomicQuotedString(literal), operation,
							callState)

						// Handle negation
						if (selector.ref.negated) {
							queries.add(NotProvable(query))
						} else {
							queries.add(query)
						}
					]

					queries
				}
				AttributeClassSelector: {
					val queries = new ArrayList<Expression>

					// Add class to classes list (needed later for the rules parameter list)
					characteristicClasses.add(selector.ref)

					// Create a query for every member of the class
					selector.ref.members.forEach [ member |
						val query = createParameterQuery(queryTypeIdentification, callStack, parameter,
							AtomicQuotedString(selector.ref.name), CompoundTerm(member.ref.name), operation, callState)

						val memberQuery = createMemberQuery(member.ref.valueset.name, CompoundTerm(member.ref.name))

						val term = LogicalAnd(query, memberQuery)

						queries.add(term)
					]

					queries
				}
			}
		].map[queries|expressionsToLogicalAnd(queries)]

		// Map all destination selectors to parts of a rule
		val destinationSelectorTerm = rule.destinationSelectors.map [ selector |
			switch selector {
				PropertySelector: {
					val queries = new ArrayList<Expression>

					// Create a query for every literal of the selector
					selector.ref.literals.forEach [ literal |
						val query = createPropertyQuery(operation, AtomicQuotedString(selector.ref.ref.name),
							AtomicQuotedString(literal))

						// Handle negation
						if (selector.ref.negated) {
							queries.add(NotProvable(query))
						} else {
							queries.add(query)
						}
					]

					queries
				}
				PropertyClassSelector: {
					val queries = new ArrayList<Expression>

					// Add class to classes list (needed later for the rules parameter list)
					// characteristicClasses.add(selector.ref)
					// Create a query for every member of the class
					selector.ref.members.forEach [ member |
						val query = createPropertyQuery(operation, AtomicQuotedString(selector.ref.name),
							CompoundTerm(member.ref.name))

						val memberQuery = createMemberQuery(member.ref.valueset.name, CompoundTerm(member.ref.name))

						val term = LogicalAnd(query, memberQuery)

						queries.add(term)
					]

					queries
				}
			}
		].map[queries|expressionsToLogicalAnd(queries)]

		// Create characteristics class terms
		val characteristicsClassesTerms = characteristicClasses.map[clazz|createCharacteristicsClassTerm(clazz)]
		val characteristicsClassesLogicalAnd = expressionsToLogicalAnd(characteristicsClassesTerms)
		// Create final rule body
		val subRuleComponents = #[queryTypeTerm, callStackUnification, expressionsToLogicalAnd(dataSelectorTerm),
			expressionsToLogicalAnd(destinationSelectorTerm), characteristicsClassesLogicalAnd]
		subRule.body = expressionsToLogicalAnd(subRuleComponents)

		// Create rules parameters
		var List<CompoundTerm> parametersList = new ArrayList<CompoundTerm>
		parametersList.addAll(CompoundTerm("QueryType"), operation)
		if (queryTypeIdentification == "CALL_STATE") {
			parametersList.add(callState)
		} else {
			parametersList.add(parameter)
		}

		// Add all classes members names to the list since these are not constant
		val classTerms = characteristicClasses.toList.
			map[clazz|clazz.members.map[member|CompoundTerm(member.ref.name)]].flatten
		parametersList.addAll(classTerms)
		subRule.head.arguments.addAll(parametersList)

		subRule
	}

	abstract def Expression createParameterQuery(String queryType, Expression stack, Expression parameter,
		Expression attribute, Expression value, Expression operation, Expression stateVariable);

	abstract def String queryTypeIdentification();
}
