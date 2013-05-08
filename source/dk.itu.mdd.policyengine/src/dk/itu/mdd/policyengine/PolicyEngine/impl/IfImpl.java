/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.Expression;
import dk.itu.mdd.policyengine.PolicyEngine.If;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.PolicyEngine.Statement;

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
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.IfImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.IfImpl#getThen <em>Then</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.IfImpl#getElse <em>Else</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.IfImpl#getElseif <em>Elseif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends StatementImpl implements If {
	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected Expression cond;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> else_;

	/**
	 * The cached value of the '{@link #getElseif() <em>Elseif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseif()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> elseif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCond(Expression newCond, NotificationChain msgs) {
		Expression oldCond = cond;
		cond = newCond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.IF__COND, oldCond, newCond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond(Expression newCond) {
		if (newCond != cond) {
			NotificationChain msgs = null;
			if (cond != null)
				msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.IF__COND, null, msgs);
			if (newCond != null)
				msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.IF__COND, null, msgs);
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.IF__COND, newCond, newCond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getThen() {
		if (then == null) {
			then = new EObjectContainmentEList<Expression>(Expression.class, this, PolicyEnginePackage.IF__THEN);
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getElse() {
		if (else_ == null) {
			else_ = new EObjectContainmentEList<Statement>(Statement.class, this, PolicyEnginePackage.IF__ELSE);
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getElseif() {
		if (elseif == null) {
			elseif = new EObjectContainmentEList<Statement>(Statement.class, this, PolicyEnginePackage.IF__ELSEIF);
		}
		return elseif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.IF__COND:
				return basicSetCond(null, msgs);
			case PolicyEnginePackage.IF__THEN:
				return ((InternalEList<?>)getThen()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.IF__ELSE:
				return ((InternalEList<?>)getElse()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.IF__ELSEIF:
				return ((InternalEList<?>)getElseif()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.IF__COND:
				return getCond();
			case PolicyEnginePackage.IF__THEN:
				return getThen();
			case PolicyEnginePackage.IF__ELSE:
				return getElse();
			case PolicyEnginePackage.IF__ELSEIF:
				return getElseif();
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
			case PolicyEnginePackage.IF__COND:
				setCond((Expression)newValue);
				return;
			case PolicyEnginePackage.IF__THEN:
				getThen().clear();
				getThen().addAll((Collection<? extends Expression>)newValue);
				return;
			case PolicyEnginePackage.IF__ELSE:
				getElse().clear();
				getElse().addAll((Collection<? extends Statement>)newValue);
				return;
			case PolicyEnginePackage.IF__ELSEIF:
				getElseif().clear();
				getElseif().addAll((Collection<? extends Statement>)newValue);
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
			case PolicyEnginePackage.IF__COND:
				setCond((Expression)null);
				return;
			case PolicyEnginePackage.IF__THEN:
				getThen().clear();
				return;
			case PolicyEnginePackage.IF__ELSE:
				getElse().clear();
				return;
			case PolicyEnginePackage.IF__ELSEIF:
				getElseif().clear();
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
			case PolicyEnginePackage.IF__COND:
				return cond != null;
			case PolicyEnginePackage.IF__THEN:
				return then != null && !then.isEmpty();
			case PolicyEnginePackage.IF__ELSE:
				return else_ != null && !else_.isEmpty();
			case PolicyEnginePackage.IF__ELSEIF:
				return elseif != null && !elseif.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
