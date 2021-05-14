/*
 * generated by Xtext 2.20.0
 */
package de.sebinside.dcp.dsl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.generic.GenericResourceServiceProvider;

import com.google.inject.Injector;

import de.sebinside.dcp.dsl.dSL.DSLPackage;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DSLStandaloneSetup extends DSLStandaloneSetupGenerated {

	public static void doSetup() {
		new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		super.register(injector);

		IResourceServiceProvider serviceProvider = injector.getInstance(GenericResourceServiceProvider.class);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", serviceProvider);
	}
}
