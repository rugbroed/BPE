/**
 */
package dk.itu.kben.building.tests;

import dk.itu.kben.building.BuildingFactory;
import dk.itu.kben.building.DishWasher;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dish Washer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DishWasherTest extends TestCase {

	/**
	 * The fixture for this Dish Washer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DishWasher fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DishWasherTest.class);
	}

	/**
	 * Constructs a new Dish Washer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DishWasherTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dish Washer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DishWasher fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dish Washer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DishWasher getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BuildingFactory.eINSTANCE.createDishWasher());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DishWasherTest
