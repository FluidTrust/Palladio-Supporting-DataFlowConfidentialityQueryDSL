package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.serialize

class SerializerFactory {

	static def createPlainTextSerializer() {
		new PlainTextResultMappingSerializer
	}

//	static def createMarkdownSerializer() {
//		new MarkdownResultMappingSerializer
//	}

}
