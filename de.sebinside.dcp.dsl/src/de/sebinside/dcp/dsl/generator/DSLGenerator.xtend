/*
 * generated by Xtext 2.20.0
 */
package de.sebinside.dcp.dsl.generator

import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.Constraint
import de.sebinside.dcp.dsl.dSL.TargetModelType
import de.sebinside.dcp.dsl.dSL.TargetModelTypeDef
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import de.sebinside.dcp.dsl.generator.crossplatform.OperationModelConverter
import de.sebinside.dcp.dsl.generator.crossplatform.PalladioConverter
import de.sebinside.dcp.dsl.generator.queryrule.CallArgumentQueryRule
import de.sebinside.dcp.dsl.generator.queryrule.PostCallStateQueryRule
import de.sebinside.dcp.dsl.generator.queryrule.PreCallStateQueryRule
import de.sebinside.dcp.dsl.generator.queryrule.ReturnValueQueryRule
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.palladiosimulator.supporting.prolog.model.prolog.Clause
import org.palladiosimulator.supporting.prolog.model.prolog.PrologFactory
import org.palladiosimulator.supporting.prolog.model.prolog.Rule

import static de.sebinside.dcp.dsl.generator.util.DSLGeneratorUtils.*
import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import de.sebinside.dcp.dsl.generator.crossplatform.ConverterFactory

class DSLGenerator extends AbstractGenerator {

	static final String DEFAULT_OUTPUT_FILE_NAME = "output.pl"
	static final String DSL_EXTENSION = ".DCPDSL"
	static final String PROLOG_EXTENSION = ".pl"

	// Setting the default value
	Converter converter = ConverterFactory.createOperationModelConverter
	TargetModelType targetModelType = TargetModelType.OPERATION_MODEL

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val program = PrologFactory.eINSTANCE.createProgram

		for (element : resource.allContents.toIterable.filter(TargetModelTypeDef)) {
			element.compile
		}

		for (element : resource.allContents.toIterable.filter(CharacteristicClass)) {
			program.clauses.addAll(element.compile)
		}

		for (element : resource.allContents.toIterable.filter(Constraint)) {
			program.clauses.addAll(element.compile)
		}

		val outputFileName = if (resource.URI.lastSegment !== null) {
				resource.URI.lastSegment.replace(DSL_EXTENSION, PROLOG_EXTENSION)
			} else {
				DEFAULT_OUTPUT_FILE_NAME
			}
		saveFile(fsa, resource, program, outputFileName)
	}

	def compile(TargetModelTypeDef typeDefs) {
		// There is only one or none target model type definition
		this.targetModelType = typeDefs.type

		switch (typeDefs.type) {
			case DATA_CENTRIC_PALLADIO: {
				if (typeDefs.usageModel === null || typeDefs.allocationModel === null ||
					typeDefs.typeContainer === null) {
					this.converter = ConverterFactory.createPalladioConverter
				} else {
					this.converter = ConverterFactory.createPalladioConverter(typeDefs.usageModel,
						typeDefs.allocationModel, typeDefs.typeContainer)
				}
			}
			case EXTENDED_DFD: {
				throw new Exception("Extended DFD are not supported yet.")
			}
			case OPERATION_MODEL: {
				this.converter = ConverterFactory.createOperationModelConverter
			}
		}
	}

	def List<Clause> compile(CharacteristicClass charateristicClass) {
		val clauses = new ArrayList<Clause>

		// Create rule referencing all facts
		val rule = Rule('''�GlobalConstants.Prefixes.CHARACTERISTICS_CLASS��charateristicClass.name�''')
		rule.body = null

		// A rules arguments are all contained member type names
		rule.head.arguments.addAll(charateristicClass.members.map[member|member.ref.name].toSet.map [ type |
			CompoundTerm('''�GlobalConstants.Prefixes.CLASS_VARIABLE��charateristicClass.name�_�type�''')
		].toList)

		// Create single facts for every member
		charateristicClass.members.forEach [ member, index |
			member.literals.forEach [ literal |

				// Create and add fact
				val factName = '''�GlobalConstants.Prefixes.CHARACTERISTICS_CLASS��charateristicClass.name�_�member.ref.name�_�index��if(member.negated) "_NEG"�'''
				val fact = SimpleFact(factName, converter.convert(literal))
				clauses.add(fact)

				// Create fact reference for the rule
				val factReference = CompoundTerm(fact.head.value,
					CompoundTerm('''�GlobalConstants.Prefixes.CLASS_VARIABLE��charateristicClass.name�_�member.ref.name�'''))

				// Handle negated facts
				val factExpression = if (member.negated) {
						NotProvable(factReference)
					} else {
						factReference
					}

				// A rule body consists of one or multiple combined facts
				if (rule.body === null) {
					rule.body = factExpression
				} else {
					rule.body = LogicalAnd(rule.body, factExpression)
				}
			]
		]

		// Add member queries to the class directly
		// FIXME: Might contain duplicates
		val memberQueries = charateristicClass.members.map [ member |
			createMemberQuery(AtomicQuotedString(member.ref.ref.entityName),
				CompoundTerm('''�GlobalConstants.Prefixes.CLASS_VARIABLE��charateristicClass.name�_�member.ref.name�'''))
		]
		val memberQueriesTerm = expressionsToLogicalAnd(memberQueries);

		if (memberQueries !== null) {
			// Note: The ordering is crucial!
			rule.body = LogicalAnd(memberQueriesTerm, rule.body)
		}

		clauses.add(rule)
		clauses
	}

	def List<Clause> compile(Constraint constraint) {
		val clauses = new ArrayList<Clause>
		val constraintName = '''�GlobalConstants.Prefixes.CONSTRAINT��constraint.name�'''
		val constraintNameTerm = createConstraintNameUnification(constraint.name)

		// Every constraint is mapped to a rule
		val constraintRule = Rule(constraintName)

		// FIXME: The first iteration does only support one rule per constraint
		val mainRule = constraint.rule

		// FIXME: The first iteration does only support NEVER FLOW statements
		if (!mainRule.statement.modality.name.equals("NEVER") || !mainRule.statement.type.name.equals("FLOWS")) {
			throw new Exception("Unable to generate. Unsupported modality or statement type.")
		} else {

			var rules = new ArrayList<Rule>()
			rules.add(new PreCallStateQueryRule(mainRule, constraintName, converter).generate())

			// Only the operation model works with all kinds of rules, Palladio only requires preCallStates
			if (this.targetModelType == TargetModelType.OPERATION_MODEL) {
				rules.add(new PostCallStateQueryRule(mainRule, constraintName, converter).generate())
				rules.add(new CallArgumentQueryRule(mainRule, constraintName, converter).generate())
				rules.add(new ReturnValueQueryRule(mainRule, constraintName, converter).generate())
			}

			// Combine rules
			constraintRule.body = expressionsToLogicalOr(rules.map[rule|ruleToRuleCall(rule)])

			// Add constraint name unification
			constraintRule.body = LogicalAnd(constraintNameTerm, constraintRule.body)
			constraintRule.head.arguments.add(CompoundTerm('''�GlobalConstants.Parameters.CONSTRAINT_NAME�'''))

			// Combine (unique) arguments of all rules
			val allArguments = combineRuleArguments(rules)
			constraintRule.head.arguments.addAll(allArguments)

			clauses.add(constraintRule)
			clauses.addAll(rules)
		}
		clauses
	}

}
