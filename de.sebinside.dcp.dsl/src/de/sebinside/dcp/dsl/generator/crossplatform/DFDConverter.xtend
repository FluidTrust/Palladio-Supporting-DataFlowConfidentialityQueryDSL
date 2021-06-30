package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Literal
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.DFD2PrologTransformationTrace

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristicType
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedExternalActor
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedStore
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedNode

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
	
	def dispatch String convertCharacterizedNode(CharacterizedExternalActor actor) {'''«actor.name» («actor.id»)'''}
	def dispatch String convertCharacterizedNode(CharacterizedStore store) {'''«store.name» («store.id»)'''}
	def dispatch String convertCharacterizedNode(CharacterizedNode node) {throw new IllegalArgumentException("Unsupported node type selected!")}
	
	override convert(NodeIdentitiySelector selector) {
		if(selector.diaNode === null) {
			throw new IllegalArgumentException("Target model type and node selector are incompatible.")
		}
	
		AtomicQuotedString('''«trace.getFactId(selector.diaNode, null)»''')
		// hier problem da trace mit behaving noch zusätzlich einen pin benötigt
	}
	
	override createQualifiedName(NodeIdentitiySelector selector) {
		convertCharacterizedNode(selector.diaNode)
	}
	
	override resolveQualifiedName(String id, Boolean fullName) {
		var dfdId = trace.getDfdId(id)
		if(dfdId.isPresent) {
			dfdId.get
		} else {
			id
		}
	}
	
	override convertVariable(String id) {
		throw new UnsupportedOperationException("convert Var error")
	}
	
	override convertCharacteristicLiteral(String id) {
		throw new UnsupportedOperationException("convert CharacteristicLiteral error")
//		val result = trace.value.resolveIdentifier(id)
//
//		if (result.empty) {
//			id
//		} else {
//			if (result.get instanceof Literal) {
//				(result.get as Literal).name
//			} else {
//				id
//			}
//		}
	}
	
	override qualifiedNameResolvable(String id) {
//		trace.value.resolveSeffInstance(id).present || trace.value.resolveDataOperationInstance(id).present
		throw new UnsupportedOperationException("qualifiedNameResolvable error")		
	}
	
}