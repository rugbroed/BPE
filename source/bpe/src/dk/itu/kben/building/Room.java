/**
 */
package dk.itu.kben.building;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.kben.building.Room#getWindows <em>Windows</em>}</li>
 *   <li>{@link dk.itu.kben.building.Room#getDoors <em>Doors</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.kben.building.BuildingPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Doors</b></em>' reference list.
	 * The list contents are of type {@link dk.itu.kben.building.Door}.
	 * It is bidirectional and its opposite is '{@link dk.itu.kben.building.Door#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors</em>' reference list.
	 * @see dk.itu.kben.building.BuildingPackage#getRoom_Doors()
	 * @see dk.itu.kben.building.Door#getRooms
	 * @model opposite="rooms"
	 * @generated
	 */
	EList<Door> getDoors();

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' reference list.
	 * The list contents are of type {@link dk.itu.kben.building.Window}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' reference list.
	 * @see dk.itu.kben.building.BuildingPackage#getRoom_Windows()
	 * @model
	 * @generated
	 */
	EList<Window> getWindows();

} // Room
