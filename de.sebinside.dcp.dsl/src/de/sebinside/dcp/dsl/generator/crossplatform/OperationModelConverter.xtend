package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral

import static de.sebinside.dcp.dsl.generator.PrologUtils.*
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector

class OperationModelConverter implements Converter {
	
	override convert(CharacteristicType characteristicType) {
		AtomicQuotedString(characteristicType.name)
	}
	
	override convert(EnumCharacteristicLiteral characteristicLiteral) {
		AtomicQuotedString(characteristicLiteral.entityName)
	}
	
	override convert(NodeIdentitiySelector selector) {
		if(selector.name === null) {
			throw new IllegalArgumentException("Use node.name-attribute with OperationModel target.")
		}
		return AtomicQuotedString(selector.name)
	}
	
}