/*
 * generated by Xtext 2.24.0
 */
package org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.CharacteristicType;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristicType;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Enumeration;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Literal;

import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector;
import de.sebinside.dcp.dsl.dSL.DSLPackage;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class PCMDFDConstraintLanguageScopeProvider extends AbstractPCMDFDConstraintLanguageScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		

		if (context instanceof CharacteristicTypeSelector
				&& reference == DSLPackage.Literals.CHARACTERISTIC_TYPE_SELECTOR__LITERALS) {

			CharacteristicType type = ((CharacteristicTypeSelector) context).getRef().getRef();

			// Assumption: The DSL is intended to only work with EnumCharacteristicType
			if (type instanceof EnumCharacteristicType) {
				EnumCharacteristicType enumType = (EnumCharacteristicType) type;
				Enumeration literalEnumeration = enumType.getType();

				// This is the case if the characteristic type is invalid referenced
				if (literalEnumeration != null) {
					List<Literal> literals = literalEnumeration.getLiterals();

					IScope scope = Scopes.scopeFor(literals, literal -> QualifiedName.create(literal.getName()),
							IScope.NULLSCOPE);

					return scope;
				}
			}
			return super.getScope(context, reference);
		}

//		if (context instanceof NodeIdentitiySelector
//				&& reference == DSLPackage.Literals.NODE_IDENTITIY_SELECTOR__COMPONENT) {
//
//			AssemblyContext assemblyContext = ((NodeIdentitiySelector) context).getAssembly();
//			RepositoryComponent repositoryComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();
//			
//			// Assumption: The DSL is intended to only work with BasicComponents
//			if (repositoryComponent instanceof BasicComponent) {
//				BasicComponent component = (BasicComponent) repositoryComponent;
//				List<BasicComponent> componentList = new ArrayList<BasicComponent>();
//				componentList.add(component);
//
//				return Scopes.scopeFor(componentList, c -> QualifiedName.create(c.getEntityName()), IScope.NULLSCOPE);
//			}
//			return super.getScope(context, reference);
//		}
		
//		if (context instanceof NodeIdentitiySelector
//				&& reference == DSLPackage.Literals.NODE_IDENTITIY_SELECTOR__STORE) {
//
//			AssemblyContext assemblyContext = ((NodeIdentitiySelector) context).getAssembly();
//			RepositoryComponent repositoryComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();
//			
//			// Assumption: The DSL is intended to only work with BasicComponents
//			if (repositoryComponent instanceof OperationalDataStoreComponent) {
//				OperationalDataStoreComponent component = (OperationalDataStoreComponent) repositoryComponent;
//				List<OperationalDataStoreComponent> componentList = new ArrayList<OperationalDataStoreComponent>();
//				componentList.add(component);
//
//				return Scopes.scopeFor(componentList, c -> QualifiedName.create(c.getEntityName()), IScope.NULLSCOPE);
//			}
//			return super.getScope(context, reference);
//		}
		
//		if (context instanceof NodeIdentitiySelector
//				&& reference == DSLPackage.Literals.NODE_IDENTITIY_SELECTOR__SIGNATURE) {
//
//			BasicComponent component = ((NodeIdentitiySelector) context).getComponent();
//
//			// This is the case if the component is invalid referenced
//			if (component != null) {
//				List<ServiceEffectSpecification> seffs = component.getServiceEffectSpecifications__BasicComponent();
//
//				return Scopes.scopeFor(seffs,
//						seff -> QualifiedName.create(seff.getDescribedService__SEFF().getEntityName()),
//						IScope.NULLSCOPE);
//			}
//		}

		return super.getScope(context, reference);
	}
}
