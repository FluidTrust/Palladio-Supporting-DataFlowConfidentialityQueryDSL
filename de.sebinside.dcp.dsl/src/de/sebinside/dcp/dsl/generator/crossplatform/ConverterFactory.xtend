package de.sebinside.dcp.dsl.generator.crossplatform

import org.palladiosimulator.pcm.usagemodel.UsageModel
import org.palladiosimulator.pcm.allocation.Allocation
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer

class ConverterFactory {

	static def Converter createOperationModelConverter() {
		new OperationModelConverter
	}

	static def Converter createPalladioConverter() {
		new PalladioConverter
	}

	static def Converter createPalladioConverter(UsageModel usageModel, Allocation allocationModel,
		CharacteristicTypeContainer typeContainer) {
		new PalladioConverter(usageModel, allocationModel, typeContainer)
	}

}
