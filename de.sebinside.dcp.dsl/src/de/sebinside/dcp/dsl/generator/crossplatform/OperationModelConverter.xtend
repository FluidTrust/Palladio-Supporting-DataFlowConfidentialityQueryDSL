package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*

class OperationModelConverter implements Converter {

	package new() {
	}

	override convert(CharacteristicType characteristicType) {
		AtomicQuotedString(characteristicType.name)
	}
	
	override convertMember(CharacteristicType characteristicType) {
		this.convert(characteristicType)
	}

	override convert(EnumCharacteristicLiteral characteristicLiteral) {
		AtomicQuotedString(characteristicLiteral.entityName)
	}

	override convert(NodeIdentitiySelector selector) {
		if (selector.name === null) {
			throw new IllegalArgumentException("Use node.name-attribute with OperationModel target.")
		}
		return AtomicQuotedString(selector.name)
	}

	override convertVariable(String id) {
		id
	}
	
	override createQualifiedName(NodeIdentitiySelector selector) {
		selector.name
	}
	
	override resolveQualifiedName(String id, Boolean fullName) {
		id
	}
	
	override qualifiedNameResolvable(String id) {
		true
	}
	
	override convertCharacteristicLiteral(String id) {
		id
	}

}
