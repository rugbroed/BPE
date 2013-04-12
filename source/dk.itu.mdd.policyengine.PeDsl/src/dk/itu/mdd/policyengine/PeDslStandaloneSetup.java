
package dk.itu.mdd.policyengine;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PeDslStandaloneSetup extends PeDslStandaloneSetupGenerated{

	public static void doSetup() {
		new PeDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

