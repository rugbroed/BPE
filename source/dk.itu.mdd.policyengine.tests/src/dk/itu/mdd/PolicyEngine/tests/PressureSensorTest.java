/**
 */
package dk.itu.mdd.PolicyEngine.tests;

import dk.itu.mdd.PolicyEngine.PolicyEngineFactory;
import dk.itu.mdd.PolicyEngine.PressureSensor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pressure Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PressureSensorTest extends SensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PressureSensorTest.class);
	}

	/**
	 * Constructs a new Pressure Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pressure Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PressureSensor getFixture() {
		return (PressureSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolicyEngineFactory.eINSTANCE.createPressureSensor());
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

} //PressureSensorTest
