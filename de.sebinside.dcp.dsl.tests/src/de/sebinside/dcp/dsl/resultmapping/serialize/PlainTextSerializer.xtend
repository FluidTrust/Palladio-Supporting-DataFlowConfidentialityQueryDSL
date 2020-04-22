package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.dSL.AttributeSelector
import de.sebinside.dcp.dsl.dSL.DSLPackage
import de.sebinside.dcp.dsl.dSL.DataSelector
import de.sebinside.dcp.dsl.resultmapping.generate.EvaluatedConstraint
import de.sebinside.dcp.dsl.resultmapping.generate.ResultMapping
import java.util.ArrayList
import java.util.List
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral
import java.util.Optional
import de.sebinside.dcp.dsl.dSL.AttributeClassSelector
import de.sebinside.dcp.dsl.dSL.DestinationSelector
import java.util.function.BiFunction
import de.sebinside.dcp.dsl.dSL.PropertySelector
import de.sebinside.dcp.dsl.dSL.PropertyClassSelector
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector

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

	private static def <T> Optional<String> mapFromSelectorList(List<? super T> selectors, Class<T> selectorType,
		BiFunction<T, StringBuilder, StringBuilder> processFunction) {

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

	private static def mapDataAttributes(List<DataSelector> selectors) {

		val BiFunction<AttributeSelector, StringBuilder, StringBuilder> processingFunction = [ selector, builder |

			val characteristicName = selector.ref.ref.name
			// FIXME: Why is selector.ref.literals not directly accessible?
			val literals = selector.ref.eGet(DSLPackage.Literals.CHARACTERISTIC_TYPE_SELECTOR__LITERALS,
				true) as List<EnumCharacteristicLiteral>
			val literalNames = literals.map[literal|'''"«literal.entityName»"''']

			builder.append('''"«characteristicName»" set to «if(literalNames.length == 1)
					literalNames.head
					else
					literalNames.join(", ")»"''')

		]

		mapFromSelectorList(selectors, AttributeSelector, processingFunction)
	}

	private static def Optional<String> mapDataClasses(List<DataSelector> selectors) {

		val BiFunction<AttributeClassSelector, StringBuilder, StringBuilder> processingFunction = [ selector, builder |
			builder.append('''"«selector.ref.name»"''')

		]

		mapFromSelectorList(selectors, AttributeClassSelector, processingFunction)
	}

	private static def Optional<String> mapNodeClasses(List<DestinationSelector> selectors) {
		// FIXME: Copy/Paste from mapDataClasses since they have not common super class
		val BiFunction<PropertyClassSelector, StringBuilder, StringBuilder> processingFunction = [ selector, builder |
			builder.append('''"«selector.ref.name»"''')

		]

		mapFromSelectorList(selectors, PropertyClassSelector, processingFunction)
	}

	private static def Optional<String> mapNodeProperties(List<DestinationSelector> selectors) {
		// FIXME: Copy/Paste from mapDataAttributes since they have not common super class
		val BiFunction<PropertySelector, StringBuilder, StringBuilder> processingFunction = [ selector, builder |

			val characteristicName = selector.ref.ref.name
			// FIXME: Why is selector.ref.literals not directly accessible?
			val literals = selector.ref.eGet(DSLPackage.Literals.CHARACTERISTIC_TYPE_SELECTOR__LITERALS,
				true) as List<EnumCharacteristicLiteral>
			val literalNames = literals.map[literal|'''"«literal.entityName»"''']

			builder.append('''"«characteristicName»" set to «if(literalNames.length == 1)
					literalNames.head
					else
					literalNames.join(", ")»"''')

		]

		mapFromSelectorList(selectors, PropertySelector, processingFunction)
	}

	private static def Optional<String> mapNodeIdentities(List<DestinationSelector> selectors) {
		val BiFunction<NodeIdentitiySelector, StringBuilder, StringBuilder> processingFunction = [ selector, builder |

			// TODO: Add Palladio Support
			builder.append('''"«selector.name»"''')

		]

		mapFromSelectorList(selectors, NodeIdentitiySelector, processingFunction)
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

		val dataAttributeValues = mapDataAttributes(constraint.dataSelectors)
		val dataClassValues = mapDataClasses(constraint.dataSelectors)

		val nodePropertyValues = mapNodeProperties(constraint.destinationSelectors)
		val nodeClassValues = mapNodeClasses(constraint.destinationSelectors)
		val nodeIdentities = mapNodeIdentities(constraint.destinationSelectors)

		var entries = new ArrayList<String>

		if (dataAttributeValues.present)
			entries.add('''Data Characteristics: «dataAttributeValues.get»''')
		if (dataClassValues.present)
			entries.add('''Data Classes: «dataClassValues.get»''')

		if (condition.present)
			entries.add('''Condition: «condition.get»''')

		if (nodePropertyValues.present)
			entries.add('''Destination Characteristics: «nodePropertyValues.get»''')
		if (nodeClassValues.present)
			entries.add('''Destination Classes: «nodeClassValues.get»''')
		if (nodeIdentities.present)
			entries.add('''Destination Identity: «nodeIdentities.get»''')

		createChapter(title, entries)
	}

}
