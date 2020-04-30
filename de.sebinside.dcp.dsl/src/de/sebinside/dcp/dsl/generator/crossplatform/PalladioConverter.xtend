package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import org.apache.commons.lang3.mutable.Mutable
import org.apache.commons.lang3.mutable.MutableObject
import org.eclipse.xtext.EcoreUtil2
import org.palladiosimulator.pcm.allocation.Allocation
import org.palladiosimulator.pcm.dataprocessing.analysis.transformation.basic.ITransformationTrace
import org.palladiosimulator.pcm.dataprocessing.analysis.transformation.basic.ITransformatorFactory
import org.palladiosimulator.pcm.dataprocessing.analysis.transformation.naming.impl.HumanReadableUniqueNameProvider
import org.palladiosimulator.pcm.dataprocessing.analysis.transformation.naming.wrappers.SEFFInstance
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF
import org.palladiosimulator.pcm.usagemodel.UsageModel

import static de.sebinside.dcp.dsl.generator.PrologUtils.*

class PalladioConverter implements Converter {

	Mutable<ITransformationTrace> trace = new MutableObject<ITransformationTrace>(null)

	package new(UsageModel usageModel, Allocation allocationModel, CharacteristicTypeContainer typeContainer) {
		val transformator = ITransformatorFactory.instance.create(null, new HumanReadableUniqueNameProvider())
		transformator.transform(usageModel, allocationModel, typeContainer, trace)
	}

	package new() {
	}

	override convert(CharacteristicType characteristicType) {
		if (trace.value === null) {
			val name = characteristicType.ref.entityName
			val id = characteristicType.ref.id

			AtomicQuotedString('''EnumCharacteristicType «name» («id»)''')
		} else {
			val computedValue = trace.value.resolveId(characteristicType.ref)

			if (computedValue.present) {
				AtomicQuotedString(computedValue.get)
			} else {
				throw new Exception("Unable to resolve CharacteristicType id.")
			}
		}
	}

	override convert(EnumCharacteristicLiteral characteristicLiteral) {
		if (trace.value === null) {
			val content = characteristicLiteral.entityName
			val id = characteristicLiteral.id

			AtomicQuotedString('''EnumCharacteristicLiteral «content» («id»)''')
		} else {
			val computedValue = trace.value.resolveId(characteristicLiteral)

			if (computedValue.present) {
				AtomicQuotedString(computedValue.get)
			} else {
				throw new Exception("Unable to resolve EnumCharacteristicLiteral id.")
			}
		}
	}

	override convert(NodeIdentitiySelector selector) {
		if (trace.value === null) {
			if (selector.assembly === null) {
				throw new IllegalArgumentException("Use node.identity-attribute with DataCentricPalladio target.")
			}

			val assemblyID = selector.assembly.id
			val seffID = EcoreUtil2.getID(selector.seff)

			AtomicQuotedString('''ResourceDemandingSEFF («seffID») - AC «assemblyID»''')
		} else {
			if (selector.seff instanceof ResourceDemandingSEFF) {
				val seffInstance = SEFFInstance.createInstance(selector.assembly,
					selector.seff as ResourceDemandingSEFF);

				val computedValue = trace.value.resolveId(seffInstance)

				if (computedValue.present) {
					AtomicQuotedString(computedValue.get)

				} else {
					throw new Exception("Unable to resolve SEFF id.")
				}
			} else {
				throw new Exception("Unable to resolve SEFF instance.")
			}
		}
	}

	override createQualifiedName(NodeIdentitiySelector selector) {
		'''«selector.assembly.entityName».«selector.component.entityName».«selector.seff.describedService__SEFF.entityName»'''
	}

	override convertVariable(String id) {
		val result = trace.value.resolveVariable(id)

		if (result.empty) {
			id
		} else {
			// TODO: Add processing here
			result.get.toString
		}
	}

	override resolveQualifiedName(String id) {
		// TODO: Add processing here (multiple cases)
		val result = trace.value.resolveIdentifier(id)

		if (result.empty) {
			id
		} else {
			// TODO: Change result type to be also optional
			result.get.toString
		}
	}

}
