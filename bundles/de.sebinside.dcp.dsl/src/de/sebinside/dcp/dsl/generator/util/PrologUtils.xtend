package de.sebinside.dcp.dsl.generator.util

import java.util.List
import org.palladiosimulator.supporting.prolog.model.prolog.PrologFactory
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.ExpressionsFactory
import org.palladiosimulator.supporting.prolog.model.prolog.AtomicQuotedString
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm

class PrologUtils {
	def static Rule(String head) {
		val rule = PrologFactory.eINSTANCE.createRule
		val ruleHead = CompoundTerm(head)
		rule.head = ruleHead
		rule
	}

	def static SimpleFact(String head, AtomicQuotedString argument) {
		val fact = PrologFactory.eINSTANCE.createFact
		val factInternals = CompoundTerm(head, argument)
		fact.head = factInternals
		fact
	}
	
	def static Fact(CompoundTerm term) {
		val fact = PrologFactory.eINSTANCE.createFact
		fact.head = term
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
		val list = List(head)
		list.tails.add(tail)
		list
	}

	def static List(Iterable<Expression> heads) {
		val list = PrologFactory.eINSTANCE.createList
		list.heads.addAll(heads)
		list
	}

	def static List(Expression head) {
		List(#[head])
	}

	def static AtomicQuotedString(String value) {
		val aqs = PrologFactory.eINSTANCE.createAtomicQuotedString
		aqs.value = value
		aqs
	}

	def static AtomicNumber(int value) {
		val number = PrologFactory.eINSTANCE.createAtomicNumber
		number.value = value
		number
	}

	def static Less(Expression left, Expression right) {
		val less = ExpressionsFactory.eINSTANCE.createLessThan
		less.left = left
		less.right = right
		less
	}

	def static Geater(Expression left, Expression right) {
		val greater = ExpressionsFactory.eINSTANCE.createGreaterThan
		greater.left = left
		greater.right = right
		greater
	}
}
