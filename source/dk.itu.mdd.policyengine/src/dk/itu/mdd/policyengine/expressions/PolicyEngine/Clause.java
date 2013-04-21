/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause#getSen <em>Sen</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause#getAct <em>Act</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends EObject {
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
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getClause_Sen()
	 * @model containment="true"
	 * @generated
	 */
	Sensor getSen();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause#getSen <em>Sen</em>}' containment reference.
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
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getClause_Act()
	 * @model containment="true"
	 * @generated
	 */
	Actuator getAct();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause#getAct <em>Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act</em>' containment reference.
	 * @see #getAct()
	 * @generated
	 */
	void setAct(Actuator value);

} // Clause
