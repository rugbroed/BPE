/**
 */
package dk.itu.mdd.PolicyEngine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Sensors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.HasSensors#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getHasSensors()
 * @model
 * @generated
 */
public interface HasSensors extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getHasSensors_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

} // HasSensors
