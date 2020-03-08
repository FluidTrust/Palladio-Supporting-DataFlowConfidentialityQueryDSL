package de.sebinside.dcp.dsl.generator

import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import java.io.ByteArrayOutputStream
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm
import org.palladiosimulator.supporting.prolog.model.prolog.Program
import org.palladiosimulator.supporting.prolog.model.prolog.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.PrologUtils.*

class DSLGeneratorUtils {

	def static ruleToRuleCall(Rule rule) {
		val compoundTerm = CompoundTerm(rule.head.value)
		compoundTerm.arguments.addAll(rule.head.arguments)
		compoundTerm
	}
	
	def static negate(Expression expression) {
		NotProvable(expression)
	}

	def static expressionsToLogicalAnd(Iterable<? extends Expression> expressions) {
		if (expressions.size == 0) {
			null
		} else {
			val iterator = expressions.iterator
			var term = iterator.next

			while (iterator.hasNext) {
				val nextItem = iterator.next

				if (nextItem !== null) {
					term = LogicalAnd(term, nextItem)
				}
			}

			term
		}
	}

	def static createQueryTypeUnification(String queryType) {
		Unification(CompoundTerm("QueryType"), AtomicQuotedString(queryType))
	}

	def static createCallStackUnification(CompoundTerm stack, CompoundTerm head) {
		Unification(stack, List(head, CompoundTerm("_")))
	}

	def static createMemberQuery(String valueSet, CompoundTerm member) {
		CompoundTerm("valueSetMember", #[AtomicQuotedString(valueSet), member])
	}

	def static createCharacteristicsClassTerm(CharacteristicClass characteristicClass) {
		CompoundTerm(characteristicClass.name, characteristicClass.members.map[member|CompoundTerm(member.ref.name)])
	}
	
	def static createPropertyQuery(Expression operation, Expression property, Expression value) {
		CompoundTerm("operationProperty", #[operation, property, value])
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
}
