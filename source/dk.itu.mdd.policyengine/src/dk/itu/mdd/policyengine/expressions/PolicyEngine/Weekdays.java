/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Weekdays</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getWeekdays()
 * @model
 * @generated
 */
public enum Weekdays implements Enumerator {
	/**
	 * The '<em><b>MONDAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONDAY_VALUE
	 * @generated
	 * @ordered
	 */
	MONDAY(0, "MONDAY", "MONDAY"),

	/**
	 * The '<em><b>TUESDAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUESDAY_VALUE
	 * @generated
	 * @ordered
	 */
	TUESDAY(1, "TUESDAY", "TUESDAY"),

	/**
	 * The '<em><b>WEDENSDAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEDENSDAY_VALUE
	 * @generated
	 * @ordered
	 */
	WEDENSDAY(2, "WEDENSDAY", "WEDENSDAY"),

	/**
	 * The '<em><b>THURSDAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THURSDAY_VALUE
	 * @generated
	 * @ordered
	 */
	THURSDAY(3, "THURSDAY", "THURSDAY"),

	/**
	 * The '<em><b>FRIDAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIDAY_VALUE
	 * @generated
	 * @ordered
	 */
	FRIDAY(4, "FRIDAY", "FRIDAY"),

	/**
	 * The '<em><b>SATURDAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATURDAY_VALUE
	 * @generated
	 * @ordered
	 */
	SATURDAY(5, "SATURDAY", "SATURDAY"),

	/**
	 * The '<em><b>SUNDAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUNDAY_VALUE
	 * @generated
	 * @ordered
	 */
	SUNDAY(6, "SUNDAY", "SUNDAY");

	/**
	 * The '<em><b>MONDAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONDAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONDAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONDAY_VALUE = 0;

	/**
	 * The '<em><b>TUESDAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TUESDAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUESDAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TUESDAY_VALUE = 1;

	/**
	 * The '<em><b>WEDENSDAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEDENSDAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEDENSDAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEDENSDAY_VALUE = 2;

	/**
	 * The '<em><b>THURSDAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THURSDAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THURSDAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THURSDAY_VALUE = 3;

	/**
	 * The '<em><b>FRIDAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRIDAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRIDAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRIDAY_VALUE = 4;

	/**
	 * The '<em><b>SATURDAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SATURDAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SATURDAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SATURDAY_VALUE = 5;

	/**
	 * The '<em><b>SUNDAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUNDAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUNDAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUNDAY_VALUE = 6;

	/**
	 * An array of all the '<em><b>Weekdays</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Weekdays[] VALUES_ARRAY =
		new Weekdays[] {
			MONDAY,
			TUESDAY,
			WEDENSDAY,
			THURSDAY,
			FRIDAY,
			SATURDAY,
			SUNDAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Weekdays</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Weekdays> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Weekdays</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Weekdays get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Weekdays result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weekdays</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Weekdays getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Weekdays result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weekdays</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Weekdays get(int value) {
		switch (value) {
			case MONDAY_VALUE: return MONDAY;
			case TUESDAY_VALUE: return TUESDAY;
			case WEDENSDAY_VALUE: return WEDENSDAY;
			case THURSDAY_VALUE: return THURSDAY;
			case FRIDAY_VALUE: return FRIDAY;
			case SATURDAY_VALUE: return SATURDAY;
			case SUNDAY_VALUE: return SUNDAY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Weekdays(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Weekdays
