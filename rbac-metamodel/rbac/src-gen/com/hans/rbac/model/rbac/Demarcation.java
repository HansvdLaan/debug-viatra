/**
 */
package com.hans.rbac.model.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demarcation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hans.rbac.model.rbac.Demarcation#getName <em>Name</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Demarcation#getDP <em>DP</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Demarcation#getSubs <em>Subs</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Demarcation#getSups <em>Sups</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.Demarcation#getDR <em>DR</em>}</li>
 * </ul>
 *
 * @see com.hans.rbac.model.rbac.RbacPackage#getDemarcation()
 * @model
 * @generated
 */
public interface Demarcation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.hans.rbac.model.rbac.RbacPackage#getDemarcation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.hans.rbac.model.rbac.Demarcation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>DP</b></em>' reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Permission}.
	 * It is bidirectional and its opposite is '{@link com.hans.rbac.model.rbac.Permission#getPD <em>PD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP</em>' reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getDemarcation_DP()
	 * @see com.hans.rbac.model.rbac.Permission#getPD
	 * @model opposite="PD"
	 * @generated
	 */
	EList<Permission> getDP();

	/**
	 * Returns the value of the '<em><b>Subs</b></em>' reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Demarcation}.
	 * It is bidirectional and its opposite is '{@link com.hans.rbac.model.rbac.Demarcation#getSups <em>Sups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subs</em>' reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getDemarcation_Subs()
	 * @see com.hans.rbac.model.rbac.Demarcation#getSups
	 * @model opposite="sups"
	 * @generated
	 */
	EList<Demarcation> getSubs();

	/**
	 * Returns the value of the '<em><b>Sups</b></em>' reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Demarcation}.
	 * It is bidirectional and its opposite is '{@link com.hans.rbac.model.rbac.Demarcation#getSubs <em>Subs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sups</em>' reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getDemarcation_Sups()
	 * @see com.hans.rbac.model.rbac.Demarcation#getSubs
	 * @model opposite="subs"
	 * @generated
	 */
	EList<Demarcation> getSups();

	/**
	 * Returns the value of the '<em><b>DR</b></em>' reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link com.hans.rbac.model.rbac.Role#getRD <em>RD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DR</em>' reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getDemarcation_DR()
	 * @see com.hans.rbac.model.rbac.Role#getRD
	 * @model opposite="RD"
	 * @generated
	 */
	EList<Role> getDR();

} // Demarcation
