/**
 */
package com.hans.rbac.model.rbac;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hans.rbac.model.rbac.Role#getName <em>Name</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Role#getRD <em>RD</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Role#getSeniors <em>Seniors</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Role#getJuniors <em>Juniors</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Role#getRU <em>RU</em>}</li>
 * </ul>
 *
 * @see com.hans.rbac.model.rbac.RbacPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.hans.rbac.model.rbac.RbacPackage#getRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.hans.rbac.model.rbac.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>RD</b></em>' reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Demarcation}.
	 * It is bidirectional and its opposite is '{@link com.hans.rbac.model.rbac.Demarcation#getDR <em>DR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RD</em>' reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getRole_RD()
	 * @see com.hans.rbac.model.rbac.Demarcation#getDR
	 * @model opposite="DR"
	 * @generated
	 */
	EList<Demarcation> getRD();

	/**
	 * Returns the value of the '<em><b>Seniors</b></em>' reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link com.hans.rbac.model.rbac.Role#getJuniors <em>Juniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seniors</em>' reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getRole_Seniors()
	 * @see com.hans.rbac.model.rbac.Role#getJuniors
	 * @model opposite="juniors"
	 * @generated
	 */
	EList<Role> getSeniors();

	/**
	 * Returns the value of the '<em><b>Juniors</b></em>' reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link com.hans.rbac.model.rbac.Role#getSeniors <em>Seniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Juniors</em>' reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getRole_Juniors()
	 * @see com.hans.rbac.model.rbac.Role#getSeniors
	 * @model opposite="seniors"
	 * @generated
	 */
	EList<Role> getJuniors();

	/**
	 * Returns the value of the '<em><b>RU</b></em>' reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.User}.
	 * It is bidirectional and its opposite is '{@link com.hans.rbac.model.rbac.User#getUR <em>UR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RU</em>' reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getRole_RU()
	 * @see com.hans.rbac.model.rbac.User#getUR
	 * @model opposite="UR"
	 * @generated
	 */
	EList<User> getRU();

} // Role
