/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.SensorExpression#getSen <em>Sen</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getSensorExpression()
 * @model
 * @generated
 */
public interface SensorExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Sen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sen</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sen</em>' containment reference.
	 * @see #setSen(SensorType)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getSensorExpression_Sen()
	 * @model containment="true"
	 * @generated
	 */
	SensorType getSen();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.SensorExpression#getSen <em>Sen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sen</em>' containment reference.
	 * @see #getSen()
	 * @generated
	 */
	void setSen(SensorType value);

} // SensorExpression
