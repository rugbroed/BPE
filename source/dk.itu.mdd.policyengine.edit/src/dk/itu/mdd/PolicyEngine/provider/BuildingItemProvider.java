/**
 */
package dk.itu.mdd.PolicyEngine.provider;


import dk.itu.mdd.PolicyEngine.Building;
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
 * This is the item provider adapter for a {@link dk.itu.mdd.PolicyEngine.Building} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildingItemProvider
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
	public BuildingItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PolicyEnginePackage.Literals.BUILDING__CTS_SYSTEM);
			childrenFeatures.add(PolicyEnginePackage.Literals.BUILDING__ACCESS_CONTROL);
			childrenFeatures.add(PolicyEnginePackage.Literals.BUILDING__CALENDAR_SYSTEM);
			childrenFeatures.add(PolicyEnginePackage.Literals.BUILDING__MEETING_SCHEDULE_SYSTEM);
			childrenFeatures.add(PolicyEnginePackage.Literals.BUILDING__FLOORS);
			childrenFeatures.add(PolicyEnginePackage.Literals.BUILDING__TIMERS);
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
	 * This returns Building.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Building"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Building)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Building_type") :
			getString("_UI_Building_type") + " " + label;
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

		switch (notification.getFeatureID(Building.class)) {
			case PolicyEnginePackage.BUILDING__CTS_SYSTEM:
			case PolicyEnginePackage.BUILDING__ACCESS_CONTROL:
			case PolicyEnginePackage.BUILDING__CALENDAR_SYSTEM:
			case PolicyEnginePackage.BUILDING__MEETING_SCHEDULE_SYSTEM:
			case PolicyEnginePackage.BUILDING__FLOORS:
			case PolicyEnginePackage.BUILDING__TIMERS:
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
				(PolicyEnginePackage.Literals.BUILDING__CTS_SYSTEM,
				 PolicyEngineFactory.eINSTANCE.createCTS()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.BUILDING__ACCESS_CONTROL,
				 PolicyEngineFactory.eINSTANCE.createAccessControl()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.BUILDING__CALENDAR_SYSTEM,
				 PolicyEngineFactory.eINSTANCE.createCalendarSystem()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.BUILDING__MEETING_SCHEDULE_SYSTEM,
				 PolicyEngineFactory.eINSTANCE.createMeetingScheduleSystem()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.BUILDING__FLOORS,
				 PolicyEngineFactory.eINSTANCE.createFloor()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.BUILDING__TIMERS,
				 PolicyEngineFactory.eINSTANCE.createTimer()));
	}

}
