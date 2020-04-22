package de.sebinside.dcp.dsl.resultmapping.generate

import java.util.List
import java.util.ArrayList
import de.sebinside.dcp.dsl.dSL.Constraint
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

	def getDataSelectors() {
		original.rule.dataSelectors
	}

	def getDestinationSelectors() {
		original.rule.destinationSelectors
	}

	def getStatement() {
		original.rule.statement
	}

	def addViolation(Violation violation) {
		this.violations.add(violation)
	}
}
