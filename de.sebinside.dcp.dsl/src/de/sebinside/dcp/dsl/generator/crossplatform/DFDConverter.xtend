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
		if (trace === null) {
			val name = characteristicType.ref.name
			val id = characteristicType.ref.id

			AtomicQuotedString('''EnumCharacteristicType «name» («id»)''')
		} else {
			var factId = trace.getFactId(characteristicType.ref)
			if(factId.isPresent) {
				AtomicQuotedString('''«factId.get»''')
			} else {
				throw new Exception("Unable to resolve CharacteristicType.")
			}
		}
	}
	
	override convertMember(CharacteristicType characteristicType) {
		if (trace === null && characteristicType.ref instanceof EnumCharacteristicType) {
			val enumType = characteristicType.ref as EnumCharacteristicType
			val name = enumType.type.name
			val id = enumType.type.id

			AtomicQuotedString('''Enumeration «name» («id»)''')
		} else {
			this.convert(characteristicType)
		}
	}
	
	override convert(Literal characteristicLiteral) {
		if (trace === null) {
			val content = characteristicLiteral.name
			val id = characteristicLiteral.id

			AtomicQuotedString('''Literal «content» («id»)''')
		} else {
			var factId = trace.getFactId(characteristicLiteral)
			
			if(factId.isPresent) {
				AtomicQuotedString('''«factId.get»''')
			} else {
				throw new Exception("Unable to resolve Literal.")
			}
		}
	}
	
	def dispatch String convertCharacterizedNode(CharacterizedExternalActor actor) {'''«actor.name» («actor.id»)'''}
	def dispatch String convertCharacterizedNode(CharacterizedStore store) {'''«store.name» («store.id»)'''}
	def dispatch String convertCharacterizedNode(CharacterizedNode node) {throw new IllegalArgumentException("Unsupported node type selected!")}
	
	override convert(NodeIdentitiySelector selector) {
		if(this.trace === null) {
			if(selector.diaNode === null) {
			throw new IllegalArgumentException("Target model type and node selector are incompatible.")
			}
		
			AtomicQuotedString(convertCharacterizedNode(selector.diaNode))
		} else {
			// hier problem da trace mit behaving noch zusätzlich einen pin benötigt
		}
	}
	
	override createQualifiedName(NodeIdentitiySelector selector) {
		convertCharacterizedNode(selector.diaNode)
	}
	
	override resolveQualifiedName(String id, Boolean fullName) {
		if(trace === null) {
			id 
			// ERROR: This is not technically correct!
		} else {
			var dfdId = trace.getDfdId(id)
			if(dfdId.isPresent) {
				dfdId.get
			} else {
				id
			}
		}
	}
	
	override convertVariable(String id) {
		if(trace === null) {
			id 
			// ERROR: This is not technically correct!
		} else {
			throw new UnsupportedOperationException("convert Var error")
		}
		
//		val result = trace.value.resolveVariable(id)
//
//		if (result.empty) {
//			id
//		} else {
//			val data = result.get.data
//
//			if (data instanceof ParameterBasedData) {
//				data.parameter.parameterName
//			} else {
//				data.entityName
//			}
//		}

	}
	
	override convertCharacteristicLiteral(String id) {
		if(trace === null) {
			id 
			// ERROR: This is not technically correct!
			// Calling this method without a trace will yield an incorrect result!
			// Qualified names in the DFD look like "name (id)" 
			// trace already contains the names correctly
		} else {
			throw new UnsupportedOperationException("convert CharacteristicLiteral error")
		}
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
		if(trace === null) {
			false 
			// ERROR: This is not technically correct!
			// Calling this method without a trace will yield an incorrect result!
		} else {
//		trace.value.resolveSeffInstance(id).present || trace.value.resolveDataOperationInstance(id).present
			throw new UnsupportedOperationException("qualifiedNameResolvable error")		
		}
	}
	
}