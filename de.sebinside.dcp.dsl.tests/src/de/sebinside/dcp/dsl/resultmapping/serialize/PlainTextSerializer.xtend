package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.resultmapping.serialize.ResultMappingSerializer
import de.sebinside.dcp.dsl.resultmapping.ResultMapping

class PlainTextSerializer implements ResultMappingSerializer {
	
	override serialize(ResultMapping resultMapping) {
		'''Not yet implemented. Received mapping '«resultMapping.toString»'.'''
	}
	
}