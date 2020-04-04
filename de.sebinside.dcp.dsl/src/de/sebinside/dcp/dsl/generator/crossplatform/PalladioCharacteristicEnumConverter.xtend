package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral

import static de.sebinside.dcp.dsl.generator.PrologUtils.*

class PalladioCharacteristicEnumConverter implements CharacteristicEnumConverter {
	
	override convert(CharacteristicType characteristicType) {
		val name = characteristicType.ref.entityName
		val id = characteristicType.ref.id
		
		AtomicQuotedString('''EnumCharacteristicType «name» («id»)''')
	}
	
	override convert(EnumCharacteristicLiteral characteristicLiteral) {
		val content = characteristicLiteral.entityName
		val id = characteristicLiteral.id
		
		AtomicQuotedString('''EnumCharacteristicLiteral «content» («id»)''')
	}
	
}