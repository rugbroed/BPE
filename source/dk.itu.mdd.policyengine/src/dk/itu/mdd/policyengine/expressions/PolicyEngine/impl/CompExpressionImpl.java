/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine.impl;

import dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CompExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CompExpressionImpl#getCompare <em>Compare</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CompExpressionImpl#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompExpressionImpl extends ExpressionImpl implements CompExpression {
	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected Clause expr;

	/**
	 * The default value of the '{@link #getCompare() <em>Compare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare()
	 * @generated
	 * @ordered
	 */
	protected static final CompOps COMPARE_EDEFAULT = CompOps.GREATER;

	/**
	 * The cached value of the '{@link #getCompare() <em>Compare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare()
	 * @generated
	 * @ordered
	 */
	protected CompOps compare = COMPARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected static final int CONSTANT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected int constant = CONSTANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.COMP_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(Clause newExpr, NotificationChain msgs) {
		Clause oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.COMP_EXPRESSION__EXPR, oldExpr, newExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(Clause newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.COMP_EXPRESSION__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.COMP_EXPRESSION__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.COMP_EXPRESSION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompOps getCompare() {
		return compare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompare(CompOps newCompare) {
		CompOps oldCompare = compare;
		compare = newCompare == null ? COMPARE_EDEFAULT : newCompare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.COMP_EXPRESSION__COMPARE, oldCompare, compare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(int newConstant) {
		int oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.COMP_EXPRESSION__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.COMP_EXPRESSION__EXPR:
				return basicSetExpr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolicyEnginePackage.COMP_EXPRESSION__EXPR:
				return getExpr();
			case PolicyEnginePackage.COMP_EXPRESSION__COMPARE:
				return getCompare();
			case PolicyEnginePackage.COMP_EXPRESSION__CONSTANT:
				return getConstant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PolicyEnginePackage.COMP_EXPRESSION__EXPR:
				setExpr((Clause)newValue);
				return;
			case PolicyEnginePackage.COMP_EXPRESSION__COMPARE:
				setCompare((CompOps)newValue);
				return;
			case PolicyEnginePackage.COMP_EXPRESSION__CONSTANT:
				setConstant((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PolicyEnginePackage.COMP_EXPRESSION__EXPR:
				setExpr((Clause)null);
				return;
			case PolicyEnginePackage.COMP_EXPRESSION__COMPARE:
				setCompare(COMPARE_EDEFAULT);
				return;
			case PolicyEnginePackage.COMP_EXPRESSION__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PolicyEnginePackage.COMP_EXPRESSION__EXPR:
				return expr != null;
			case PolicyEnginePackage.COMP_EXPRESSION__COMPARE:
				return compare != COMPARE_EDEFAULT;
			case PolicyEnginePackage.COMP_EXPRESSION__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (compare: ");
		result.append(compare);
		result.append(", constant: ");
		result.append(constant);
		result.append(')');
		return result.toString();
	}

} //CompExpressionImpl
