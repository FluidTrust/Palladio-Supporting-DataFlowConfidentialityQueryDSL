package de.sebinside.dcp.dsl.generator.queryrule

import de.sebinside.dcp.dsl.dSL.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import static de.sebinside.dcp.dsl.generator.util.DSLGeneratorUtils.*
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import de.sebinside.dcp.dsl.generator.GlobalConstants

class InputPinQueryRule extends QueryRule {

	new(Rule rule, String nameBase, Converter converter) {
		super(rule, nameBase, converter)
	}

	override queryTypeIdentification() {
		'''«GlobalConstants.QueryTypes.INPUT_PIN»'''
	}
	
	override createPinLocationQuery(Expression node, Expression pin) {
		CompoundTerm("inputPin", #[node, pin])
	}
	
}