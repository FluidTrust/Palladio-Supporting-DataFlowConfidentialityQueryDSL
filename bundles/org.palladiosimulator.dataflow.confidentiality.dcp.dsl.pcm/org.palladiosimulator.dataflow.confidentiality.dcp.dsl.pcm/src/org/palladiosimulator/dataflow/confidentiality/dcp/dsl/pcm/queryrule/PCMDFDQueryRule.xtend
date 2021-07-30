package org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.queryrule

import de.sebinside.dcp.dsl.generator.queryrule.QueryRule
import de.sebinside.dcp.dsl.dSL.Rule

import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.converter.PCMDFDConverter
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.pCMDFDConstraintLanguage.NodeIdentitiySelector

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*

abstract class PCMDFDQueryRule extends QueryRule {
	
	var PCMDFDConverter pcmDFDConverter
	
	new(Rule rule, String nameBase, PCMDFDConverter converter) {
		super(rule, nameBase, converter)
		pcmDFDConverter = converter
	}
	
	def dispatch generateDestinationSelectorTerm(NodeIdentitiySelector selector) {
		// TODO: This needs to be properly implemented
		// node can be actor(selector), store(selector), process(selector)
		// -> each of the three in disjunction?
		// Create a disjunction in either converter or here
		// When realized in converter, this class can be removed
		// BUT 'convert' then must return a string representation of a disjunction,
		// this is rather ugly, as at this point the prolog expression classes are used and 
		// converted to String later on
		val unification = Unification(CompoundTerm(node), pcmDFDConverter.convert(selector))

		#[unification]
	}
}
