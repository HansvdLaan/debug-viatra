/**
 */
package com.hans.rbac.model.rbac;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hans.rbac.model.rbac.Permission#getName <em>Name</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Permission#getPD <em>PD</em>}</li>
 * </ul>
 *
 * @see com.hans.rbac.model.rbac.RbacPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.hans.rbac.model.rbac.RbacPackage#getPermission_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.hans.rbac.model.rbac.Permission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>PD</b></em>' reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Demarcation}.
	 * It is bidirectional and its opposite is '{@link com.hans.rbac.model.rbac.Demarcation#getDP <em>DP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD</em>' reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getPermission_PD()
	 * @see com.hans.rbac.model.rbac.Demarcation#getDP
	 * @model opposite="DP"
	 * @generated
	 */
	EList<Demarcation> getPD();

} // Permission
