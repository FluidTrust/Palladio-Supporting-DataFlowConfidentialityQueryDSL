package de.sebinside.dcp.dsl.resultmapping.generate

import de.sebinside.dcp.dsl.dSL.AttributeClassSelector
import de.sebinside.dcp.dsl.dSL.AttributeSelector
import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector
import de.sebinside.dcp.dsl.dSL.Constraint
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.dSL.PropertyClassSelector
import de.sebinside.dcp.dsl.dSL.PropertySelector
import java.util.ArrayList
import java.util.List
import java.util.stream.Collectors
import java.util.stream.Stream
import org.eclipse.xtend.lib.annotations.Accessors

class EvaluatedConstraint {

	@Accessors(PRIVATE_GETTER, PRIVATE_SETTER) Constraint original = null
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER) List<Violation> violations = null

	new(Constraint original) {
		this.original = original
		this.violations = new ArrayList<Violation>
	}

	def getConstraintName() {
		original.name
	}

	def Iterable<CharacteristicTypeSelector> getAttributeSelectors() {
		original.rule.dataSelectors.filter(AttributeSelector).map[selector|selector.ref]
	}

	def Iterable<CharacteristicTypeSelector> getPropertySelectors() {
		original.rule.destinationSelectors.filter(PropertySelector).map[selector|selector.ref]
	}

	def Iterable<CharacteristicClass> getAttributeClasses() {
		original.rule.dataSelectors.filter(AttributeClassSelector).map[selector|selector.ref]
	}

	def Iterable<CharacteristicClass> getPropertyClasses() {
		original.rule.destinationSelectors.filter(PropertyClassSelector).map[selector|selector.ref]
	}

	def Iterable<NodeIdentitiySelector> getNodeIdentities() {
		original.rule.destinationSelectors.filter(NodeIdentitiySelector)
	}

	def Iterable<CharacteristicClass> getAllClasses() {
		Stream.concat(attributeClasses.toList.stream, propertyClasses.toList.stream).distinct.collect(Collectors.toList)
	}

	def getStatement() {
		original.rule.statement
	}

	def addViolation(Violation violation) {
		this.violations.add(violation)
	}
}
