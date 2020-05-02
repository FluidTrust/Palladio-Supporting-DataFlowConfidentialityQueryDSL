/**
 * generated by Xtext 2.21.0
 */
package de.sebinside.dcp.dsl.dSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Type Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector#getRef <em>Ref</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector#isNegated <em>Negated</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector#getLiterals <em>Literals</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector#isIsVariableSelector <em>Is Variable Selector</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicTypeSelector()
 * @model
 * @generated
 */
public interface CharacteristicTypeSelector extends EObject
{
  /**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(CharacteristicType)
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicTypeSelector_Ref()
	 * @model
	 * @generated
	 */
  CharacteristicType getRef();

  /**
	 * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
  void setRef(CharacteristicType value);

  /**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(boolean)
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicTypeSelector_Negated()
	 * @model
	 * @generated
	 */
  boolean isNegated();

  /**
	 * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
  void setNegated(boolean value);

  /**
	 * Returns the value of the '<em><b>Literals</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' reference list.
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicTypeSelector_Literals()
	 * @model
	 * @generated
	 */
  EList<EnumCharacteristicLiteral> getLiterals();

  /**
	 * Returns the value of the '<em><b>Is Variable Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Variable Selector</em>' attribute.
	 * @see #setIsVariableSelector(boolean)
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicTypeSelector_IsVariableSelector()
	 * @model
	 * @generated
	 */
  boolean isIsVariableSelector();

  /**
	 * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector#isIsVariableSelector <em>Is Variable Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Variable Selector</em>' attribute.
	 * @see #isIsVariableSelector()
	 * @generated
	 */
  void setIsVariableSelector(boolean value);

  /**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(CharacteristicVariable)
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicTypeSelector_Variable()
	 * @model containment="true"
	 * @generated
	 */
  CharacteristicVariable getVariable();

  /**
	 * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
  void setVariable(CharacteristicVariable value);

} // CharacteristicTypeSelector
