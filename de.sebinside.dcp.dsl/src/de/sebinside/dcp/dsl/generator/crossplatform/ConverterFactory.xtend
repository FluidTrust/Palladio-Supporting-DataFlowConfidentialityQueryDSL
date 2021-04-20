package de.sebinside.dcp.dsl.generator.crossplatform

import org.palladiosimulator.pcm.usagemodel.UsageModel
import org.palladiosimulator.pcm.allocation.Allocation
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterized
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.DFD2PrologTransformationTrace

class ConverterFactory {

	static def Converter createOperationModelConverter() {
		new OperationModelConverter
	}

	static def Converter createPalladioConverter() {
		//new PalladioConverter
	}

	static def Converter createPalladioConverter(UsageModel usageModel, Allocation allocationModel,
		DataDictionaryCharacterized typeContainer) {
		//new PalladioConverter(usageModel, allocationModel, typeContainer)
	}
	
	static def Converter createExtendedDFDConverter(DFD2PrologTransformationTrace trace) {
		new DFDConverter(trace);
	}

}
