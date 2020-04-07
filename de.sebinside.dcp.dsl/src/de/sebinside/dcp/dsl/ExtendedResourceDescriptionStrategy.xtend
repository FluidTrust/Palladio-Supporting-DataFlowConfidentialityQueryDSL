package de.sebinside.dcp.dsl

import com.google.inject.Inject
import de.sebinside.dcp.dsl.dSL.Include
import de.sebinside.dcp.dsl.dSL.Model
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.scoping.impl.ImportUriResolver
import org.eclipse.xtext.util.IAcceptor
import org.palladiosimulator.pcm.allocation.Allocation
import org.palladiosimulator.pcm.allocation.AllocationPackage
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType
import org.palladiosimulator.pcm.usagemodel.UsageScenario
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage

class ExtendedResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	public static final String INCLUDES = "includes"

	@Inject
	ImportUriResolver uriResolver

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Model) {
			createEObjectDescriptionForModel(eObject, acceptor)
			return true
		} 
		
		if (eObject.eClass === CharacteristicsPackage.eINSTANCE.enumCharacteristicType) {
			createEObjectDescriptionForEnumCharacteristicType(eObject, acceptor)
			return false
		} 
		if (eObject.eClass === CharacteristicsPackage.eINSTANCE.characteristicTypeContainer) {
			createEObjectDescriptionForCharacteristicTypeContainer(eObject, acceptor)
			return true
		} 
		
		
		if (eObject.eClass === AllocationPackage.eINSTANCE.allocation) {
			createEObjectDescriptionForAllocation(eObject, acceptor)
			return false
		} 
		if (eObject.eClass === UsagemodelPackage.eINSTANCE.usageScenario) {
			createEObjectDescriptionForUsageScenario(eObject, acceptor)
			return false
		}
		
		super.createEObjectDescriptions(eObject, acceptor)
	}
	
	protected def createEObjectDescriptionForUsageScenario(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		val usageScenario = eObject as UsageScenario
		acceptor.accept(EObjectDescription.create(QualifiedName.create(usageScenario.id), usageScenario))
	}

	protected def createEObjectDescriptionForAllocation(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		val allocation = eObject as Allocation
		acceptor.accept(EObjectDescription.create(QualifiedName.create(allocation.id), allocation))
	}

	protected def createEObjectDescriptionForCharacteristicTypeContainer(EObject eObject,
		IAcceptor<IEObjectDescription> acceptor) {
		val typeContainer = eObject as CharacteristicTypeContainer
		acceptor.accept(EObjectDescription.create(QualifiedName.create(typeContainer.id), typeContainer));
	}

	def void createEObjectDescriptionForModel(Model model, IAcceptor<IEObjectDescription> acceptor) {
		val uris = newArrayList()
		model.elements.filter[element|element instanceof Include].forEach[uris.add(uriResolver.apply(it))]
		val userData = new HashMap<String, String>
		userData.put(INCLUDES, uris.join(","))
		acceptor.accept(EObjectDescription.create(QualifiedName.create(model.eResource.URI.toString), model, userData))
	}

	protected def void createEObjectDescriptionForEnumCharacteristicType(EObject eObject,
		IAcceptor<IEObjectDescription> acceptor) {
		val characteristicType = eObject as EnumCharacteristicType
		acceptor.accept(
			EObjectDescription.create(QualifiedName.create(characteristicType.entityName), characteristicType))
		for (literal : characteristicType.enum.literals) {
			acceptor.accept(
				EObjectDescription.create(QualifiedName.create(characteristicType.entityName, literal.entityName),
					literal))
		}
	}
}
