/**
 * generated by Xtext 2.21.0
 */
package de.sebinside.dcp.dsl.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Set Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.CharacteristicSetReference#getValue <em>Value</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.CharacteristicSetReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicSetReference()
 * @model
 * @generated
 */
public interface CharacteristicSetReference extends Reference
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(CharacteristicSet)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicSetReference_Value()
   * @model
   * @generated
   */
  CharacteristicSet getValue();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.CharacteristicSetReference#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(CharacteristicSet value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(CharacteristsicSetOperation)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicSetReference_Ref()
   * @model containment="true"
   * @generated
   */
  CharacteristsicSetOperation getRef();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.CharacteristicSetReference#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(CharacteristsicSetOperation value);

} // CharacteristicSetReference