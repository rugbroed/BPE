/**
 */
package dk.itu.kben.building.tests;

import dk.itu.kben.building.BuildingFactory;
import dk.itu.kben.building.Heater;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Heater</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HeaterTest extends TestCase {

	/**
	 * The fixture for this Heater test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Heater fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HeaterTest.class);
	}

	/**
	 * Constructs a new Heater test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Heater test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Heater fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Heater test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Heater getFixture() {
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
		setFixture(BuildingFactory.eINSTANCE.createHeater());
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

} //HeaterTest
