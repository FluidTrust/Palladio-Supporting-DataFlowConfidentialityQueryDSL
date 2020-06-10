package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.generator.GlobalConstants.QueryTypes
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

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType

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
			if(characteristicType.ref instanceof EnumCharacteristicType) {
				val enumType = characteristicType.ref as EnumCharacteristicType
				val name = enumType.enum.entityName
				val id = enumType.enum.id
				
				AtomicQuotedString('''Enumeration «name» («id»)''')
			} else {
				val name = characteristicType.ref.entityName
				val id = characteristicType.ref.id

				AtomicQuotedString('''EnumCharacteristicType «name» («id»)''')
			}
			
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
			val data = result.get.data
			
			if(data instanceof ParameterBasedData) {
				data.parameter.parameterName
			} else {
				data.entityName
			}
		}
	}

	override resolveQualifiedName(String id, Boolean fullName) {

		val seff = trace.value.resolveSeffInstance(id)
		val operation = trace.value.resolveDataOperationInstance(id)

		if (seff.present) {
			val seffName = seff.get.entity.describedService__SEFF.entityName
			val componentName = seff.get.entity.basicComponent_ServiceEffectSpecification.entityName
			val contextName = seff.get.ac.entityName
			
			if (fullName) {
				'''«contextName».«componentName».«seffName»'''
			} else {
				seffName
			}		
		} else if (operation.present) {
			operation.get.entity.entityName
		} else {
			id
		}
	}

	override convertQueryType(QueryTypes queryType, String variableId) {
		val variable = trace.value.resolveVariable(variableId)

		if (variable.empty) {
			Converter.super.convertQueryType(queryType, variableId)
		} else {
			switch (variable.get.purpose) {
				case PARAMETER: {
					"call argument"
				}
				case RETURN: {
					"return value"
				}
				case STATE: {
					"parameter"
				}
			}
		}
	}

	override qualifiedNameResolvable(String id) {
		trace.value.resolveSeffInstance(id).present || trace.value.resolveDataOperationInstance(id).present
	}
	
	override convertCharacteristicLiteral(String id) {
		val result = trace.value.resolveIdentifier(id)

		if (result.empty) {
			id
		} else {
			if(result.get instanceof EnumCharacteristicLiteral) {
				(result.get as EnumCharacteristicLiteral).entityName
			} else {
				id
			}
		}
	}

}
