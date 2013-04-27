/**
 */
package dk.itu.mdd.PolicyEngine.provider;


import dk.itu.mdd.PolicyEngine.Model;
import dk.itu.mdd.PolicyEngine.PolicyEngineFactory;
import dk.itu.mdd.PolicyEngine.PolicyEnginePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dk.itu.mdd.PolicyEngine.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider
	extends NamedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PolicyEnginePackage.Literals.MODEL__BUILDINGS);
			childrenFeatures.add(PolicyEnginePackage.Literals.MODEL__PREDEFINED_ROOMS);
			childrenFeatures.add(PolicyEnginePackage.Literals.MODEL__POLICY_DEFINITION);
			childrenFeatures.add(PolicyEnginePackage.Literals.MODEL__STATE_DEFINITION);
			childrenFeatures.add(PolicyEnginePackage.Literals.MODEL__TIMERS);
			childrenFeatures.add(PolicyEnginePackage.Literals.MODEL__SCHEDULES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Model"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Model)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Model_type") :
			getString("_UI_Model_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Model.class)) {
			case PolicyEnginePackage.MODEL__BUILDINGS:
			case PolicyEnginePackage.MODEL__PREDEFINED_ROOMS:
			case PolicyEnginePackage.MODEL__POLICY_DEFINITION:
			case PolicyEnginePackage.MODEL__STATE_DEFINITION:
			case PolicyEnginePackage.MODEL__TIMERS:
			case PolicyEnginePackage.MODEL__SCHEDULES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.MODEL__BUILDINGS,
				 PolicyEngineFactory.eINSTANCE.createBuilding()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.MODEL__PREDEFINED_ROOMS,
				 PolicyEngineFactory.eINSTANCE.createRoom()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.MODEL__POLICY_DEFINITION,
				 PolicyEngineFactory.eINSTANCE.createPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.MODEL__STATE_DEFINITION,
				 PolicyEngineFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.MODEL__TIMERS,
				 PolicyEngineFactory.eINSTANCE.createTimer()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.MODEL__SCHEDULES,
				 PolicyEngineFactory.eINSTANCE.createSchedule()));
	}

}
