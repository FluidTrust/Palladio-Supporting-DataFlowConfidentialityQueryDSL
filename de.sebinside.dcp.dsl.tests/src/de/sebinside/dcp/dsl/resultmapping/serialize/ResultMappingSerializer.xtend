package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.resultmapping.generate.ResultMapping

interface ResultMappingSerializer {
	def String serialize(String caseName, ResultMapping resultMapping);
	def String fileExtension();
}