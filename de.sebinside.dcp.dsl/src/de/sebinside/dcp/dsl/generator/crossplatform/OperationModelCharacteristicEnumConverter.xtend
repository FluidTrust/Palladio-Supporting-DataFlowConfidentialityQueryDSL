package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral

import static de.sebinside.dcp.dsl.generator.PrologUtils.*

class OperationModelCharacteristicEnumConverter implements CharacteristicEnumConverter {
	
	override convert(CharacteristicType characteristicType) {
		AtomicQuotedString(characteristicType.name)
	}
	
	override convert(EnumCharacteristicLiteral characteristicLiteral) {
		AtomicQuotedString(characteristicLiteral.entityName)
	}
	
}