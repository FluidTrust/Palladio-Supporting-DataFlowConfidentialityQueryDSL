package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import de.sebinside.dcp.dsl.generator.GlobalConstants

class OutputPinQueryRule extends QueryRule {

	new(Rule rule, String nameBase, Converter converter) {
		super(rule, nameBase, converter)
	}

	override queryTypeIdentification() {
		'''«GlobalConstants.QueryTypes.OUTPUT_PIN»'''
	}
	
	override createPinLocationQuery(Expression node, Expression pin) {
		CompoundTerm(GlobalConstants.QueryTypes.OUTPUT_PIN.prolog, #[node, pin])
	}

}
