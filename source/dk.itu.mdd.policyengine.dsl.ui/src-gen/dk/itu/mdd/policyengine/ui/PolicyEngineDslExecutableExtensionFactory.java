/*
 * generated by Xtext
 */
package dk.itu.mdd.policyengine.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import dk.itu.mdd.policyengine.ui.internal.PolicyEngineDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PolicyEngineDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PolicyEngineDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PolicyEngineDslActivator.getInstance().getInjector(PolicyEngineDslActivator.DK_ITU_MDD_POLICYENGINE_POLICYENGINEDSL);
	}
	
}