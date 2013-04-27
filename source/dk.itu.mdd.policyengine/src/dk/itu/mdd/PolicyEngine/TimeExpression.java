/**
 */
package dk.itu.mdd.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.TimeExpression#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.TimeExpression#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getTimeExpression()
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
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getTimeExpression_Seconds()
	 * @model required="true"
	 * @generated
	 */
	int getSeconds();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.PolicyEngine.TimeExpression#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' reference.
	 * @see #setTime(Timer)
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getTimeExpression_Time()
	 * @model required="true"
	 * @generated
	 */
	Timer getTime();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.PolicyEngine.TimeExpression#getTime <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Timer value);

} // TimeExpression
