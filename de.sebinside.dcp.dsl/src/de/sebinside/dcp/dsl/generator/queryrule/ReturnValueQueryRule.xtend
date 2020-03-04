package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression
import static de.sebinside.dcp.dsl.generator.PrologUtils.*
import de.sebinside.dcp.dsl.generator.queryrule.QueryRule

class ReturnValueQueryRule extends QueryRule {

	new(Rule rule, String nameBase) {
		super(rule, nameBase)
	}

	override createParameterQuery(Expression stack, Expression parameter, Expression attribute,
		Expression value, Expression operation, Expression stateVariable) {
		CompoundTerm("returnValue", #[stack, parameter, attribute, value])
	}
	
	override queryTypeIdentification() {
		"RETURN_VALUE"
	}

}
