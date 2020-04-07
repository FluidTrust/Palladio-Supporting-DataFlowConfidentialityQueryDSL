package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import org.palladiosimulator.supporting.prolog.model.prolog.AtomicQuotedString

interface NodeIdentityConverter {
	def AtomicQuotedString convert(NodeIdentitiySelector selector)
}
