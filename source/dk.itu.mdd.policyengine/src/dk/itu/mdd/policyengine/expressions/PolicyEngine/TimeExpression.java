/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getTimeExpression()
 * @model
 * @generated
 */
public interface TimeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(int)
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getTimeExpression_Seconds()
	 * @model required="true"
	 * @generated
	 */
	int getSeconds();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(AudioAlarmTimer)
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getTimeExpression_Time()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AudioAlarmTimer getTime();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(AudioAlarmTimer value);

} // TimeExpression
