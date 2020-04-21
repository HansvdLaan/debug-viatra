/**
 */
package com.hans.rbac.model.rbac;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.hans.rbac.model.rbac.RbacFactory
 * @model kind="package"
 * @generated
 */
public interface RbacPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rbac";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rbac";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rbac";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RbacPackage eINSTANCE = com.hans.rbac.model.rbac.impl.RbacPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.hans.rbac.model.rbac.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hans.rbac.model.rbac.impl.UserImpl
	 * @see com.hans.rbac.model.rbac.impl.RbacPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>UR</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UR = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hans.rbac.model.rbac.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hans.rbac.model.rbac.impl.RoleImpl
	 * @see com.hans.rbac.model.rbac.impl.RbacPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>RD</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RD = 1;

	/**
	 * The feature id for the '<em><b>Seniors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SENIORS = 2;

	/**
	 * The feature id for the '<em><b>Juniors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__JUNIORS = 3;

	/**
	 * The feature id for the '<em><b>RU</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RU = 4;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hans.rbac.model.rbac.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hans.rbac.model.rbac.impl.PermissionImpl
	 * @see com.hans.rbac.model.rbac.impl.RbacPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>PD</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PD = 1;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hans.rbac.model.rbac.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hans.rbac.model.rbac.impl.PolicyImpl
	 * @see com.hans.rbac.model.rbac.impl.RbacPackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 3;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__USERS = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__PERMISSIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Demarcations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__DEMARCATIONS = 4;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hans.rbac.model.rbac.impl.DemarcationImpl <em>Demarcation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hans.rbac.model.rbac.impl.DemarcationImpl
	 * @see com.hans.rbac.model.rbac.impl.RbacPackageImpl#getDemarcation()
	 * @generated
	 */
	int DEMARCATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>DP</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__DP = 1;

	/**
	 * The feature id for the '<em><b>Subs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__SUBS = 2;

	/**
	 * The feature id for the '<em><b>Sups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__SUPS = 3;

	/**
	 * The feature id for the '<em><b>DR</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__DR = 4;

	/**
	 * The number of structural features of the '<em>Demarcation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Demarcation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.hans.rbac.model.rbac.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see com.hans.rbac.model.rbac.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link com.hans.rbac.model.rbac.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hans.rbac.model.rbac.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.hans.rbac.model.rbac.User#getUR <em>UR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>UR</em>'.
	 * @see com.hans.rbac.model.rbac.User#getUR()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UR();

	/**
	 * Returns the meta object for class '{@link com.hans.rbac.model.rbac.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see com.hans.rbac.model.rbac.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link com.hans.rbac.model.rbac.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hans.rbac.model.rbac.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.hans.rbac.model.rbac.Role#getRD <em>RD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RD</em>'.
	 * @see com.hans.rbac.model.rbac.Role#getRD()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RD();

	/**
	 * Returns the meta object for the reference list '{@link com.hans.rbac.model.rbac.Role#getSeniors <em>Seniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Seniors</em>'.
	 * @see com.hans.rbac.model.rbac.Role#getSeniors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Seniors();

	/**
	 * Returns the meta object for the reference list '{@link com.hans.rbac.model.rbac.Role#getJuniors <em>Juniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Juniors</em>'.
	 * @see com.hans.rbac.model.rbac.Role#getJuniors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Juniors();

	/**
	 * Returns the meta object for the reference list '{@link com.hans.rbac.model.rbac.Role#getRU <em>RU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RU</em>'.
	 * @see com.hans.rbac.model.rbac.Role#getRU()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RU();

	/**
	 * Returns the meta object for class '{@link com.hans.rbac.model.rbac.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see com.hans.rbac.model.rbac.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the attribute '{@link com.hans.rbac.model.rbac.Permission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hans.rbac.model.rbac.Permission#getName()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.hans.rbac.model.rbac.Permission#getPD <em>PD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PD</em>'.
	 * @see com.hans.rbac.model.rbac.Permission#getPD()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PD();

	/**
	 * Returns the meta object for class '{@link com.hans.rbac.model.rbac.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see com.hans.rbac.model.rbac.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hans.rbac.model.rbac.Policy#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see com.hans.rbac.model.rbac.Policy#getUsers()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hans.rbac.model.rbac.Policy#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see com.hans.rbac.model.rbac.Policy#getRoles()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hans.rbac.model.rbac.Policy#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see com.hans.rbac.model.rbac.Policy#getPermissions()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Permissions();

	/**
	 * Returns the meta object for the attribute '{@link com.hans.rbac.model.rbac.Policy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hans.rbac.model.rbac.Policy#getName()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hans.rbac.model.rbac.Policy#getDemarcations <em>Demarcations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Demarcations</em>'.
	 * @see com.hans.rbac.model.rbac.Policy#getDemarcations()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Demarcations();

	/**
	 * Returns the meta object for class '{@link com.hans.rbac.model.rbac.Demarcation <em>Demarcation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demarcation</em>'.
	 * @see com.hans.rbac.model.rbac.Demarcation
	 * @generated
	 */
	EClass getDemarcation();

	/**
	 * Returns the meta object for the attribute '{@link com.hans.rbac.model.rbac.Demarcation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hans.rbac.model.rbac.Demarcation#getName()
	 * @see #getDemarcation()
	 * @generated
	 */
	EAttribute getDemarcation_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.hans.rbac.model.rbac.Demarcation#getDP <em>DP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DP</em>'.
	 * @see com.hans.rbac.model.rbac.Demarcation#getDP()
	 * @see #getDemarcation()
	 * @generated
	 */
	EReference getDemarcation_DP();

	/**
	 * Returns the meta object for the reference list '{@link com.hans.rbac.model.rbac.Demarcation#getSubs <em>Subs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subs</em>'.
	 * @see com.hans.rbac.model.rbac.Demarcation#getSubs()
	 * @see #getDemarcation()
	 * @generated
	 */
	EReference getDemarcation_Subs();

	/**
	 * Returns the meta object for the reference list '{@link com.hans.rbac.model.rbac.Demarcation#getSups <em>Sups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sups</em>'.
	 * @see com.hans.rbac.model.rbac.Demarcation#getSups()
	 * @see #getDemarcation()
	 * @generated
	 */
	EReference getDemarcation_Sups();

	/**
	 * Returns the meta object for the reference list '{@link com.hans.rbac.model.rbac.Demarcation#getDR <em>DR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DR</em>'.
	 * @see com.hans.rbac.model.rbac.Demarcation#getDR()
	 * @see #getDemarcation()
	 * @generated
	 */
	EReference getDemarcation_DR();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RbacFactory getRbacFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.hans.rbac.model.rbac.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hans.rbac.model.rbac.impl.UserImpl
		 * @see com.hans.rbac.model.rbac.impl.RbacPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>UR</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__UR = eINSTANCE.getUser_UR();

		/**
		 * The meta object literal for the '{@link com.hans.rbac.model.rbac.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hans.rbac.model.rbac.impl.RoleImpl
		 * @see com.hans.rbac.model.rbac.impl.RbacPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>RD</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RD = eINSTANCE.getRole_RD();

		/**
		 * The meta object literal for the '<em><b>Seniors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SENIORS = eINSTANCE.getRole_Seniors();

		/**
		 * The meta object literal for the '<em><b>Juniors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__JUNIORS = eINSTANCE.getRole_Juniors();

		/**
		 * The meta object literal for the '<em><b>RU</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RU = eINSTANCE.getRole_RU();

		/**
		 * The meta object literal for the '{@link com.hans.rbac.model.rbac.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hans.rbac.model.rbac.impl.PermissionImpl
		 * @see com.hans.rbac.model.rbac.impl.RbacPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__NAME = eINSTANCE.getPermission_Name();

		/**
		 * The meta object literal for the '<em><b>PD</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__PD = eINSTANCE.getPermission_PD();

		/**
		 * The meta object literal for the '{@link com.hans.rbac.model.rbac.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hans.rbac.model.rbac.impl.PolicyImpl
		 * @see com.hans.rbac.model.rbac.impl.RbacPackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__USERS = eINSTANCE.getPolicy_Users();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__ROLES = eINSTANCE.getPolicy_Roles();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__PERMISSIONS = eINSTANCE.getPolicy_Permissions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__NAME = eINSTANCE.getPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Demarcations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__DEMARCATIONS = eINSTANCE.getPolicy_Demarcations();

		/**
		 * The meta object literal for the '{@link com.hans.rbac.model.rbac.impl.DemarcationImpl <em>Demarcation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hans.rbac.model.rbac.impl.DemarcationImpl
		 * @see com.hans.rbac.model.rbac.impl.RbacPackageImpl#getDemarcation()
		 * @generated
		 */
		EClass DEMARCATION = eINSTANCE.getDemarcation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMARCATION__NAME = eINSTANCE.getDemarcation_Name();

		/**
		 * The meta object literal for the '<em><b>DP</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMARCATION__DP = eINSTANCE.getDemarcation_DP();

		/**
		 * The meta object literal for the '<em><b>Subs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMARCATION__SUBS = eINSTANCE.getDemarcation_Subs();

		/**
		 * The meta object literal for the '<em><b>Sups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMARCATION__SUPS = eINSTANCE.getDemarcation_Sups();

		/**
		 * The meta object literal for the '<em><b>DR</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMARCATION__DR = eINSTANCE.getDemarcation_DR();

	}

} //RbacPackage
