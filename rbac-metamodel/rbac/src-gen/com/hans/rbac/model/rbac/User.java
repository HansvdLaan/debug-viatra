/**
 */
package com.hans.rbac.model.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hans.rbac.model.rbac.User#getName <em>Name</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.User#getUR <em>UR</em>}</li>
 * </ul>
 *
 * @see com.hans.rbac.model.rbac.RbacPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.hans.rbac.model.rbac.RbacPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.hans.rbac.model.rbac.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>UR</b></em>' reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link com.hans.rbac.model.rbac.Role#getRU <em>RU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UR</em>' reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getUser_UR()
	 * @see com.hans.rbac.model.rbac.Role#getRU
	 * @model opposite="RU"
	 * @generated
	 */
	EList<Role> getUR();

} // User
