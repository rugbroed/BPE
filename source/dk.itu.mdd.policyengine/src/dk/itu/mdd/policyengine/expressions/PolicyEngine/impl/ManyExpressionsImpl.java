/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine.impl;

import dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many Expressions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ManyExpressionsImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ManyExpressionsImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ManyExpressionsImpl#getManyexpr <em>Manyexpr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyExpressionsImpl extends ExpressionImpl implements ManyExpressions {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected CompExpression expression;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operators OPERATOR_EDEFAULT = Operators.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operators operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManyexpr() <em>Manyexpr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyexpr()
	 * @generated
	 * @ordered
	 */
	protected EList<ManyExpressions> manyexpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyExpressionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.MANY_EXPRESSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(CompExpression newExpression, NotificationChain msgs) {
		CompExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.MANY_EXPRESSIONS__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(CompExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.MANY_EXPRESSIONS__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.MANY_EXPRESSIONS__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.MANY_EXPRESSIONS__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operators getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operators newOperator) {
		Operators oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.MANY_EXPRESSIONS__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManyExpressions> getManyexpr() {
		if (manyexpr == null) {
			manyexpr = new EObjectContainmentEList<ManyExpressions>(ManyExpressions.class, this, PolicyEnginePackage.MANY_EXPRESSIONS__MANYEXPR);
		}
		return manyexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.MANY_EXPRESSIONS__EXPRESSION:
				return basicSetExpression(null, msgs);
			case PolicyEnginePackage.MANY_EXPRESSIONS__MANYEXPR:
				return ((InternalEList<?>)getManyexpr()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.MANY_EXPRESSIONS__EXPRESSION:
				return getExpression();
			case PolicyEnginePackage.MANY_EXPRESSIONS__OPERATOR:
				return getOperator();
			case PolicyEnginePackage.MANY_EXPRESSIONS__MANYEXPR:
				return getManyexpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PolicyEnginePackage.MANY_EXPRESSIONS__EXPRESSION:
				setExpression((CompExpression)newValue);
				return;
			case PolicyEnginePackage.MANY_EXPRESSIONS__OPERATOR:
				setOperator((Operators)newValue);
				return;
			case PolicyEnginePackage.MANY_EXPRESSIONS__MANYEXPR:
				getManyexpr().clear();
				getManyexpr().addAll((Collection<? extends ManyExpressions>)newValue);
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
			case PolicyEnginePackage.MANY_EXPRESSIONS__EXPRESSION:
				setExpression((CompExpression)null);
				return;
			case PolicyEnginePackage.MANY_EXPRESSIONS__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case PolicyEnginePackage.MANY_EXPRESSIONS__MANYEXPR:
				getManyexpr().clear();
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
			case PolicyEnginePackage.MANY_EXPRESSIONS__EXPRESSION:
				return expression != null;
			case PolicyEnginePackage.MANY_EXPRESSIONS__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case PolicyEnginePackage.MANY_EXPRESSIONS__MANYEXPR:
				return manyexpr != null && !manyexpr.isEmpty();
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
		result.append(" (Operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ManyExpressionsImpl
