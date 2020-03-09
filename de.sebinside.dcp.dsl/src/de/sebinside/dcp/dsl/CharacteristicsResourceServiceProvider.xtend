package de.sebinside.dcp.dsl

import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider
import org.eclipse.emf.common.util.URI

class CharacteristicsResourceServiceProvider extends DefaultResourceServiceProvider {
	override boolean canHandle(URI uri) {
		uri.fileExtension().toLowerCase.equals("xmi") || super.canHandle(uri);
	}
}