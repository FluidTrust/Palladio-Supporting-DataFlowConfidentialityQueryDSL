package de.sebinside.dcp.dsl.generator.util

import de.sebinside.dcp.dsl.dSL.BooleanOperation
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
import java.util.ArrayList
import java.util.List
import java.util.Stack
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.util.DSLGeneratorUtils.*
import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import de.sebinside.dcp.dsl.dSL.CharacteristicReference
import org.eclipse.xtext.EcoreUtil2

class ConditionMapper {

	List<Expression> expressions
	Stack<CompoundTerm> variables
	int temporalVariableCounter

	new(BooleanOperation operation) {
		this.expressions = new ArrayList<Expression>
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
		// This is needed because of the containment references in the prolog meta-model
		EcoreUtil2.copy(variables.lastElement)
	}

	private def dispatch void map(LogicalOrOperation operation) {
		// TODO
	}

	private def dispatch void map(LogicalAndOperation operation) {
		// TODO
	}

	private def dispatch void map(LogicalNegationOperation operation) {
		// TODO
	}

	private def dispatch void map(VariableEqualityOperation operation) {
		// TODO
	}

	private def dispatch void map(VariableInequalityOperation operation) {
		// TODO
	}

	private def dispatch void map(EmptySetOperation operation) {
		consumeOrNest(operation.value)

		val variable = variables.pop
		val term = negate(CompoundTerm("length", #[variable, AtomicNumber(0)]))
		expressions.add(term)
	}

	private def dispatch void map(IntersectionOperation operation) {
		consumeOrNest(operation.left)
		consumeOrNest(operation.right)

		val right = variables.pop
		val left = variables.pop
		val temporal = copyStackHead()

		val term = CompoundTerm("intersection", #[left, right, temporal])
		expressions.add(term)
	}

	private def dispatch void map(UnionOperation operation) {
		// TODO
	}

	private def dispatch void map(SubtractOperation operation) {
		// TODO
	}

	private def dispatch void map(ElementOfOperation operation) {
		consumeOrNest(operation.left)
		consumeOrNest(operation.right)

		val right = variables.pop
		val left = variables.pop

		val term = CompoundTerm("memberchk", #[left, right])
		expressions.add(term)
	}

	private def dispatch void map(CreateSetOperation operation) {
		// TODO
	}
}
