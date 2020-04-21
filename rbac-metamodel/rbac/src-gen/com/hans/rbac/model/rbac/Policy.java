/**
 */
package com.hans.rbac.model.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hans.rbac.model.rbac.Policy#getUsers <em>Users</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Policy#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Policy#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Policy#getName <em>Name</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Policy#getDemarcations <em>Demarcations</em>}</li>
 * </ul>
 *
 * @see com.hans.rbac.model.rbac.RbacPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getPolicy_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getPolicy_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getPolicy_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.hans.rbac.model.rbac.RbacPackage#getPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.hans.rbac.model.rbac.Policy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Demarcations</b></em>' containment reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Demarcation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demarcations</em>' containment reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getPolicy_Demarcations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Demarcation> getDemarcations();

} // Policy
