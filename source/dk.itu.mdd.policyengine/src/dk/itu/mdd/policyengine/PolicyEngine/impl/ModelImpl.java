/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.Building;
import dk.itu.mdd.policyengine.PolicyEngine.Model;
import dk.itu.mdd.policyengine.PolicyEngine.Policy;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.PolicyEngine.Room;
import dk.itu.mdd.policyengine.PolicyEngine.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ModelImpl#getBuildings <em>Buildings</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ModelImpl#getPredefinedRooms <em>Predefined Rooms</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ModelImpl#getPolicyDefinition <em>Policy Definition</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ModelImpl#getStateDefinition <em>State Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends NamedElementImpl implements Model {
	/**
	 * The cached value of the '{@link #getBuildings() <em>Buildings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildings()
	 * @generated
	 * @ordered
	 */
	protected EList<Building> buildings;

	/**
	 * The cached value of the '{@link #getPredefinedRooms() <em>Predefined Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> predefinedRooms;

	/**
	 * The cached value of the '{@link #getPolicyDefinition() <em>Policy Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Policy> policyDefinition;

	/**
	 * The cached value of the '{@link #getStateDefinition() <em>State Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<State> stateDefinition;

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
		return PolicyEnginePackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Building> getBuildings() {
		if (buildings == null) {
			buildings = new EObjectContainmentEList<Building>(Building.class, this, PolicyEnginePackage.MODEL__BUILDINGS);
		}
		return buildings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getPredefinedRooms() {
		if (predefinedRooms == null) {
			predefinedRooms = new EObjectContainmentEList<Room>(Room.class, this, PolicyEnginePackage.MODEL__PREDEFINED_ROOMS);
		}
		return predefinedRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Policy> getPolicyDefinition() {
		if (policyDefinition == null) {
			policyDefinition = new EObjectContainmentEList<Policy>(Policy.class, this, PolicyEnginePackage.MODEL__POLICY_DEFINITION);
		}
		return policyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStateDefinition() {
		if (stateDefinition == null) {
			stateDefinition = new EObjectContainmentEList<State>(State.class, this, PolicyEnginePackage.MODEL__STATE_DEFINITION);
		}
		return stateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.MODEL__BUILDINGS:
				return ((InternalEList<?>)getBuildings()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.MODEL__PREDEFINED_ROOMS:
				return ((InternalEList<?>)getPredefinedRooms()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.MODEL__POLICY_DEFINITION:
				return ((InternalEList<?>)getPolicyDefinition()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.MODEL__STATE_DEFINITION:
				return ((InternalEList<?>)getStateDefinition()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.MODEL__BUILDINGS:
				return getBuildings();
			case PolicyEnginePackage.MODEL__PREDEFINED_ROOMS:
				return getPredefinedRooms();
			case PolicyEnginePackage.MODEL__POLICY_DEFINITION:
				return getPolicyDefinition();
			case PolicyEnginePackage.MODEL__STATE_DEFINITION:
				return getStateDefinition();
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
			case PolicyEnginePackage.MODEL__BUILDINGS:
				getBuildings().clear();
				getBuildings().addAll((Collection<? extends Building>)newValue);
				return;
			case PolicyEnginePackage.MODEL__PREDEFINED_ROOMS:
				getPredefinedRooms().clear();
				getPredefinedRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case PolicyEnginePackage.MODEL__POLICY_DEFINITION:
				getPolicyDefinition().clear();
				getPolicyDefinition().addAll((Collection<? extends Policy>)newValue);
				return;
			case PolicyEnginePackage.MODEL__STATE_DEFINITION:
				getStateDefinition().clear();
				getStateDefinition().addAll((Collection<? extends State>)newValue);
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
			case PolicyEnginePackage.MODEL__BUILDINGS:
				getBuildings().clear();
				return;
			case PolicyEnginePackage.MODEL__PREDEFINED_ROOMS:
				getPredefinedRooms().clear();
				return;
			case PolicyEnginePackage.MODEL__POLICY_DEFINITION:
				getPolicyDefinition().clear();
				return;
			case PolicyEnginePackage.MODEL__STATE_DEFINITION:
				getStateDefinition().clear();
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
			case PolicyEnginePackage.MODEL__BUILDINGS:
				return buildings != null && !buildings.isEmpty();
			case PolicyEnginePackage.MODEL__PREDEFINED_ROOMS:
				return predefinedRooms != null && !predefinedRooms.isEmpty();
			case PolicyEnginePackage.MODEL__POLICY_DEFINITION:
				return policyDefinition != null && !policyDefinition.isEmpty();
			case PolicyEnginePackage.MODEL__STATE_DEFINITION:
				return stateDefinition != null && !stateDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
