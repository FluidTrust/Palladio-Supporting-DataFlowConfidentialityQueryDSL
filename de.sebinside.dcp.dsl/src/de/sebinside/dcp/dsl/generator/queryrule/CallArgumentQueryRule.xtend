package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression
import static de.sebinside.dcp.dsl.generator.PrologUtils.*
import de.sebinside.dcp.dsl.generator.queryrule.QueryRule
import de.sebinside.dcp.dsl.generator.crossplatform.Converter

class CallArgumentQueryRule extends QueryRule {
	new(Rule rule, String nameBase, Converter converter) {
		super(rule, nameBase, converter)
	}

	override createParameterQuery(Expression stack, Expression parameter, Expression attribute,
		Expression value, Expression operation, Expression stateVariable) {
		CompoundTerm("callArgument", #[stack, parameter, attribute, value])
	}
	
	override queryTypeIdentification() {
		"CALL_ARGUMENT"
	}
	
	override parameterTerm() {
		CompoundTerm(parameter)
	}

}