package org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.converter

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import org.palladiosimulator.dataflow.confidentiality.pcm.workflow.TransitiveTransformationTrace
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Literal

//import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*

class PCMDFDConverter implements Converter {
	
	val TransitiveTransformationTrace trace

	new(TransitiveTransformationTrace trace) {
		this.trace = trace
	}

	override convert(CharacteristicType characteristicType) {
		throw new Exception("Unable to resolve CharacteristicType id.")
//		if (trace.value === null) {
//			val name = characteristicType.ref.name
//			val id = characteristicType.ref.id
//
//			AtomicQuotedString('''EnumCharacteristicType name (id)''')
//		} else {
//			val computedValue = trace.value.resolveId(characteristicType.ref)
//
//			if (computedValue.present) {
//				AtomicQuotedString(computedValue.get)
//			} else {
//				throw new Exception("Unable to resolve CharacteristicType id.")
//			}
//		}
	}

	override convertMember(CharacteristicType characteristicType) {
		throw new Exception("Unable to resolve CharacteristicType.")
//		if (trace.value === null && characteristicType.ref instanceof EnumCharacteristicType) {
//			val enumType = characteristicType.ref as EnumCharacteristicType
//			val name = enumType.type.name
//			val id = enumType.type.id
//
//			AtomicQuotedString('''Enumeration name (id)''')
//		} else {
//			this.convert(characteristicType)
//		}
	}

	override convert(Literal characteristicLiteral) {
		throw new Exception("Unable to resolve Literal id.")
//		if (trace.value === null) {
//			val content = characteristicLiteral.name
//			val id = characteristicLiteral.id
//
//			AtomicQuotedString('''Literal content (id)''')
//		} else {
//			val computedValue = trace.value.resolveId(characteristicLiteral)
//
//			if (computedValue.present) {
//				AtomicQuotedString(computedValue.get)
//			} else {
//				throw new Exception("Unable to resolve Literal id.")
//			}
//		}
	}

	override convert(NodeIdentitiySelector selector) {
		throw new Exception("Unable to resolve node identity selector.")
//		if (trace.value === null) {
//			if (selector.assembly === null) {
//				throw new IllegalArgumentException("Use node.identity-attribute with DataCentricPalladio target.")
//			}
//
//			val assemblyID = selector.assembly.id
//			val seffID = EcoreUtil2.getID(selector.seff)
//
//			AtomicQuotedString('''ResourceDemandingSEFF (seffID) - AC assemblyID''')
//		} else {
//			if (selector.seff instanceof ResourceDemandingSEFF) {
//				val seffInstance = SEFFInstance.createInstance(selector.assembly,
//					selector.seff as ResourceDemandingSEFF);
//
//				val computedValue = trace.value.resolveId(seffInstance)
//
//				if (computedValue.present) {
//					AtomicQuotedString(computedValue.get)
//
//				} else {
//					throw new Exception("Unable to resolve SEFF id.")
//				}
//			} else {
//				throw new Exception("Unable to resolve SEFF instance.")
//			}
//		}
	}

	override convertVariable(String id) {
		throw new Exception("Unable to resolve Variable.")
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
	
	override createQualifiedName(NodeIdentitiySelector selector) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override resolveQualifiedName(String id, Boolean fullName) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override convertCharacteristicLiteral(String id) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override qualifiedNameResolvable(String id) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}
