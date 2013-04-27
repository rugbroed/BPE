/**
 */
package dk.itu.mdd.PolicyEngine.tests;

import dk.itu.mdd.PolicyEngine.PolicyEngineFactory;
import dk.itu.mdd.PolicyEngine.WindowActuator;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Window Actuator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WindowActuatorTest extends ActuatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WindowActuatorTest.class);
	}

	/**
	 * Constructs a new Window Actuator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowActuatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Window Actuator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WindowActuator getFixture() {
		return (WindowActuator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolicyEngineFactory.eINSTANCE.createWindowActuator());
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

} //WindowActuatorTest
