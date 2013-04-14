/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.PolicyEngine.Sensor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SensorImpl extends HasIntegerValueImpl implements Sensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.SENSOR;
	}

} //SensorImpl
