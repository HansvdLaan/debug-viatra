/**
 */
package com.hans.rbac.model.rbac.impl;

import com.hans.rbac.model.rbac.Demarcation;
import com.hans.rbac.model.rbac.Permission;
import com.hans.rbac.model.rbac.RbacPackage;

import com.hans.rbac.model.rbac.Role;
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
 * An implementation of the model object '<em><b>Demarcation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.hans.rbac.model.rbac.impl.DemarcationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.impl.DemarcationImpl#getDP <em>DP</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.impl.DemarcationImpl#getSubs <em>Subs</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.impl.DemarcationImpl#getSups <em>Sups</em>}</li>
 *   <li>{@link com.hans.rbac.model.rbac.impl.DemarcationImpl#getDR <em>DR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemarcationImpl extends MinimalEObjectImpl.Container implements Demarcation {
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
	 * The cached value of the '{@link #getDP() <em>DP</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDP()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> dp;

	/**
	 * The cached value of the '{@link #getSubs() <em>Subs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubs()
	 * @generated
	 * @ordered
	 */
	protected EList<Demarcation> subs;

	/**
	 * The cached value of the '{@link #getSups() <em>Sups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSups()
	 * @generated
	 * @ordered
	 */
	protected EList<Demarcation> sups;

	/**
	 * The cached value of the '{@link #getDR() <em>DR</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDR()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> dr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemarcationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RbacPackage.Literals.DEMARCATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.DEMARCATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Permission> getDP() {
		if (dp == null) {
			dp = new EObjectWithInverseResolvingEList.ManyInverse<Permission>(Permission.class, this,
					RbacPackage.DEMARCATION__DP, RbacPackage.PERMISSION__PD);
		}
		return dp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Demarcation> getSubs() {
		if (subs == null) {
			subs = new EObjectWithInverseResolvingEList.ManyInverse<Demarcation>(Demarcation.class, this,
					RbacPackage.DEMARCATION__SUBS, RbacPackage.DEMARCATION__SUPS);
		}
		return subs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Demarcation> getSups() {
		if (sups == null) {
			sups = new EObjectWithInverseResolvingEList.ManyInverse<Demarcation>(Demarcation.class, this,
					RbacPackage.DEMARCATION__SUPS, RbacPackage.DEMARCATION__SUBS);
		}
		return sups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getDR() {
		if (dr == null) {
			dr = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, RbacPackage.DEMARCATION__DR,
					RbacPackage.ROLE__RD);
		}
		return dr;
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
		case RbacPackage.DEMARCATION__DP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDP()).basicAdd(otherEnd, msgs);
		case RbacPackage.DEMARCATION__SUBS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubs()).basicAdd(otherEnd, msgs);
		case RbacPackage.DEMARCATION__SUPS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSups()).basicAdd(otherEnd, msgs);
		case RbacPackage.DEMARCATION__DR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDR()).basicAdd(otherEnd, msgs);
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
		case RbacPackage.DEMARCATION__DP:
			return ((InternalEList<?>) getDP()).basicRemove(otherEnd, msgs);
		case RbacPackage.DEMARCATION__SUBS:
			return ((InternalEList<?>) getSubs()).basicRemove(otherEnd, msgs);
		case RbacPackage.DEMARCATION__SUPS:
			return ((InternalEList<?>) getSups()).basicRemove(otherEnd, msgs);
		case RbacPackage.DEMARCATION__DR:
			return ((InternalEList<?>) getDR()).basicRemove(otherEnd, msgs);
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
		case RbacPackage.DEMARCATION__NAME:
			return getName();
		case RbacPackage.DEMARCATION__DP:
			return getDP();
		case RbacPackage.DEMARCATION__SUBS:
			return getSubs();
		case RbacPackage.DEMARCATION__SUPS:
			return getSups();
		case RbacPackage.DEMARCATION__DR:
			return getDR();
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
		case RbacPackage.DEMARCATION__NAME:
			setName((String) newValue);
			return;
		case RbacPackage.DEMARCATION__DP:
			getDP().clear();
			getDP().addAll((Collection<? extends Permission>) newValue);
			return;
		case RbacPackage.DEMARCATION__SUBS:
			getSubs().clear();
			getSubs().addAll((Collection<? extends Demarcation>) newValue);
			return;
		case RbacPackage.DEMARCATION__SUPS:
			getSups().clear();
			getSups().addAll((Collection<? extends Demarcation>) newValue);
			return;
		case RbacPackage.DEMARCATION__DR:
			getDR().clear();
			getDR().addAll((Collection<? extends Role>) newValue);
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
		case RbacPackage.DEMARCATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RbacPackage.DEMARCATION__DP:
			getDP().clear();
			return;
		case RbacPackage.DEMARCATION__SUBS:
			getSubs().clear();
			return;
		case RbacPackage.DEMARCATION__SUPS:
			getSups().clear();
			return;
		case RbacPackage.DEMARCATION__DR:
			getDR().clear();
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
		case RbacPackage.DEMARCATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RbacPackage.DEMARCATION__DP:
			return dp != null && !dp.isEmpty();
		case RbacPackage.DEMARCATION__SUBS:
			return subs != null && !subs.isEmpty();
		case RbacPackage.DEMARCATION__SUPS:
			return sups != null && !sups.isEmpty();
		case RbacPackage.DEMARCATION__DR:
			return dr != null && !dr.isEmpty();
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

} //DemarcationImpl
