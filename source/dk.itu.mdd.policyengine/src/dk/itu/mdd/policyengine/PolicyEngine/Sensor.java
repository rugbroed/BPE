/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Sensor#getSensorTypes <em>Sensor Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends NamedElement, Component {
	/**
	 * Returns the value of the '<em><b>Sensor Types</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.SensorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Types</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getSensor_SensorTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SensorType> getSensorTypes();

} // Sensor
