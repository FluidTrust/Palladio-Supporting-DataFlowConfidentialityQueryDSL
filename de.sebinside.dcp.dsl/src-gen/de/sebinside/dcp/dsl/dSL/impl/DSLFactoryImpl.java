/**
 * generated by Xtext 2.21.0
 */
package de.sebinside.dcp.dsl.dSL.impl;

import de.sebinside.dcp.dsl.dSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSLFactoryImpl extends EFactoryImpl implements DSLFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DSLFactory init()
  {
		try {
			DSLFactory theDSLFactory = (DSLFactory)EPackage.Registry.INSTANCE.getEFactory(DSLPackage.eNS_URI);
			if (theDSLFactory != null) {
				return theDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DSLFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DSLFactoryImpl()
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
		switch (eClass.getClassifierID()) {
			case DSLPackage.MODEL: return createModel();
			case DSLPackage.TARGET_MODEL_TYPE_DEF: return createTargetModelTypeDef();
			case DSLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
			case DSLPackage.CHARACTERISTIC_TYPE: return createCharacteristicType();
			case DSLPackage.CHARACTERISTIC_CLASS: return createCharacteristicClass();
			case DSLPackage.CHARACTERISTIC_TYPE_SELECTOR: return createCharacteristicTypeSelector();
			case DSLPackage.CHARACTERISTIC_VARIABLE_TYPE: return createCharacteristicVariableType();
			case DSLPackage.CHARACTERISTIC_VARIABLE: return createCharacteristicVariable();
			case DSLPackage.CHARACTERISTIC_SET: return createCharacteristicSet();
			case DSLPackage.INCLUDE: return createInclude();
			case DSLPackage.CONSTRAINT: return createConstraint();
			case DSLPackage.RULE: return createRule();
			case DSLPackage.DATA_SELECTOR: return createDataSelector();
			case DSLPackage.CHARACTERISTIC_SELECTOR: return createCharacteristicSelector();
			case DSLPackage.CHARACTERISTIC_CLASS_SELECTOR: return createCharacteristicClassSelector();
			case DSLPackage.ATTRIBUTE_SELECTOR: return createAttributeSelector();
			case DSLPackage.ATTRIBUTE_CLASS_SELECTOR: return createAttributeClassSelector();
			case DSLPackage.DESTINATION_SELECTOR: return createDestinationSelector();
			case DSLPackage.PROPERTY_SELECTOR: return createPropertySelector();
			case DSLPackage.PROPERTY_CLASS_SELECTOR: return createPropertyClassSelector();
			case DSLPackage.NODE_IDENTITIY_SELECTOR: return createNodeIdentitiySelector();
			case DSLPackage.STATEMENT: return createStatement();
			case DSLPackage.STATEMENT_TYPE: return createStatementType();
			case DSLPackage.STATEMENT_MODALITY: return createStatementModality();
			case DSLPackage.CONDITION: return createCondition();
			case DSLPackage.REFERENCE: return createReference();
			case DSLPackage.CHARACTERISTIC_REFERENCE: return createCharacteristicReference();
			case DSLPackage.CHARACTERISTIC_SET_REFERENCE: return createCharacteristicSetReference();
			case DSLPackage.OPERATION: return createOperation();
			case DSLPackage.BOOLEAN_OPERATION: return createBooleanOperation();
			case DSLPackage.CHARACTERISTSIC_SET_OPERATION: return createCharacteristsicSetOperation();
			case DSLPackage.LOGICAL_AND_OPERATION: return createLogicalAndOperation();
			case DSLPackage.LOGICAL_OR_OPERATION: return createLogicalOrOperation();
			case DSLPackage.LOGICAL_NEGATION_OPERATION: return createLogicalNegationOperation();
			case DSLPackage.VARIABLE_EQUALITY_OPERATION: return createVariableEqualityOperation();
			case DSLPackage.VARIABLE_INEQUALITY_OPERATION: return createVariableInequalityOperation();
			case DSLPackage.EMPTY_SET_OPERATION: return createEmptySetOperation();
			case DSLPackage.INTERSECTION_OPERATION: return createIntersectionOperation();
			case DSLPackage.CREATE_SET_OPERATION: return createCreateSetOperation();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case DSLPackage.TARGET_MODEL_TYPE:
				return createTargetModelTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case DSLPackage.TARGET_MODEL_TYPE:
				return convertTargetModelTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public AbstractElement createAbstractElement()
  {
		AbstractElementImpl abstractElement = new AbstractElementImpl();
		return abstractElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicType createCharacteristicType()
  {
		CharacteristicTypeImpl characteristicType = new CharacteristicTypeImpl();
		return characteristicType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicClass createCharacteristicClass()
  {
		CharacteristicClassImpl characteristicClass = new CharacteristicClassImpl();
		return characteristicClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicTypeSelector createCharacteristicTypeSelector()
  {
		CharacteristicTypeSelectorImpl characteristicTypeSelector = new CharacteristicTypeSelectorImpl();
		return characteristicTypeSelector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicVariableType createCharacteristicVariableType()
  {
		CharacteristicVariableTypeImpl characteristicVariableType = new CharacteristicVariableTypeImpl();
		return characteristicVariableType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicVariable createCharacteristicVariable()
  {
		CharacteristicVariableImpl characteristicVariable = new CharacteristicVariableImpl();
		return characteristicVariable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicSet createCharacteristicSet()
  {
		CharacteristicSetImpl characteristicSet = new CharacteristicSetImpl();
		return characteristicSet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Include createInclude()
  {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Constraint createConstraint()
  {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Rule createRule()
  {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public DataSelector createDataSelector()
  {
		DataSelectorImpl dataSelector = new DataSelectorImpl();
		return dataSelector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicSelector createCharacteristicSelector()
  {
		CharacteristicSelectorImpl characteristicSelector = new CharacteristicSelectorImpl();
		return characteristicSelector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicClassSelector createCharacteristicClassSelector()
  {
		CharacteristicClassSelectorImpl characteristicClassSelector = new CharacteristicClassSelectorImpl();
		return characteristicClassSelector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public AttributeSelector createAttributeSelector()
  {
		AttributeSelectorImpl attributeSelector = new AttributeSelectorImpl();
		return attributeSelector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public AttributeClassSelector createAttributeClassSelector()
  {
		AttributeClassSelectorImpl attributeClassSelector = new AttributeClassSelectorImpl();
		return attributeClassSelector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public DestinationSelector createDestinationSelector()
  {
		DestinationSelectorImpl destinationSelector = new DestinationSelectorImpl();
		return destinationSelector;
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
  public Statement createStatement()
  {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public StatementType createStatementType()
  {
		StatementTypeImpl statementType = new StatementTypeImpl();
		return statementType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public StatementModality createStatementModality()
  {
		StatementModalityImpl statementModality = new StatementModalityImpl();
		return statementModality;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Condition createCondition()
  {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Reference createReference()
  {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicReference createCharacteristicReference()
  {
		CharacteristicReferenceImpl characteristicReference = new CharacteristicReferenceImpl();
		return characteristicReference;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicSetReference createCharacteristicSetReference()
  {
		CharacteristicSetReferenceImpl characteristicSetReference = new CharacteristicSetReferenceImpl();
		return characteristicSetReference;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Operation createOperation()
  {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public BooleanOperation createBooleanOperation()
  {
		BooleanOperationImpl booleanOperation = new BooleanOperationImpl();
		return booleanOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristsicSetOperation createCharacteristsicSetOperation()
  {
		CharacteristsicSetOperationImpl characteristsicSetOperation = new CharacteristsicSetOperationImpl();
		return characteristsicSetOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public LogicalAndOperation createLogicalAndOperation()
  {
		LogicalAndOperationImpl logicalAndOperation = new LogicalAndOperationImpl();
		return logicalAndOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public LogicalOrOperation createLogicalOrOperation()
  {
		LogicalOrOperationImpl logicalOrOperation = new LogicalOrOperationImpl();
		return logicalOrOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public LogicalNegationOperation createLogicalNegationOperation()
  {
		LogicalNegationOperationImpl logicalNegationOperation = new LogicalNegationOperationImpl();
		return logicalNegationOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public VariableEqualityOperation createVariableEqualityOperation()
  {
		VariableEqualityOperationImpl variableEqualityOperation = new VariableEqualityOperationImpl();
		return variableEqualityOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public VariableInequalityOperation createVariableInequalityOperation()
  {
		VariableInequalityOperationImpl variableInequalityOperation = new VariableInequalityOperationImpl();
		return variableInequalityOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EmptySetOperation createEmptySetOperation()
  {
		EmptySetOperationImpl emptySetOperation = new EmptySetOperationImpl();
		return emptySetOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public IntersectionOperation createIntersectionOperation()
  {
		IntersectionOperationImpl intersectionOperation = new IntersectionOperationImpl();
		return intersectionOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CreateSetOperation createCreateSetOperation()
  {
		CreateSetOperationImpl createSetOperation = new CreateSetOperationImpl();
		return createSetOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TargetModelType createTargetModelTypeFromString(EDataType eDataType, String initialValue)
  {
		TargetModelType result = TargetModelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertTargetModelTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public DSLPackage getDSLPackage()
  {
		return (DSLPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static DSLPackage getPackage()
  {
		return DSLPackage.eINSTANCE;
	}

} //DSLFactoryImpl
