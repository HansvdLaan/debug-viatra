/**
 */
package com.hans.rbac.model.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hans.rbac.model.rbac.Test#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see com.hans.rbac.model.rbac.RbacPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link com.hans.rbac.model.rbac.Policy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see com.hans.rbac.model.rbac.RbacPackage#getTest_Policy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Policy> getPolicy();

} // Test
