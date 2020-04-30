package de.sebinside.dcp.dsl.generator.crossplatform

import org.palladiosimulator.supporting.prolog.model.prolog.AtomicQuotedString
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral
import de.sebinside.dcp.dsl.dSL.CharacteristicType
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector

interface Converter {
	def AtomicQuotedString convert(CharacteristicType characteristicType)

	def AtomicQuotedString convert(EnumCharacteristicLiteral characteristicLiteral)

	def AtomicQuotedString convert(NodeIdentitiySelector selector)

	def String createQualifiedName(NodeIdentitiySelector selector)

	def String resolveQualifiedName(String id)

	def String convertVariable(String id)
}
