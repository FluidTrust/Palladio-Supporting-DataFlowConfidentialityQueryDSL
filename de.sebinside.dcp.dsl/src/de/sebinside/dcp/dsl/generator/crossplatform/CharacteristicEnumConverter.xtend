package de.sebinside.dcp.dsl.generator.crossplatform

import org.palladiosimulator.supporting.prolog.model.prolog.AtomicQuotedString
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral
import de.sebinside.dcp.dsl.dSL.CharacteristicType

interface CharacteristicEnumConverter {
	def AtomicQuotedString convert(CharacteristicType characteristicType)
	def AtomicQuotedString convert(EnumCharacteristicLiteral characteristicLiteral)
}