/**
 */
package dk.itu.mdd.PolicyEngine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.CTS#getTemperatureSensors <em>Temperature Sensors</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.CTS#getCtsActuators <em>Cts Actuators</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getCTS()
 * @model
 * @generated
 */
public interface CTS extends EObject {
	/**
	 * Returns the value of the '<em><b>Temperature Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.TemperatureSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Sensors</em>' containment reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getCTS_TemperatureSensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemperatureSensor> getTemperatureSensors();

	/**
	 * Returns the value of the '<em><b>Cts Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.Actuator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cts Actuators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cts Actuators</em>' containment reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getCTS_CtsActuators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actuator> getCtsActuators();

} // CTS
