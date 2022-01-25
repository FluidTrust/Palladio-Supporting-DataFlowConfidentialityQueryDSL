package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.DFD2PrologTransformationTrace
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Literal

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*

class DFDConverter implements Converter {
	
	val DFD2PrologTransformationTrace trace
	
	new(DFD2PrologTransformationTrace trace) {
		this.trace = trace
	}
	
	override convert(CharacteristicType characteristicType) {
		var factId = trace.getFactId(characteristicType.ref)
		if(factId.isPresent) {
			AtomicQuotedString('''«factId.get»''')
		} else {
			throw new Exception("Unable to resolve CharacteristicType.")
		}
	}
	
	override convertMember(CharacteristicType characteristicType) {
		this.convert(characteristicType)
	}
	
	override convert(Literal characteristicLiteral) {
		var factId = trace.getFactId(characteristicLiteral)
		
		if(factId.isPresent) {
			AtomicQuotedString('''«factId.get»''')
		} else {
			throw new Exception("Unable to resolve Literal.")
		}
	}
	
	override convert(NodeIdentitiySelector selector) {
		if(selector.diaNode === null) {
			throw new IllegalArgumentException("Target model type and node selector are incompatible.")
		}
	
		#[AtomicQuotedString('''«trace.getFactId(selector.diaNode, null)»''')]
		// Problem as the DFD trace needs an additional pin in order to resolve this
	}
	
	override createQualifiedName(NodeIdentitiySelector selector) {
		selector.name
	}
	
	override resolveQualifiedName(String id, Boolean fullName) {
		id
//		var dfdId = trace.getDfdId(id)
//		if(dfdId.isPresent) {
//			dfdId.get
//		} else {
//			id
//		}
	}
	
	override convertVariable(String id) {
		id
		//throw new UnsupportedOperationException("convert Var error")
	}
	
	override convertCharacteristicLiteral(String id) {
		id
		//throw new UnsupportedOperationException("convert CharacteristicLiteral error")
	}
	
	override qualifiedNameResolvable(String id) {
		true
//		trace.value.resolveSeffInstance(id).present || trace.value.resolveDataOperationInstance(id).present
		//throw new UnsupportedOperationException("qualifiedNameResolvable error")		
	}
	
}