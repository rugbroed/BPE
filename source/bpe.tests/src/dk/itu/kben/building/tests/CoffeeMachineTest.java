/**
 */
package dk.itu.kben.building.tests;

import dk.itu.kben.building.BuildingFactory;
import dk.itu.kben.building.CoffeeMachine;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Coffee Machine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoffeeMachineTest extends TestCase {

	/**
	 * The fixture for this Coffee Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoffeeMachine fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CoffeeMachineTest.class);
	}

	/**
	 * Constructs a new Coffee Machine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeMachineTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Coffee Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CoffeeMachine fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Coffee Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoffeeMachine getFixture() {
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
		setFixture(BuildingFactory.eINSTANCE.createCoffeeMachine());
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

} //CoffeeMachineTest
