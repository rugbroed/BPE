/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.Actuator;
import dk.itu.mdd.policyengine.PolicyEngine.Conditions;
import dk.itu.mdd.policyengine.PolicyEngine.Policy;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.PolicyEngine.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyImpl#getSpecifiedBy <em>Specified By</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyImpl#getUsesSensors <em>Uses Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyImpl extends NamedElementImpl implements Policy {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> uses;

	/**
	 * The cached value of the '{@link #getSpecifiedBy() <em>Specified By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Conditions> specifiedBy;

	/**
	 * The cached value of the '{@link #getUsesSensors() <em>Uses Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> usesSensors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<Actuator>(Actuator.class, this, PolicyEnginePackage.POLICY__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conditions> getSpecifiedBy() {
		if (specifiedBy == null) {
			specifiedBy = new EObjectContainmentEList<Conditions>(Conditions.class, this, PolicyEnginePackage.POLICY__SPECIFIED_BY);
		}
		return specifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getUsesSensors() {
		if (usesSensors == null) {
			usesSensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, PolicyEnginePackage.POLICY__USES_SENSORS);
		}
		return usesSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.POLICY__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
				return ((InternalEList<?>)getSpecifiedBy()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.POLICY__USES_SENSORS:
				return ((InternalEList<?>)getUsesSensors()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.POLICY__USES:
				return getUses();
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
				return getSpecifiedBy();
			case PolicyEnginePackage.POLICY__USES_SENSORS:
				return getUsesSensors();
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
			case PolicyEnginePackage.POLICY__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Actuator>)newValue);
				return;
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
				getSpecifiedBy().clear();
				getSpecifiedBy().addAll((Collection<? extends Conditions>)newValue);
				return;
			case PolicyEnginePackage.POLICY__USES_SENSORS:
				getUsesSensors().clear();
				getUsesSensors().addAll((Collection<? extends Sensor>)newValue);
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
			case PolicyEnginePackage.POLICY__USES:
				getUses().clear();
				return;
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
				getSpecifiedBy().clear();
				return;
			case PolicyEnginePackage.POLICY__USES_SENSORS:
				getUsesSensors().clear();
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
			case PolicyEnginePackage.POLICY__USES:
				return uses != null && !uses.isEmpty();
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
				return specifiedBy != null && !specifiedBy.isEmpty();
			case PolicyEnginePackage.POLICY__USES_SENSORS:
				return usesSensors != null && !usesSensors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PolicyImpl
