/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.RoomExpression#getRoomInstance <em>Room Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getRoomExpression()
 * @model
 * @generated
 */
public interface RoomExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Room Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Instance</em>' reference.
	 * @see #setRoomInstance(Room)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getRoomExpression_RoomInstance()
	 * @model
	 * @generated
	 */
	Room getRoomInstance();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.RoomExpression#getRoomInstance <em>Room Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Instance</em>' reference.
	 * @see #getRoomInstance()
	 * @generated
	 */
	void setRoomInstance(Room value);

} // RoomExpression
