package org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.queryrule

import de.sebinside.dcp.dsl.dSL.Rule
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import de.sebinside.dcp.dsl.generator.GlobalConstants
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.converter.PCMDFDConverter

class PCMDFDInputPinQueryRule extends PCMDFDQueryRule {
	
	new(Rule rule, String nameBase, PCMDFDConverter converter) {
		super(rule, nameBase, converter)
	}

	override queryTypeIdentification() {
		'''«GlobalConstants.QueryTypes.INPUT_PIN»'''
	}
	
	override createPinLocationQuery(Expression node, Expression pin) {
		CompoundTerm(GlobalConstants.QueryTypes.INPUT_PIN.prolog, #[node, pin])
	}
}
