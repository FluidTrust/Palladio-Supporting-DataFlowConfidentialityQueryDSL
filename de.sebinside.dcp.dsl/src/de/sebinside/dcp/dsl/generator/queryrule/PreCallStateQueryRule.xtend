package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.PrologUtils.*
import de.sebinside.dcp.dsl.generator.crossplatform.CharacteristicEnumConverter

class PreCallStateQueryRule extends QueryRule {

	new(Rule rule, String nameBase, CharacteristicEnumConverter characteristicEnumConverter) {
		super(rule, nameBase, characteristicEnumConverter)
	}

	override createParameterQuery(Expression stack, Expression parameter, Expression attribute, Expression value,
		Expression operation, Expression stateVariable) {
		CompoundTerm("preCallState", #[stack, operation, stateVariable, attribute, value])
	}

	override queryTypeIdentification() {
		"PRE_CALL_STATE"
	}
	
	override parameterTerm() {
		CompoundTerm(callState)
	}

}
