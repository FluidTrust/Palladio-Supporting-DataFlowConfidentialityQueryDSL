/**
 * generated by Xtext 2.25.0
 */
package de.sebinside.dcp.dsl.dSL.impl;

import de.sebinside.dcp.dsl.dSL.DSLPackage;
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Identitiy Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.impl.NodeIdentitiySelectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.impl.NodeIdentitiySelectorImpl#getDiaNode <em>Dia Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeIdentitiySelectorImpl extends DestinationSelectorImpl implements NodeIdentitiySelector
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDiaNode() <em>Dia Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiaNode()
   * @generated
   * @ordered
   */
  protected CharacterizedNode diaNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeIdentitiySelectorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DSLPackage.Literals.NODE_IDENTITIY_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.NODE_IDENTITIY_SELECTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharacterizedNode getDiaNode()
  {
    if (diaNode != null && ((EObject)diaNode).eIsProxy())
    {
      InternalEObject oldDiaNode = (InternalEObject)diaNode;
      diaNode = (CharacterizedNode)eResolveProxy(oldDiaNode);
      if (diaNode != oldDiaNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSLPackage.NODE_IDENTITIY_SELECTOR__DIA_NODE, oldDiaNode, diaNode));
      }
    }
    return diaNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacterizedNode basicGetDiaNode()
  {
    return diaNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDiaNode(CharacterizedNode newDiaNode)
  {
    CharacterizedNode oldDiaNode = diaNode;
    diaNode = newDiaNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.NODE_IDENTITIY_SELECTOR__DIA_NODE, oldDiaNode, diaNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DSLPackage.NODE_IDENTITIY_SELECTOR__NAME:
        return getName();
      case DSLPackage.NODE_IDENTITIY_SELECTOR__DIA_NODE:
        if (resolve) return getDiaNode();
        return basicGetDiaNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DSLPackage.NODE_IDENTITIY_SELECTOR__NAME:
        setName((String)newValue);
        return;
      case DSLPackage.NODE_IDENTITIY_SELECTOR__DIA_NODE:
        setDiaNode((CharacterizedNode)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DSLPackage.NODE_IDENTITIY_SELECTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DSLPackage.NODE_IDENTITIY_SELECTOR__DIA_NODE:
        setDiaNode((CharacterizedNode)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DSLPackage.NODE_IDENTITIY_SELECTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DSLPackage.NODE_IDENTITIY_SELECTOR__DIA_NODE:
        return diaNode != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NodeIdentitiySelectorImpl
