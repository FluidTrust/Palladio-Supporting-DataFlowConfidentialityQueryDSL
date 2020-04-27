package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.dSL.AttributeClassSelector
import de.sebinside.dcp.dsl.dSL.AttributeSelector
import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector
import de.sebinside.dcp.dsl.dSL.DestinationSelector
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.resultmapping.generate.EvaluatedConstraint
import de.sebinside.dcp.dsl.resultmapping.generate.ResultMapping
import java.util.ArrayList
import java.util.List
import java.util.Optional
import java.util.function.BiFunction
import org.eclipse.emf.ecore.EObject
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral
import java.util.Map
import de.sebinside.dcp.dsl.dSL.PropertySelector
import de.sebinside.dcp.dsl.dSL.PropertyClassSelector
import de.sebinside.dcp.dsl.generator.GlobalConstants

class PlainTextSerializer implements ResultMappingSerializer {

	static final int TITLE_LENGTH = 40

	String caseName = null
	ResultMapping resultMapping = null

	override serialize(String caseName, ResultMapping resultMapping) {
		this.caseName = caseName
		this.resultMapping = resultMapping

		var chapters = new ArrayList<String>
		chapters.add(createGeneralChapter)

		for (constraint : resultMapping.evaluatedConstraints) {
			chapters.add(createConstraintOverviewChapter(constraint))
			chapters.add(createConstraintDetailsChapter(constraint))
			chapters.add(createConstraintViolationsChapter(constraint, resultMapping.getCharacteristicClasses))
		}

		combineChapters(chapters)
	}

	private static def createDashedTitle(String value) {
		val int dashCount = (TITLE_LENGTH - value.length) / 2 - 2
		val String dashes = "-".repeat(dashCount)
		val title = '''«dashes» «value» «dashes»'''

		return title.length == TITLE_LENGTH - 3
			? '''«title»-''' : title
	}

	private static def createChapter(String title, String... entries) {
		val header = createDashedTitle(title.toUpperCase)
		val builder = new StringBuilder(header)

		builder.append("\n")

		for (entry : entries) {
			builder.append("\n")
			builder.append(entry)
		}

		builder.toString
	}

	private static def combineChapters(List<String> chapters) {
		val builder = new StringBuilder()

		for (chapter : chapters) {
			builder.append(chapter)
			builder.append("\n\n")
		}

		builder.toString
	}

	private static def mapCharacteristicTypeSelectors(Iterable<CharacteristicTypeSelector> selectors) {
		val builder = new StringBuilder()

		for (selector : selectors) {

			if (!builder.toString.equals("")) {
				builder.append(", ")
			}

			val characteristicName = selector.ref.name
			val literalNames = selector.literals.map[literal|'''"«literal.entityName»"''']

			builder.append('''"«characteristicName»" «if(selector.negated) "not " else ""»set to «if(literalNames.length == 1)
					literalNames.head
					else
					literalNames.join(", ")»"''')
		}

		builder.toString
	}

	private static def mapCharacteristicClasses(Iterable<CharacteristicClass> classes) {
		val builder = new StringBuilder()

		for (clazz : classes) {

			if (!builder.toString.equals("")) {
				builder.append(", ")
			}

			builder.append('''"«clazz.name»"''')
		}

		builder.toString
	}

	private static def mapNodeIdentities(Iterable<NodeIdentitiySelector> nodeIdentities) {
		val builder = new StringBuilder()

		for (node : nodeIdentities) {

			if (!builder.toString.equals("")) {
				builder.append(", ")
			}

			// TODO: Add Palladio Support
			builder.append('''"«node.name»"''')
		}

		builder.toString
	}

	private static def mapQueryType(String queryType) {

		// TODO: Add special Palladio support
		val typeCandidates = GlobalConstants.QueryTypes.values.filter[value|value.toString.equals(queryType)]

		if (typeCandidates.length != 1) {
			throw new RuntimeException("Illegal query type.")
		}

		switch (typeCandidates.head) {
			case CALL_ARGUMENT: "call argument"
			case RETURN_VALUE: "return value"
			case PRE_CALL_STATE: "call state"
			case POST_CALL_STATE: "call state"
		}
	}

