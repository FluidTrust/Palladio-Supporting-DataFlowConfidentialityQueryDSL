package de.sebinside.dcp.dsl

import com.google.inject.Inject
import de.sebinside.dcp.dsl.dSL.Include
import de.sebinside.dcp.dsl.dSL.Model
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.scoping.impl.ImportUriResolver
import org.eclipse.xtext.util.IAcceptor
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterized
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterizedPackage
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristicType

class ExtendedResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	public static final String INCLUDES = "includes"

	@Inject
	ImportUriResolver uriResolver

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Model) {
			createEObjectDescriptionForModel(eObject, acceptor)
			return true
		}

		if (eObject.eClass === DataDictionaryCharacterizedPackage.eINSTANCE.enumCharacteristicType) {
			createEObjectDescriptionForEnumCharacteristicType(eObject, acceptor)
			return false
		}
		if (eObject.eClass === DataDictionaryCharacterizedPackage.eINSTANCE.dataDictionaryCharacterized) {
			createEObjectDescriptionForCharacteristicTypeContainer(eObject, acceptor)
			return true
		}

		super.createEObjectDescriptions(eObject, acceptor)
	}

	protected def createEObjectDescriptionForCharacteristicTypeContainer(EObject eObject,
		IAcceptor<IEObjectDescription> acceptor) {
		val typeContainer = eObject as DataDictionaryCharacterized
		acceptor.accept(
			EObjectDescription.create(QualifiedName.create(getEResourceFileName(typeContainer.eResource)),
				typeContainer));
	}

	private def getEResourceFileName(Resource eResource) {
		eResource.URI.lastSegment.substring(0, eResource.URI.lastSegment.lastIndexOf("."))
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
			EObjectDescription.create(QualifiedName.create(characteristicType.name), characteristicType))
		for (literal : characteristicType.type.literals) {
			acceptor.accept(
				EObjectDescription.create(QualifiedName.create(characteristicType.name, literal.name),
					literal))
		}
	}
}
