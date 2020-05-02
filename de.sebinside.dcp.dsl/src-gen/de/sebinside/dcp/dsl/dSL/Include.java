/**
 * generated by Xtext 2.21.0
 */
package de.sebinside.dcp.dsl.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.Include#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends AbstractElement
{
  /**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getInclude_ImportURI()
	 * @model
	 * @generated
	 */
  String getImportURI();

  /**
	 * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.Include#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
  void setImportURI(String value);

} // Include
