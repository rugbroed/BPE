/**
 */
package dk.itu.kben.building.tests;

import dk.itu.kben.building.BuildingFactory;
import dk.itu.kben.building.HumanMotionSensor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Human Motion Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HumanMotionSensorTest extends MotionSensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HumanMotionSensorTest.class);
	}

	/**
	 * Constructs a new Human Motion Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanMotionSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Human Motion Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HumanMotionSensor getFixture() {
		return (HumanMotionSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BuildingFactory.eINSTANCE.createHumanMotionSensor());
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

} //HumanMotionSensorTest
