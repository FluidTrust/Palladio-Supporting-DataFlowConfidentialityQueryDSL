package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.resultmapping.serialize.ResultMappingSerializer
import de.sebinside.dcp.dsl.resultmapping.generate.ResultMapping
import java.util.List
import java.util.ArrayList

class PlainTextSerializer implements ResultMappingSerializer {

	static final int TITLE_LENGTH = 40
	
	String caseName = null
	ResultMapping resultMapping = null

	override serialize(String caseName, ResultMapping resultMapping) {
		this.caseName = caseName
		this.resultMapping = resultMapping
		
		var chapters = new ArrayList<String>
		chapters.add(createGeneralChapter)
		
		combineChapters(chapters)
	}

	private static def createDashedTitle(String value) {
		val int dashCount = (TITLE_LENGTH - value.length) / 2 - 2
		val String dashes = "-".repeat(dashCount)
		val title = '''«dashes» «value» «dashes»'''

		return title.length == TITLE_LENGTH - 1
			? '''«title»-''' : title
	}
	
	private static def createChapter(String title, String... entries) {
		val header = createDashedTitle(title.toUpperCase)
		val builder = new StringBuilder(header)
		
		for(entry: entries) {
			builder.append("\n")
			builder.append(entry)
		}
		
		builder.toString
	}
	
	private static def combineChapters(List<String> chapters) {
		val builder = new StringBuilder()
		
		for(chapter: chapters) {
			builder.append(chapter)
			builder.append("\n\n")
		}
		
		chapters.toString
	}
	
	private def createGeneralChapter() {
		val title = "Overview"
		val caseName = '''Case name: «this.caseName»'''
		val constraintCount = '''Constraint count: «resultMapping.evaluatedConstraints.length»'''
		
		createChapter(title, caseName, constraintCount)
	}

}
