package de.sebinside.dcp.dsl.resultmapping.serialize

class SerializerFactory {

	static def createPlainTextSerializer() {
		new PlainTextResultMappingSerializer
	}

	static def createMarkdownSerializer() {
		new MarkdownResultMappingSerializer
	}

}
