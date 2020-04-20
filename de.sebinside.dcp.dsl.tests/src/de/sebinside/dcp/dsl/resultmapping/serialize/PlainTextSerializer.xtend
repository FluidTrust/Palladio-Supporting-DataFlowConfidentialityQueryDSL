package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.resultmapping.serialize.ResultMappingSerializer
import de.sebinside.dcp.dsl.resultmapping.generate.ResultMapping

class PlainTextSerializer implements ResultMappingSerializer {
	
	override serialize(String caseName, ResultMapping resultMapping) {
		'''Not yet implemented. Received mapping '«resultMapping.toString»'.'''
	}
	
}