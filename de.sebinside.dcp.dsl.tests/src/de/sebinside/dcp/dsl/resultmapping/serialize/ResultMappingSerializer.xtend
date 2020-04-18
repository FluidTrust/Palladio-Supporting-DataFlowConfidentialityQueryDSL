package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.resultmapping.ResultMapping

interface ResultMappingSerializer {
	def String serialize(ResultMapping resultMapping);
}