	private static def mapCallStack(List<String> callStack) {
		// TODO: Add Palladio Support
		callStack.map[call|'''"«call»"'''].join(" <- ")
	}

	private static def mapClassVariables(Map<String, String> classVariableValueMap,
		Map<String, CharacteristicClass> classVariableClassMap) {
		val builder = new StringBuilder()

		for (variable : classVariableValueMap.keySet) {
			val clazz = classVariableClassMap.get(variable)
			val value = classVariableValueMap.get(variable)

			if (!builder.toString.equals("")) {
				builder.append(", ")
			}

			builder.append('''Parameter "«variable»" (Class "«clazz.name»") set to "«value»"''')
		}

		builder.toString
	}

	private static def addEntryIfPresent(String title, String value, List<String> entries) {
		if (!value.equals("")) {
			entries.add('''«title»: «value»''')
		}
	}

	private def createGeneralChapter() {
		val title = "General"
		val caseName = '''Case name: «this.caseName»'''
		val constraintCount = '''Constraint count: «resultMapping.evaluatedConstraints.length»'''

		createChapter(title, caseName, constraintCount)
	}

	private def createConstraintOverviewChapter(EvaluatedConstraint constraint) {
		val title = "Overview"
		val constraintName = '''Constraint name: "«constraint.constraintName»"'''
		val violationCount = '''Violations found: «constraint.violations.length»'''

		createChapter(title, constraintName, violationCount)
	}

	private def createConstraintDetailsChapter(EvaluatedConstraint constraint) {
		val title = "Constraint Details"
		val condition = '''Condition: «constraint.statement.modality.name» «constraint.statement.type.name»'''

		// TODO: Rework these again using more functional programming
		val attributeValues = mapCharacteristicTypeSelectors(constraint.attributeSelectors)
		val attributeClassValues = mapCharacteristicClasses(constraint.attributeClasses)

		val propertyValues = mapCharacteristicTypeSelectors(constraint.propertySelectors)
		val propertyClassValues = mapCharacteristicClasses(constraint.propertyClasses)
		val nodeIdentities = mapNodeIdentities(constraint.nodeIdentities)

		var entries = new ArrayList<String>
		addEntryIfPresent("Data Characteristics", attributeValues, entries)
		addEntryIfPresent("Data Classes", attributeClassValues, entries)
		addEntryIfPresent("Condition", condition, entries)
		addEntryIfPresent("Destination Characteristics", propertyValues, entries)
		addEntryIfPresent("Destination Classes", propertyClassValues, entries)
		addEntryIfPresent("Destination Identity", nodeIdentities, entries)

		createChapter(title, entries)
	}

	private def createConstraintViolationsChapter(EvaluatedConstraint constraint,
		List<CharacteristicClass> characteristicClasses) {
		val title = "Constraint violations"

		var violations = new ArrayList<String>
		val newLineSeparator = "\n\t"

		// TODO: Add palladio support
		for (violation : constraint.violations) {
			val paramter = violation.parameter.isPresent ? violation.parameter.get : violation.callState.get
			val queryType = mapQueryType(violation.queryType)
			val operation = violation.operation
			val callStack = mapCallStack(violation.callStack)

			val violationInfo = '''«violations.length + 1». Parameter "«paramter»" is not allowed to be «queryType» in operation "«operation»".'''
			val callstackInfo = '''- Call Stack: «callStack»'''

			val classVariables = mapClassVariables(violation.classVariableValueMap, violation.classVariableClassMap)
			val classVariableInfo = classVariables.equals("") ? "" : '''- Characteristic Classes: «classVariables»'''

			violations.add('''«violationInfo»«newLineSeparator»«callstackInfo»«newLineSeparator»«classVariableInfo»''')
		}

		createChapter(title, violations)
	}

}
