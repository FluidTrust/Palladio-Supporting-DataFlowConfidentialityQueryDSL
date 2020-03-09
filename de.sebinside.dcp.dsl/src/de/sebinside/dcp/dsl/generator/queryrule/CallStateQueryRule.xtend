package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.Rule
import org.eclipse.emf.ecore.util.EcoreUtil
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.PrologUtils.*

class CallStateQueryRule extends QueryRule {

	new(Rule rule, String nameBase) {
		super(rule, nameBase)
	}

	override createParameterQuery(Expression stack, Expression parameter, Expression attribute, Expression value,
		Expression operation, Expression stateVariable) {
		val preCallState = CompoundTerm("preCallState", #[stack, operation, stateVariable, attribute, value])
		// Create copies of each parameter (this is needed because...?)
		val postCallState = CompoundTerm("postCallState", #[
			EcoreUtil.copy(stack),
			EcoreUtil.copy(operation),
			EcoreUtil.copy(stateVariable),
			EcoreUtil.copy(attribute),
			EcoreUtil.copy(value)
		])
		LogicalOr(preCallState, postCallState)
	}

	override queryTypeIdentification() {
		"CALL_STATE"
	}
	
	override parameterTerm() {
		CompoundTerm(callState)
	}

}
