/**
 */
package com.hans.rbac.model.rbac.impl;

import com.hans.rbac.model.rbac.Demarcation;
import com.hans.rbac.model.rbac.RbacPackage;
import com.hans.rbac.model.rbac.Role;

import com.hans.rbac.model.rbac.User;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.hans.rbac.model.rbac.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.impl.RoleImpl#getRD <em>RD</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.impl.RoleImpl#getSeniors <em>Seniors</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.impl.RoleImpl#getJuniors <em>Juniors</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.impl.RoleImpl#getRU <em>RU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends MinimalEObjectImpl.Container implements Role {
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
	 * The cached value of the '{@link #getRD() <em>RD</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRD()
	 * @generated
	 * @ordered
	 */
	protected EList<Demarcation> rd;

	/**
	 * The cached value of the '{@link #getSeniors() <em>Seniors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeniors()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> seniors;

	/**
	 * The cached value of the '{@link #getJuniors() <em>Juniors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJuniors()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> juniors;

	/**
	 * The cached value of the '{@link #getRU() <em>RU</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRU()
	 * @generated
	 * @ordered
	 */
	protected EList<User> ru;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RbacPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Demarcation> getRD() {
		if (rd == null) {
			rd = new EObjectWithInverseResolvingEList.ManyInverse<Demarcation>(Demarcation.class, this,
					RbacPackage.ROLE__RD, RbacPackage.DEMARCATION__DR);
		}
		return rd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getSeniors() {
		if (seniors == null) {
			seniors = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this,
					RbacPackage.ROLE__SENIORS, RbacPackage.ROLE__JUNIORS);
		}
		return seniors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getJuniors() {
		if (juniors == null) {
			juniors = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this,
					RbacPackage.ROLE__JUNIORS, RbacPackage.ROLE__SENIORS);
		}
		return juniors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getRU() {
		if (ru == null) {
			ru = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, RbacPackage.ROLE__RU,
					RbacPackage.USER__UR);
		}
		return ru;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RbacPackage.ROLE__RD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRD()).basicAdd(otherEnd, msgs);
		case RbacPackage.ROLE__SENIORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSeniors()).basicAdd(otherEnd, msgs);
		case RbacPackage.ROLE__JUNIORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJuniors()).basicAdd(otherEnd, msgs);
		case RbacPackage.ROLE__RU:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRU()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RbacPackage.ROLE__RD:
			return ((InternalEList<?>) getRD()).basicRemove(otherEnd, msgs);
		case RbacPackage.ROLE__SENIORS:
			return ((InternalEList<?>) getSeniors()).basicRemove(otherEnd, msgs);
		case RbacPackage.ROLE__JUNIORS:
			return ((InternalEList<?>) getJuniors()).basicRemove(otherEnd, msgs);
		case RbacPackage.ROLE__RU:
			return ((InternalEList<?>) getRU()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RbacPackage.ROLE__NAME:
			return getName();
		case RbacPackage.ROLE__RD:
			return getRD();
		case RbacPackage.ROLE__SENIORS:
			return getSeniors();
		case RbacPackage.ROLE__JUNIORS:
			return getJuniors();
		case RbacPackage.ROLE__RU:
			return getRU();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RbacPackage.ROLE__NAME:
			setName((String) newValue);
			return;
		case RbacPackage.ROLE__RD:
			getRD().clear();
			getRD().addAll((Collection<? extends Demarcation>) newValue);
			return;
		case RbacPackage.ROLE__SENIORS:
			getSeniors().clear();
			getSeniors().addAll((Collection<? extends Role>) newValue);
			return;
		case RbacPackage.ROLE__JUNIORS:
			getJuniors().clear();
			getJuniors().addAll((Collection<? extends Role>) newValue);
			return;
		case RbacPackage.ROLE__RU:
			getRU().clear();
			getRU().addAll((Collection<? extends User>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case RbacPackage.ROLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RbacPackage.ROLE__RD:
			getRD().clear();
			return;
		case RbacPackage.ROLE__SENIORS:
			getSeniors().clear();
			return;
		case RbacPackage.ROLE__JUNIORS:
			getJuniors().clear();
			return;
		case RbacPackage.ROLE__RU:
			getRU().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RbacPackage.ROLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RbacPackage.ROLE__RD:
			return rd != null && !rd.isEmpty();
		case RbacPackage.ROLE__SENIORS:
			return seniors != null && !seniors.isEmpty();
		case RbacPackage.ROLE__JUNIORS:
			return juniors != null && !juniors.isEmpty();
		case RbacPackage.ROLE__RU:
			return ru != null && !ru.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
