/**
 */
package dk.itu.kben.building;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.kben.building.Door#getRooms <em>Rooms</em>}</li>
 *   <li>{@link dk.itu.kben.building.Door#getDoorHandles <em>Door Handles</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.kben.building.BuildingPackage#getDoor()
 * @model
 * @generated
 */
public interface Door extends Identifiable {

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link dk.itu.kben.building.Room}.
	 * It is bidirectional and its opposite is '{@link dk.itu.kben.building.Room#getDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see dk.itu.kben.building.BuildingPackage#getDoor_Rooms()
	 * @see dk.itu.kben.building.Room#getDoors
	 * @model opposite="doors" lower="2" upper="2"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Door Handles</b></em>' reference list.
	 * The list contents are of type {@link dk.itu.kben.building.DoorHandle}.
	 * It is bidirectional and its opposite is '{@link dk.itu.kben.building.DoorHandle#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door Handles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Handles</em>' reference list.
	 * @see dk.itu.kben.building.BuildingPackage#getDoor_DoorHandles()
	 * @see dk.itu.kben.building.DoorHandle#getDoor
	 * @model opposite="door" lower="2" upper="2"
	 * @generated
	 */
	EList<DoorHandle> getDoorHandles();

} // Door
