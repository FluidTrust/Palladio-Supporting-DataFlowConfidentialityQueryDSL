package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.serialize

import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.ResultMapping
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.nio.file.Files

interface ResultMappingSerializer {
	def String serialize(ResultMapping resultMapping);
	def String fileExtension();
	
	static def saveResult(String path, String result) {
		Files.writeString(Paths.get(path), result, #[StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE])
	}
}
