/**
 */
package dk.itu.mdd.PolicyEngine.provider;


import dk.itu.mdd.PolicyEngine.If;
import dk.itu.mdd.PolicyEngine.PolicyEngineFactory;
import dk.itu.mdd.PolicyEngine.PolicyEnginePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dk.itu.mdd.PolicyEngine.If} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfItemProvider
	extends ItemProviderAdapter
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
	public IfItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PolicyEnginePackage.Literals.IF__COND);
			childrenFeatures.add(PolicyEnginePackage.Literals.IF__THEN);
			childrenFeatures.add(PolicyEnginePackage.Literals.IF__ELSEIF);
			childrenFeatures.add(PolicyEnginePackage.Literals.IF__ELSE);
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
	 * This returns If.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/If"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_If_type");
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

		switch (notification.getFeatureID(If.class)) {
			case PolicyEnginePackage.IF__COND:
			case PolicyEnginePackage.IF__THEN:
			case PolicyEnginePackage.IF__ELSEIF:
			case PolicyEnginePackage.IF__ELSE:
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
				(PolicyEnginePackage.Literals.IF__COND,
				 PolicyEngineFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__COND,
				 PolicyEngineFactory.eINSTANCE.createResetExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__COND,
				 PolicyEngineFactory.eINSTANCE.createManyExpressions()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__COND,
				 PolicyEngineFactory.eINSTANCE.createCompExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__THEN,
				 PolicyEngineFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__THEN,
				 PolicyEngineFactory.eINSTANCE.createResetExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__THEN,
				 PolicyEngineFactory.eINSTANCE.createManyExpressions()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__THEN,
				 PolicyEngineFactory.eINSTANCE.createCompExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__ELSEIF,
				 PolicyEngineFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__ELSE,
				 PolicyEngineFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__ELSE,
				 PolicyEngineFactory.eINSTANCE.createResetExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__ELSE,
				 PolicyEngineFactory.eINSTANCE.createManyExpressions()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyEnginePackage.Literals.IF__ELSE,
				 PolicyEngineFactory.eINSTANCE.createCompExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == PolicyEnginePackage.Literals.IF__COND ||
			childFeature == PolicyEnginePackage.Literals.IF__THEN ||
			childFeature == PolicyEnginePackage.Literals.IF__ELSE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PolicyEngineEditPlugin.INSTANCE;
	}

}
