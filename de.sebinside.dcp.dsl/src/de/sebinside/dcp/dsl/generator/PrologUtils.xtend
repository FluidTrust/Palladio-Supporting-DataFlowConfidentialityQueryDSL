package de.sebinside.dcp.dsl.generator

import java.util.List
import org.palladiosimulator.supporting.prolog.model.prolog.PrologFactory
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.ExpressionsFactory

class PrologUtils {
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

	def static CompoundTerm(String value, List<Expression> arguments) {
		val compoundTerm = CompoundTerm(value)
		compoundTerm.arguments.addAll(arguments)
		compoundTerm
	}

	def static LogicalAnd(Expression left, Expression right) {
		val logicalAnd = ExpressionsFactory.eINSTANCE.createLogicalAnd
		logicalAnd.left = left
		logicalAnd.right = right
		logicalAnd
	}

	def static LogicalOr(Expression left, Expression right) {
		val logicalOr = ExpressionsFactory.eINSTANCE.createLogicalOr
		logicalOr.left = left
		logicalOr.right = right
		logicalOr
	}

	def static NotProvable(Expression expr) {
		val notProvable = ExpressionsFactory.eINSTANCE.createNotProvable
		notProvable.expr = expr
		notProvable
	}

	def static Unification(Expression left, Expression right) {
		val unification = ExpressionsFactory.eINSTANCE.createUnification
		unification.left = left
		unification.right = right
		unification
	}

	def static List(Expression head, Expression tail) {
		val list = PrologFactory.eINSTANCE.createList
		list.heads.add(head)
		list.tails.add(tail)
		list
	}

	def static AtomicQuotedString(String value) {
		val aqs = PrologFactory.eINSTANCE.createAtomicQuotedString
		aqs.value = value
		aqs
	}

}
