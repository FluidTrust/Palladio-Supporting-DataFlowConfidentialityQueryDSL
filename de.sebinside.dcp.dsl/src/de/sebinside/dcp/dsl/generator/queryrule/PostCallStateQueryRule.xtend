package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.PrologUtils.*
import de.sebinside.dcp.dsl.generator.crossplatform.CharacteristicEnumConverter

class PostCallStateQueryRule extends QueryRule {

	new(Rule rule, String nameBase, CharacteristicEnumConverter characteristicEnumConverter) {
		super(rule, nameBase, characteristicEnumConverter)
	}

	override createParameterQuery(Expression stack, Expression parameter, Expression attribute, Expression value,
		Expression operation, Expression stateVariable) {
		CompoundTerm("postCallState", #[stack, operation, stateVariable, attribute, value])
	}

	override queryTypeIdentification() {
		"POST_CALL_STATE"
	}
	
	override parameterTerm() {
		CompoundTerm(callState)
	}

}
