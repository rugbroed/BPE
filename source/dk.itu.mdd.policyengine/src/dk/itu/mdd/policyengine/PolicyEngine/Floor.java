/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Floor#getRooms <em>Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getFloor()
 * @model
 * @generated
 */
public interface Floor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getFloor_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

} // Floor
