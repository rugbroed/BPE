/**
 */
package dk.itu.mdd.PolicyEngine.provider;


import dk.itu.mdd.PolicyEngine.Policy;
import dk.itu.mdd.PolicyEngine.PolicyEngineFactory;
import dk.itu.mdd.PolicyEngine.PolicyEnginePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dk.itu.mdd.PolicyEngine.Policy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyItemProvider
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
	public PolicyItemProvider(AdapterFactory adapterFactory) {
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

			addDefineStatePropertyDescriptor(object);
			addDuringPropertyDescriptor(object);
			addUsesRoomsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Define State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefineStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Policy_defineState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Policy_defineState_feature", "_UI_Policy_type"),
				 PolicyEnginePackage.Literals.POLICY__DEFINE_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the During feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDuringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Policy_during_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Policy_during_feature", "_UI_Policy_type"),
				 PolicyEnginePackage.Literals.POLICY__DURING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uses Rooms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsesRoomsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Policy_usesRooms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Policy_usesRooms_feature", "_UI_Policy_type"),
				 PolicyEnginePackage.Literals.POLICY__USES_ROOMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(PolicyEnginePackage.Literals.POLICY__USES_ACTUATORS);
			childrenFeatures.add(PolicyEnginePackage.Literals.POLICY__USES_SENSORS);
			childrenFeatures.add(PolicyEnginePackage.Literals.POLICY__SPECIFIED_BY);
			childrenFeatures.add(PolicyEnginePackage.Literals.POLICY__CONTROLLED_BY);
			childrenFeatures.add(PolicyEnginePackage.Literals.POLICY__DEFINE_LOCAL_STATE);
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
	 * This returns Policy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Policy"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Policy)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Policy_type") :
			getString("_UI_Policy_type") + " " + label;
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

		switch (notification.getFeatureID(Policy.class)) {
			case PolicyEnginePackage.POLICY__USES_ACTUATORS:
			case PolicyEnginePackage.POLICY__USES_SENSORS:
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
			case PolicyEnginePackage.POLICY__CONTROLLED_BY:
			case PolicyEnginePackage.POLICY__DEFINE_LOCAL_STATE:
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
				(PolicyEnginePackage.Literals.POLICY__USES_ACTUATORS,
				 PolicyEngineFactory.eINSTANCE.createLightSwitchActuator()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_ACTUATORS,
				 PolicyEngineFactory.eINSTANCE.createWindowActuator()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_ACTUATORS,
				 PolicyEngineFactory.eINSTANCE.createHumidifierActuator()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_ACTUATORS,
				 PolicyEngineFactory.eINSTANCE.createDoorActuator()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_ACTUATORS,
				 PolicyEngineFactory.eINSTANCE.createRadiatorActuator()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_ACTUATORS,
				 PolicyEngineFactory.eINSTANCE.createAudioAlarmActuator()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_SENSORS,
				 PolicyEngineFactory.eINSTANCE.createMotionSensor()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_SENSORS,
				 PolicyEngineFactory.eINSTANCE.createTemperatureSensor()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_SENSORS,
				 PolicyEngineFactory.eINSTANCE.createPressureSensor()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_SENSORS,
				 PolicyEngineFactory.eINSTANCE.createTouchSensor()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_SENSORS,
				 PolicyEngineFactory.eINSTANCE.createLightSensor()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_SENSORS,
				 PolicyEngineFactory.eINSTANCE.createSmokeSensor()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_SENSORS,
				 PolicyEngineFactory.eINSTANCE.createCO2Sensor()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_SENSORS,
				 PolicyEngineFactory.eINSTANCE.createInfraredLightSensor()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__USES_SENSORS,
				 PolicyEngineFactory.eINSTANCE.createHumiditySensor()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__SPECIFIED_BY,
				 PolicyEngineFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__CONTROLLED_BY,
				 PolicyEngineFactory.eINSTANCE.createTimer()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.POLICY__DEFINE_LOCAL_STATE,
				 PolicyEngineFactory.eINSTANCE.createState()));
	}

}
