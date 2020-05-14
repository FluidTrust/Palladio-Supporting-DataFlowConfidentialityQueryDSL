package de.sebinside.dcp.dsl.generator.util

import de.sebinside.dcp.dsl.dSL.BooleanOperation
import de.sebinside.dcp.dsl.dSL.CharacteristicReference
import de.sebinside.dcp.dsl.dSL.CharacteristicSetReference
import de.sebinside.dcp.dsl.dSL.CreateSetOperation
import de.sebinside.dcp.dsl.dSL.ElementOfOperation
import de.sebinside.dcp.dsl.dSL.EmptySetOperation
import de.sebinside.dcp.dsl.dSL.IntersectionOperation
import de.sebinside.dcp.dsl.dSL.LogicalAndOperation
import de.sebinside.dcp.dsl.dSL.LogicalNegationOperation
import de.sebinside.dcp.dsl.dSL.LogicalOrOperation
import de.sebinside.dcp.dsl.dSL.SubtractOperation
import de.sebinside.dcp.dsl.dSL.UnionOperation
import de.sebinside.dcp.dsl.dSL.VariableEqualityOperation
import de.sebinside.dcp.dsl.dSL.VariableInequalityOperation
import java.util.Stack
import org.eclipse.xtext.EcoreUtil2
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.util.DSLGeneratorUtils.*
import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*

class ConditionMapper {

	Stack<Expression> expressions
	Stack<CompoundTerm> variables
	int temporalVariableCounter

	new(BooleanOperation operation) {
		this.expressions = new Stack<Expression>
		this.variables = new Stack<CompoundTerm>
		this.temporalVariableCounter = 0

		map(operation)
	}

	def Expression getConditionTerm() {
		expressionsToLogicalAnd(expressions)
	}

	private def void consumeOrNest(CharacteristicSetReference reference) {
		if (reference.value !== null) {
			val freeVariable = createFreeVariableTerm(reference.value)
			this.variables.push(freeVariable)
		} else {
			val temporalVariable = createTemporalVariableTerm('''«temporalVariableCounter++»''')
			this.variables.push(temporalVariable)

			map(reference.ref)
		}
	}

	private def void consumeOrNest(CharacteristicReference reference) {
		val freeVariable = createFreeVariableTerm(reference.value)
		this.variables.push(freeVariable)
	}

	private def copyStackHead() {
		// This is needed because of the containment reference in the prolog meta-model
		EcoreUtil2.copy(variables.lastElement)
	}

	private def dispatch void map(LogicalOrOperation operation) {
		map(operation.left)
		val left = expressions.pop

		map(operation.right)
		val right = expressions.pop

		val term = LogicalOr(left, right)
		expressions.push(term)
	}

	private def dispatch void map(LogicalAndOperation operation) {
		map(operation.left)
		val left = expressions.pop

		map(operation.right)
		val right = expressions.pop

		val term = LogicalAnd(left, right)
		expressions.push(term)
	}

	private def dispatch void map(LogicalNegationOperation operation) {
		map(operation.value)
		val expression = expressions.pop

		val term = negate(expression)
		expressions.push(term)
	}

	private def dispatch void map(VariableEqualityOperation operation) {
		consumeOrNest(operation.left)
		consumeOrNest(operation.right)

		val right = variables.pop
		val left = variables.pop

		val term = Unification(left, right)
		expressions.push(term)
	}

	private def dispatch void map(VariableInequalityOperation operation) {
		consumeOrNest(operation.left)
		consumeOrNest(operation.right)

		val right = variables.pop
		val left = variables.pop

		val term = negate(Unification(left, right))
		expressions.push(term)
	}

	private def dispatch void map(EmptySetOperation operation) {
		consumeOrNest(operation.value)

		val variable = variables.pop
		val term = negate(CompoundTerm("length", #[variable, AtomicNumber(0)]))
		expressions.push(term)
	}

	private def dispatch void map(IntersectionOperation operation) {
		basicSetOperation("intersection", operation.left, operation.right)
	}

	private def dispatch void map(UnionOperation operation) {
		basicSetOperation("union", operation.left, operation.right)
	}

	private def dispatch void map(SubtractOperation operation) {
		basicSetOperation("subtract", operation.left, operation.right)
	}

	private def void basicSetOperation(String name, CharacteristicSetReference left, CharacteristicSetReference right) {
		consumeOrNest(left)
		consumeOrNest(right)

		val rightVariable = variables.pop
		val leftVariable = variables.pop
		val temporal = copyStackHead()

		val term = CompoundTerm(name, #[leftVariable, rightVariable, temporal])
		expressions.push(term)
	}

	private def dispatch void map(ElementOfOperation operation) {
		consumeOrNest(operation.left)
		consumeOrNest(operation.right)

		val right = variables.pop
		val left = variables.pop

		val term = CompoundTerm("memberchk", #[left, right])
		expressions.push(term)
	}

	private def dispatch void map(CreateSetOperation operation) {
		consumeOrNest(operation.value)

		val variable = variables.pop
		val temporal = copyStackHead()

		val term = Unification(temporal, List(variable))
		expressions.push(term)
	}
}
