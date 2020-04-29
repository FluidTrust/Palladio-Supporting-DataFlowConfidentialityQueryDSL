package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.resultmapping.generate.ResultMapping
import de.sebinside.dcp.dsl.generator.crossplatform.Converter

abstract class AbstractResultMappingSerializer implements ResultMappingSerializer {

	protected Converter crossPlatformConverter

	package new() {
	}

	override serialize(String caseName, ResultMapping resultMapping) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
