/**
 */
package dk.itu.mdd.PolicyEngine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.RoomUsage#getSen <em>Sen</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.RoomUsage#getAct <em>Act</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.RoomUsage#getDefineState <em>Define State</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getRoomUsage()
 * @model
 * @generated
 */
public interface RoomUsage extends EObject {
	/**
	 * Returns the value of the '<em><b>Sen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sen</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sen</em>' containment reference.
	 * @see #setSen(Sensor)
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getRoomUsage_Sen()
	 * @model containment="true"
	 * @generated
	 */
	Sensor getSen();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.PolicyEngine.RoomUsage#getSen <em>Sen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sen</em>' containment reference.
	 * @see #getSen()
	 * @generated
	 */
	void setSen(Sensor value);

	/**
	 * Returns the value of the '<em><b>Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act</em>' containment reference.
	 * @see #setAct(Actuator)
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getRoomUsage_Act()
	 * @model containment="true"
	 * @generated
	 */
	Actuator getAct();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.PolicyEngine.RoomUsage#getAct <em>Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act</em>' containment reference.
	 * @see #getAct()
	 * @generated
	 */
	void setAct(Actuator value);

	/**
	 * Returns the value of the '<em><b>Define State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Define State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define State</em>' reference.
	 * @see #setDefineState(State)
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getRoomUsage_DefineState()
	 * @model
	 * @generated
	 */
	State getDefineState();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.PolicyEngine.RoomUsage#getDefineState <em>Define State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Define State</em>' reference.
	 * @see #getDefineState()
	 * @generated
	 */
	void setDefineState(State value);

} // RoomUsage
