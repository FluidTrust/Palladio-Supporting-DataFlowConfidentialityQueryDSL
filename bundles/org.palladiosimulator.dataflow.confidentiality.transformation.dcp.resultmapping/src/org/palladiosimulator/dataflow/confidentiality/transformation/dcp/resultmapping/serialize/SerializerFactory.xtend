package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.serialize

class SerializerFactory {

	static def createPlainTextSerializer(boolean serializeFlowTree) {
		new PlainTextResultMappingSerializer(serializeFlowTree)
	}

//	static def createMarkdownSerializer() {
//		new MarkdownResultMappingSerializer
//	}

}
