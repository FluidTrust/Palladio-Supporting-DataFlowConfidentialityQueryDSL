package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import de.sebinside.dcp.dsl.generator.GlobalConstants

class PostCallStateQueryRule extends QueryRule {

	new(Rule rule, String nameBase, Converter converter) {
		super(rule, nameBase, converter)
	}

	override createParameterQuery(Expression stack, Expression parameter, Expression attribute, Expression value,
		Expression operation, Expression stateVariable) {
		CompoundTerm("postCallState", #[stack, operation, stateVariable, attribute, value])
	}

	override queryTypeIdentification() {
		'''«GlobalConstants.QueryTypes.POST_CALL_STATE»'''
	}
	
	override parameterTerm() {
		CompoundTerm(callState)
	}

}
