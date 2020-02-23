package de.sebinside.dcp.dsl.generator

import java.io.ByteArrayOutputStream
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.palladiosimulator.supporting.prolog.model.prolog.Program
import org.palladiosimulator.supporting.prolog.model.prolog.PrologFactory
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.ExpressionsFactory

class DSLGeneratorUtils {

	def static Rule(String head) {
		val rule = PrologFactory.eINSTANCE.createRule
		val ruleHead = CompoundTerm(head)
		rule.head = ruleHead
		rule
	}

	def static SimpleFact(String head, String argument) {
		val fact = PrologFactory.eINSTANCE.createFact
		val factInternals = CompoundTerm(head, CompoundTerm(argument))
		fact.head = factInternals
		fact
	}

	def static CompoundTerm() {
		PrologFactory.eINSTANCE.createCompoundTerm
	}

	def static CompoundTerm(String value) {
		val compoundTerm = CompoundTerm
		compoundTerm.value = value
		compoundTerm
	}

	def static CompoundTerm(String value, Expression singleArgument) {
		val compoundTerm = CompoundTerm(value)
		compoundTerm.arguments.add(singleArgument)
		compoundTerm
	}

	def static LogicalAnd(Expression left, Expression right) {
		val logicalAnd = ExpressionsFactory.eINSTANCE.createLogicalAnd
		logicalAnd.left = left
		logicalAnd.right = right
		logicalAnd
	}

	def static NotProvable(Expression expr) {
		val notProvable = ExpressionsFactory.eINSTANCE.createNotProvable
		notProvable.expr = expr
		notProvable
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
	
	enum SubRuleType {
		CALL_ARGUMENT,
		RETURN_VALUE,
		CALL_STATE
	}
}
