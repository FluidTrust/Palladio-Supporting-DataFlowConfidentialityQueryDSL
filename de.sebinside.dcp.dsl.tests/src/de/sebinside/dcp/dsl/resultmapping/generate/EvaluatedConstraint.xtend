package de.sebinside.dcp.dsl.resultmapping.generate

import java.util.List
import java.util.ArrayList
import de.sebinside.dcp.dsl.dSL.Constraint
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.EObject
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector
import de.sebinside.dcp.dsl.dSL.AttributeSelector
import de.sebinside.dcp.dsl.dSL.PropertySelector
import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.AttributeClassSelector
import de.sebinside.dcp.dsl.dSL.PropertyClassSelector
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector

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

	def List<CharacteristicTypeSelector> getAttributeSelectors() {
		getFilteredSelectorsRef(original.rule.dataSelectors, AttributeSelector)
	}

	def List<CharacteristicTypeSelector> getPropertySelectors() {
		getFilteredSelectorsRef(original.rule.destinationSelectors, PropertySelector)
	}

	def List<CharacteristicClass> getAttributeClasses() {
		getFilteredSelectorsRef(original.rule.dataSelectors, AttributeClassSelector)
	}

	def List<CharacteristicClass> getPropertyClasses() {
		getFilteredSelectorsRef(original.rule.dataSelectors, PropertyClassSelector)
	}

	def List<NodeIdentitiySelector> getNodeIdentities() {
		original.rule.destinationSelectors.filter(NodeIdentitiySelector).toList
	}

	@Deprecated
	def getDataSelectors() {
		original.rule.dataSelectors
	}

	@Deprecated
	def getDestinationSelectors() {
		original.rule.destinationSelectors
	}

	def getStatement() {
		original.rule.statement
	}

	def addViolation(Violation violation) {
		this.violations.add(violation)
	}

	private static def <T> List<T> getFilteredSelectorsRef(List<? extends EObject> selectors,
		Class<? extends EObject> selectorType) {
		selectors.filter(selectorType).map [ selector |
			// We use reflection here because not all selectors have the same super types
			selector.eGet(selector.eClass.getEStructuralFeature("ref")) as T
		].toList
	}
}
