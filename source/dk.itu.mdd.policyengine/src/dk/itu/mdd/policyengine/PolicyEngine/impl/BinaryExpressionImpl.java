/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression;
import dk.itu.mdd.policyengine.PolicyEngine.Expression;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryExpressionImpl#getLeftExpr <em>Left Expr</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryExpressionImpl#getRightExpr <em>Right Expr</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The cached value of the '{@link #getLeftExpr() <em>Left Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression leftExpr;

	/**
	 * The cached value of the '{@link #getRightExpr() <em>Right Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression rightExpr;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftExpr() {
		return leftExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftExpr(Expression newLeftExpr, NotificationChain msgs) {
		Expression oldLeftExpr = leftExpr;
		leftExpr = newLeftExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BINARY_EXPRESSION__LEFT_EXPR, oldLeftExpr, newLeftExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftExpr(Expression newLeftExpr) {
		if (newLeftExpr != leftExpr) {
			NotificationChain msgs = null;
			if (leftExpr != null)
				msgs = ((InternalEObject)leftExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BINARY_EXPRESSION__LEFT_EXPR, null, msgs);
			if (newLeftExpr != null)
				msgs = ((InternalEObject)newLeftExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BINARY_EXPRESSION__LEFT_EXPR, null, msgs);
			msgs = basicSetLeftExpr(newLeftExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BINARY_EXPRESSION__LEFT_EXPR, newLeftExpr, newLeftExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightExpr() {
		return rightExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightExpr(Expression newRightExpr, NotificationChain msgs) {
		Expression oldRightExpr = rightExpr;
		rightExpr = newRightExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BINARY_EXPRESSION__RIGHT_EXPR, oldRightExpr, newRightExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightExpr(Expression newRightExpr) {
		if (newRightExpr != rightExpr) {
			NotificationChain msgs = null;
			if (rightExpr != null)
				msgs = ((InternalEObject)rightExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BINARY_EXPRESSION__RIGHT_EXPR, null, msgs);
			if (newRightExpr != null)
				msgs = ((InternalEObject)newRightExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BINARY_EXPRESSION__RIGHT_EXPR, null, msgs);
			msgs = basicSetRightExpr(newRightExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BINARY_EXPRESSION__RIGHT_EXPR, newRightExpr, newRightExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BINARY_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.BINARY_EXPRESSION__LEFT_EXPR:
				return basicSetLeftExpr(null, msgs);
			case PolicyEnginePackage.BINARY_EXPRESSION__RIGHT_EXPR:
				return basicSetRightExpr(null, msgs);
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
			case PolicyEnginePackage.BINARY_EXPRESSION__LEFT_EXPR:
				return getLeftExpr();
			case PolicyEnginePackage.BINARY_EXPRESSION__RIGHT_EXPR:
				return getRightExpr();
			case PolicyEnginePackage.BINARY_EXPRESSION__OPERATOR:
				return getOperator();
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
			case PolicyEnginePackage.BINARY_EXPRESSION__LEFT_EXPR:
				setLeftExpr((Expression)newValue);
				return;
			case PolicyEnginePackage.BINARY_EXPRESSION__RIGHT_EXPR:
				setRightExpr((Expression)newValue);
				return;
			case PolicyEnginePackage.BINARY_EXPRESSION__OPERATOR:
				setOperator((String)newValue);
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
			case PolicyEnginePackage.BINARY_EXPRESSION__LEFT_EXPR:
				setLeftExpr((Expression)null);
				return;
			case PolicyEnginePackage.BINARY_EXPRESSION__RIGHT_EXPR:
				setRightExpr((Expression)null);
				return;
			case PolicyEnginePackage.BINARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case PolicyEnginePackage.BINARY_EXPRESSION__LEFT_EXPR:
				return leftExpr != null;
			case PolicyEnginePackage.BINARY_EXPRESSION__RIGHT_EXPR:
				return rightExpr != null;
			case PolicyEnginePackage.BINARY_EXPRESSION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BinaryExpressionImpl
