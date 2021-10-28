package de.sebinside.dcp.dsl.generator.util

import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicVariable
import de.sebinside.dcp.dsl.dSL.CharacteristicVariableType
import de.sebinside.dcp.dsl.generator.GlobalConstants
import java.io.ByteArrayOutputStream
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.palladiosimulator.supporting.prolog.model.prolog.AtomicQuotedString
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm
import org.palladiosimulator.supporting.prolog.model.prolog.Program
import org.palladiosimulator.supporting.prolog.model.prolog.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*

class DSLGeneratorUtils {

	def static ruleToRuleCall(Rule rule) {
		val compoundTerm = CompoundTerm(rule.head.value)
		compoundTerm.arguments.addAll(rule.head.arguments.map[argument|EcoreUtil.copy(argument)])
		compoundTerm
	}

	def static combineRuleArguments(List<Rule> rules) {
		val allArguments = rules.map[rule|rule.head.arguments].flatten
		val allArgumentTerms = allArguments.map[arg|arg as CompoundTerm]
		val allArgumentValues = allArgumentTerms.map[arg|arg.value]
		val uniqueArgumentValues = allArgumentValues.toSet
		uniqueArgumentValues.map[parameter|CompoundTerm(parameter)]
	}

	def static negate(Expression expression) {
		NotProvable(expression)
	}

	def static expressionsToLogicalAnd(Iterable<? extends Expression> expressions) {
		encapsulateExpressions(expressions, true)
	}

	def static expressionsToLogicalOr(Iterable<? extends Expression> expressions) {
		encapsulateExpressions(expressions, false)
	}

	private def static encapsulateExpressions(Iterable<? extends Expression> expressions, Boolean logicalAnd) {
		if (expressions.size == 0) {
			null
		} else {
			val iterator = expressions.iterator
			var term = iterator.next

			while (iterator.hasNext) {
				val nextItem = iterator.next

				if (nextItem !== null) {
					if (logicalAnd)
						term = LogicalAnd(term, nextItem)
					else
						term = LogicalOr(term, nextItem)
				}
			}

			term
		}
	}

	def static createQueryTypeUnification(String queryType) {
		Unification(CompoundTerm('''«GlobalConstants.Parameters.QUERY_TYPE»'''), AtomicQuotedString(queryType))
	}

	def static createConstraintNameUnification(String constraintName) {
		Unification(CompoundTerm('''«GlobalConstants.Parameters.CONSTRAINT_NAME»'''),
			AtomicQuotedString(constraintName))
	}
	
	def static createFlowTreeCall(CompoundTerm node, CompoundTerm pin, CompoundTerm stack){
		CompoundTerm("flowTree", #[node, pin, stack])
	}

	def static createMemberQuery(AtomicQuotedString valueSet, CompoundTerm member) {
		CompoundTerm("characteristicTypeValue", #[valueSet, member, CompoundTerm("_")])
	}

	def static createCharacteristicsClassTerm(CharacteristicClass characteristicClass) {
		CompoundTerm('''«GlobalConstants.Prefixes.CHARACTERISTICS_CLASS»«characteristicClass.name»''', characteristicClass.
			members.map [ member |
				CompoundTerm('''«GlobalConstants.Prefixes.CLASS_VARIABLE»«characteristicClass.name»_«member.ref.name»''')
			])
	}

	def static createFreeVariableTerm(CharacteristicVariableType variable) {
		if (variable instanceof CharacteristicVariable) {
			CompoundTerm('''«GlobalConstants.Prefixes.CHARACTERISTIC_VARIABLE»«variable.name»''')
		} else {
			CompoundTerm('''«GlobalConstants.Prefixes.CHARACTERISTIC_SET_VARIABLE»«variable.name»''')
		}
	}

	def static createTemporalVariableTerm(String name) {
		CompoundTerm('''«GlobalConstants.Prefixes.TEMPORAL_VARIABLE»«name»''')
	}

	def static createSetOfQuery(CompoundTerm iteratorTemplate, Expression query, Expression resultVariable) {
		CompoundTerm("setof", #[iteratorTemplate, query, resultVariable])
	}

	def static createPropertyQuery(Expression node, Expression property, Expression value) {
		// nodeCharacteristic(N, CT, V)
		CompoundTerm("nodeCharacteristic", #[node, property, value])
	}
	
	def static createParameterQuery(Expression node, Expression pin, Expression property, Expression value, Expression stack) {
		// characteristic(N, PIN, CT, V, S)
		CompoundTerm("characteristic", #[node, pin, property, value, stack])
	}
	
	def static saveFile(IFileSystemAccess2 fsa, Resource resource, Program program, String fileName) {
		// Create new resource
		val prologRessource = resource.resourceSet.createResource(resource.URI.appendFileExtension("pl"))
		prologRessource.contents.add(program)

		// Trigger serialization
		val outputStream = new ByteArrayOutputStream()
		prologRessource.save(outputStream, null)

		// Use FileSystemAccess to write serialized prolog code
		fsa.generateFile(fileName, outputStream.toString)
	}
	
	def static findParentOfType(EObject start, EClass parentType) {
		var current = start;
		while (current !== null && !parentType.isInstance(current)) {
			current = current.eContainer
		}
		return current
	}
}
