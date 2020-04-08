package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral

import static de.sebinside.dcp.dsl.generator.PrologUtils.*
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import org.eclipse.xtext.EcoreUtil2

class PalladioConverter implements Converter {
	
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
	
	override convert(NodeIdentitiySelector selector) {
		if(selector.assembly === null) {
			throw new IllegalArgumentException("Use node.identity-attribute with DataCentricPalladio target.")
		}
		
		val assemblyID = selector.assembly.id
		val seffID = EcoreUtil2.getID(selector.seff)
		
		AtomicQuotedString('''ResourceDemandingSEFF («seffID») - AC «assemblyID»''')
	}
	
}