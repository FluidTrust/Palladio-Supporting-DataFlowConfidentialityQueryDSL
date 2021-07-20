/**
 * generated by Xtext 2.25.0
 */
package org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.pCMDFDConstraintLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.pCMDFDConstraintLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCMDFDConstraintLanguageFactoryImpl extends EFactoryImpl implements PCMDFDConstraintLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PCMDFDConstraintLanguageFactory init()
  {
    try
    {
      PCMDFDConstraintLanguageFactory thePCMDFDConstraintLanguageFactory = (PCMDFDConstraintLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(PCMDFDConstraintLanguagePackage.eNS_URI);
      if (thePCMDFDConstraintLanguageFactory != null)
      {
        return thePCMDFDConstraintLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PCMDFDConstraintLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCMDFDConstraintLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PCMDFDConstraintLanguagePackage.MODEL: return createModel();
      case PCMDFDConstraintLanguagePackage.TARGET_MODEL_TYPE_DEF: return createTargetModelTypeDef();
      case PCMDFDConstraintLanguagePackage.PROPERTY_SELECTOR: return createPropertySelector();
      case PCMDFDConstraintLanguagePackage.PROPERTY_CLASS_SELECTOR: return createPropertyClassSelector();
      case PCMDFDConstraintLanguagePackage.NODE_IDENTITIY_SELECTOR: return createNodeIdentitiySelector();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TargetModelTypeDef createTargetModelTypeDef()
  {
    TargetModelTypeDefImpl targetModelTypeDef = new TargetModelTypeDefImpl();
    return targetModelTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertySelector createPropertySelector()
  {
    PropertySelectorImpl propertySelector = new PropertySelectorImpl();
    return propertySelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyClassSelector createPropertyClassSelector()
  {
    PropertyClassSelectorImpl propertyClassSelector = new PropertyClassSelectorImpl();
    return propertyClassSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeIdentitiySelector createNodeIdentitiySelector()
  {
    NodeIdentitiySelectorImpl nodeIdentitiySelector = new NodeIdentitiySelectorImpl();
    return nodeIdentitiySelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PCMDFDConstraintLanguagePackage getPCMDFDConstraintLanguagePackage()
  {
    return (PCMDFDConstraintLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PCMDFDConstraintLanguagePackage getPackage()
  {
    return PCMDFDConstraintLanguagePackage.eINSTANCE;
  }

} //PCMDFDConstraintLanguageFactoryImpl