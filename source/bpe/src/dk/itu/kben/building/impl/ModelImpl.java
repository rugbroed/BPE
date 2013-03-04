/**
 */
package dk.itu.kben.building.impl;

import dk.itu.kben.building.BuildingPackage;
import dk.itu.kben.building.Construct;
import dk.itu.kben.building.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.kben.building.impl.ModelImpl#getConstructs <em>Constructs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
	/**
	 * The cached value of the '{@link #getConstructs() <em>Constructs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructs()
	 * @generated
	 * @ordered
	 */
	protected EList<Construct> constructs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Construct> getConstructs() {
		if (constructs == null) {
			constructs = new EObjectContainmentEList<Construct>(Construct.class, this, BuildingPackage.MODEL__CONSTRUCTS);
		}
		return constructs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.MODEL__CONSTRUCTS:
				return ((InternalEList<?>)getConstructs()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.MODEL__CONSTRUCTS:
				return getConstructs();
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
			case BuildingPackage.MODEL__CONSTRUCTS:
				getConstructs().clear();
				getConstructs().addAll((Collection<? extends Construct>)newValue);
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
			case BuildingPackage.MODEL__CONSTRUCTS:
				getConstructs().clear();
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
			case BuildingPackage.MODEL__CONSTRUCTS:
				return constructs != null && !constructs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
