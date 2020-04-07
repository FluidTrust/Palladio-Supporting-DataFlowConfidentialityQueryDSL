package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.generator.crossplatform.NodeIdentityConverter
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector

import static de.sebinside.dcp.dsl.generator.PrologUtils.*

class OperationModelNodeIdentityConverter implements NodeIdentityConverter {
	
	override convert(NodeIdentitiySelector selector) {
		if(selector.name === null) {
			throw new IllegalArgumentException("Use node.name-attribute with OperationModel target.")
		}
		return AtomicQuotedString(selector.name)
	}
	
}