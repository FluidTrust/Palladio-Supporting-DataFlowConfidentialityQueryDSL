package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression
import static de.sebinside.dcp.dsl.generator.PrologUtils.*
import de.sebinside.dcp.dsl.generator.queryrule.QueryRule

class CallStateQueryRule extends QueryRule {

	new(Rule rule, String nameBase) {
		super(rule, nameBase)
	}

	override createParameterQuery(Expression stack, Expression parameter, Expression attribute,
		Expression value, Expression operation, Expression stateVariable) {
		val preCallState = CompoundTerm("preCallState", #[stack, operation, stateVariable, attribute, value])
		val postCallState = CompoundTerm("postCallState", #[stack, operation, stateVariable, attribute, value])
		LogicalOr(preCallState, postCallState)
	}
	
	override queryTypeIdentification() {
		"CALL_STATE"
	}

}
