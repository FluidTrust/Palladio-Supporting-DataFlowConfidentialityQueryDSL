package org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.converter

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import org.palladiosimulator.dataflow.confidentiality.pcm.workflow.TransitiveTransformationTrace
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Literal

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import de.sebinside.dcp.dsl.generator.crossplatform.DFDConverter

class PCMDFDConverter extends DFDConverter {
	
	val TransitiveTransformationTrace trace

	new(TransitiveTransformationTrace trace) {
		super(null)
		this.trace = trace
	}

	override convert(CharacteristicType characteristicType) {
		val refType = characteristicType.ref
		var id = trace.getFactId([ct | ct.id == refType.id && ct.name == refType.name]).findFirst[true]
		if(id === null) {
			throw new Exception("Unable to resolve CharacteristicType id.")
		} else {
			AtomicQuotedString('''«id»''')
		}
	}

	override convertMember(CharacteristicType characteristicType) {
		this.convert(characteristicType)
	}

	override convert(Literal characteristicLiteral) {
		var id  = trace.getLiteralFactIds(characteristicLiteral).findFirst[true]
		if(id === null) {
			throw new Exception("Unable to resolve Literal id.")
		} else {
			AtomicQuotedString('''«id»''')
		}
	}

	override convert(NodeIdentitiySelector selector) {
		if(selector instanceof org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.pCMDFDConstraintLanguage.NodeIdentitiySelector) {
			// hier fehler! -> implementiere ähnliche funktion, die eine Liste mit verschiedenen Ids zurückgibt, die dann im query verODERT werden
			throw new UnsupportedOperationException("This needs to be implemented depending on the selected component!!")
		} else {
			throw new Exception("Unable to resolve native dfd node identity selector.")
		}
	}

	override convertVariable(String id) {
		id
		//throw new Exception("Unable to resolve Variable.")
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
		selector.name
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override resolveQualifiedName(String id, Boolean fullName) {
		id
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override convertCharacteristicLiteral(String id) {
		id
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override qualifiedNameResolvable(String id) {
		true
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}
