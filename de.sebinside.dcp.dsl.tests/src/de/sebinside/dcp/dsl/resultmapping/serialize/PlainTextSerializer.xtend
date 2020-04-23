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
			chapters.add(createConstraintViolationsChapter(constraint))
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

	private static def Optional<String> mapFromSelectorList(List<? extends EObject> selectors,
		Class<? extends EObject> selectorType, BiFunction<EObject, StringBuilder, StringBuilder> processFunction) {

		// The mapping of selectors always follows the same iteration of type-filtered lists
		val filteredSelectors = selectors.filter(selectorType)

		if (filteredSelectors.empty) {
			Optional.empty
		} else {
			val builder = new StringBuilder()

			for (selector : filteredSelectors) {

				if (!builder.toString.equals("")) {
					builder.append(", ")
				}

				processFunction.apply(selector, builder)

			}
			Optional.of(builder.toString)
		}
	}

	private static def mapCharacteristics(List<? extends EObject> selectors) {

		val BiFunction<EObject, StringBuilder, StringBuilder> processingFunction = [ selector, builder |

			// We use reflection here to overcome the need of copy/pasting this code since Data and Node selectors have no common selector super type
			val characteristicSelector = selector.eGet(
				selector.eClass.getEStructuralFeature("ref")) as CharacteristicTypeSelector

			val characteristicName = characteristicSelector.ref.name
			val literals = characteristicSelector.eGet(characteristicSelector.eClass.getEStructuralFeature("literals"),
				true) as List<EnumCharacteristicLiteral>
			val literalNames = literals.map[literal|'''"«literal.entityName»"''']

			builder.append('''"«characteristicName»" set to «if(literalNames.length == 1)
					literalNames.head
					else
					literalNames.join(", ")»"''')

		]

		mapFromSelectorList(selectors, AttributeSelector, processingFunction)
	}

	private static def Optional<String> mapCharacteristicClasses(List<? extends EObject> selectors) {

		val BiFunction<EObject, StringBuilder, StringBuilder> processingFunction = [ selector, builder |
			val characteristicClass = selector.eGet(selector.eClass.getEStructuralFeature("ref")) as CharacteristicClass
			builder.append('''"«characteristicClass.name»"''')
		]

		mapFromSelectorList(selectors, AttributeClassSelector, processingFunction)
	}

	private static def Optional<String> mapNodeIdentities(List<DestinationSelector> selectors) {
		val BiFunction<EObject, StringBuilder, StringBuilder> processingFunction = [ selector, builder |

			val identitySelector = selector as NodeIdentitiySelector

			// TODO: Add Palladio Support
			builder.append('''"«identitySelector.name»"''')

		]

		mapFromSelectorList(selectors, NodeIdentitiySelector, processingFunction)
	}

	private static def mapQueryType(String queryType) {
		// TODO: Implement correctly
		queryType
	}

	private static def mapCallStack(List<String> callStack) {
		// TODO: Implement correctly
		callStack.join(", ")
	}

	private static def String createIfPresent(String title, Optional<String> value) {
		if (value.present) {
			'''«title»: «value.get»'''
		} else {
			""
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
		val condition = Optional.
			of('''Condition: «constraint.statement.modality.name» «constraint.statement.type.name»''')

		val dataAttributeValues = mapCharacteristics(constraint.dataSelectors)
		val dataClassValues = mapCharacteristicClasses(constraint.dataSelectors)

		val nodePropertyValues = mapCharacteristics(constraint.destinationSelectors)
		val nodeClassValues = mapCharacteristicClasses(constraint.destinationSelectors)
		val nodeIdentities = mapNodeIdentities(constraint.destinationSelectors)

		var entries = new ArrayList<String>
		entries.add(createIfPresent("Data Characteristics", dataAttributeValues))
		entries.add(createIfPresent("Data Classes", dataClassValues))
		entries.add(createIfPresent("Condition", condition))
		entries.add(createIfPresent("Destination Characteristics", nodePropertyValues))
		entries.add(createIfPresent("Destination Classes", nodeClassValues))
		entries.add(createIfPresent("Destination Identity", nodeIdentities))

		createChapter(title, entries.filter[entry|!entry.equals("")])
	}

	private def createConstraintViolationsChapter(EvaluatedConstraint constraint) {
		val title = "Constraint violations"

		var violations = new ArrayList<String>

		// TODO: Add palladio support
		for (violation : constraint.violations) {
			val paramter = violation.parameter.isPresent ? violation.parameter.get : violation.callState.get
			val queryType = mapQueryType(violation.queryType)
			val operation = violation.operation
			val callStack = mapCallStack(violation.callStack)

			// TODO: Handle class variables
			violations.
				add('''«violations.length + 1». Parameter "«paramter»" is not allowed to be «queryType» in operation "«operation»".«"\n\t"»- Call Stack: «callStack»''')
		}

		createChapter(title, violations)
	}

}
