/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.StateInstance#getDefineState <em>Define State</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getStateInstance()
 * @model
 * @generated
 */
public interface StateInstance extends Expression {
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
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getStateInstance_DefineState()
	 * @model
	 * @generated
	 */
	State getDefineState();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.StateInstance#getDefineState <em>Define State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Define State</em>' reference.
	 * @see #getDefineState()
	 * @generated
	 */
	void setDefineState(State value);

} // StateInstance
