/**
 * generated by Xtext 2.25.0
 */
package de.sebinside.dcp.dsl.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Or Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.LogicalOrOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.LogicalOrOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getLogicalOrOperation()
 * @model
 * @generated
 */
public interface LogicalOrOperation extends BooleanOperation
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(BooleanOperation)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getLogicalOrOperation_Left()
   * @model containment="true"
   * @generated
   */
  BooleanOperation getLeft();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.LogicalOrOperation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BooleanOperation value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BooleanOperation)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getLogicalOrOperation_Right()
   * @model containment="true"
   * @generated
   */
  BooleanOperation getRight();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.LogicalOrOperation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BooleanOperation value);

} // LogicalOrOperation
