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
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType

class CharacteristicsResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	
	public static final String INCLUDES = "includes"
	
	@Inject
	ImportUriResolver uriResolver

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if(eObject instanceof Model) {
			createEObjectDescriptionForModel(eObject, acceptor)
			return true
		}
		if (eObject.eClass === CharacteristicsPackage.eINSTANCE.enumCharacteristicType) {
			createEObjectDescriptionForEnumCharacteristicType(eObject, acceptor)
			return false
		}
		super.createEObjectDescriptions(eObject, acceptor)
	}

	def void createEObjectDescriptionForModel(Model model, IAcceptor<IEObjectDescription> acceptor) {
		val uris = newArrayList()
		model.elements.filter[element|element instanceof Include].forEach[uris.add(uriResolver.apply(it))]
		val userData = new HashMap<String,String>
		userData.put(INCLUDES, uris.join(","))
		acceptor.accept(EObjectDescription.create(QualifiedName.create(model.eResource.URI.toString), model, userData))
	}
	
	protected def void createEObjectDescriptionForEnumCharacteristicType(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		val characteristicType = eObject as EnumCharacteristicType
		acceptor.accept(EObjectDescription.create(QualifiedName.create(characteristicType.entityName), characteristicType))
		for (literal : characteristicType.enum.literals) {
			acceptor.accept(EObjectDescription.create(QualifiedName.create(characteristicType.entityName, literal.entityName), literal))
		}
	}
}