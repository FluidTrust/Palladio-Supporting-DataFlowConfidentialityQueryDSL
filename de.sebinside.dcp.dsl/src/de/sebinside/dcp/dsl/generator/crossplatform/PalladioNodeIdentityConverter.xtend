package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.generator.crossplatform.NodeIdentityConverter
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector

import static de.sebinside.dcp.dsl.generator.PrologUtils.*
import org.eclipse.xtext.EcoreUtil2

class PalladioNodeIdentityConverter implements NodeIdentityConverter {
	
	override convert(NodeIdentitiySelector selector) {
		if(selector.assembly === null) {
			throw new IllegalArgumentException("Use node.identity-attribute with DataCentricPalladio target.")
		}
		
		val assemblyID = selector.assembly.id
		val seffID = EcoreUtil2.getID(selector.seff)
		
		AtomicQuotedString('''ResourceDemandingSEFF («seffID») - AC «assemblyID»''')
	}
	
}