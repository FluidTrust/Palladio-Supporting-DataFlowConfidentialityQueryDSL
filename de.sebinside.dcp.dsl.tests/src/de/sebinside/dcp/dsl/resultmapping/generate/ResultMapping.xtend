package de.sebinside.dcp.dsl.resultmapping.generate

import de.sebinside.dcp.dsl.dSL.AttributeClassSelector
import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.Constraint
import de.sebinside.dcp.dsl.dSL.Model
import de.sebinside.dcp.dsl.dSL.PropertyClassSelector
import de.sebinside.dcp.dsl.dSL.TargetModelType
import de.sebinside.dcp.dsl.generator.GlobalConstants
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Optional
import java.util.stream.Collectors
import java.util.stream.Stream
import org.prolog4j.Solution
import org.prolog4j.SolutionIterator
import org.prolog4j.UnknownVariableException

class ResultMapping {

	Model model = null
	Solution<Object> solution = null

	List<EvaluatedConstraint> constraints = null
	List<CharacteristicClass> classes = null
	TargetModelType targetModelType = null

	new(Model model, Solution<Object> solution) {
		this.model = model
		this.solution = solution

		generateMapping()
	}

	def List<EvaluatedConstraint> getEvaluatedConstraints() {
		this.constraints
	}
	
	def List<CharacteristicClass> getCharacteristicClasses() {
		this.classes
	}

	private def generateMapping() {
		this.constraints = new ArrayList<EvaluatedConstraint>
		this.classes = new ArrayList<CharacteristicClass>
		this.targetModelType = model.targetModelType.type

		// Start by iterating over model elements to retrieve constraint details, later needed for the mapping
		for (clazz : model.elements.filter(CharacteristicClass)) {
			this.classes.add(clazz)
		}
		for (constraint : model.elements.filter(Constraint)) {
			this.constraints.add(new EvaluatedConstraint(constraint))
		}

		// Start processing the analysis result
		for (var iterator = solution.iterator(); iterator.hasNext();) {
			handleSolution(iterator)
			iterator.next
		}
	}

	private def handleSolution(SolutionIterator<Object> iterator) {
		val constraintName = getSolutionVariable(iterator, GlobalConstants.Parameters.CONSTRAINT_NAME.toString)
		
		if(constraintName.isEmpty) {
			throw new RuntimeException("A solution does not contain the non-optional constraint name parameter.")
		}
		
		val constraintCandidates = this.constraints.filter[constraint|constraint.constraintName.equals(constraintName.get)]

		if (constraintCandidates.length != 1) {
			throw new RuntimeException(
				"Constraint input and solution result mismatch: Constraint not found or multiple constraints found.")
		}
		val evaluatedConstraint = constraintCandidates.head

		// Retrieve standard query parameters
		val violationQueryType = getSolutionVariable(iterator, GlobalConstants.Parameters.QUERY_TYPE.toString)
		val violationCallStack = getSolutionArray(iterator, GlobalConstants.Parameters.CALL_STACK.toString)
		val violationOperation = getSolutionVariable(iterator, GlobalConstants.Parameters.OPERATION.toString)
		val violationParameter = getSolutionVariable(iterator, GlobalConstants.Parameters.PARAMETER.toString)
		val violationCallState = getSolutionVariable(iterator, GlobalConstants.Parameters.CALL_STATE.toString)

		if (violationQueryType.empty || violationCallStack.empty || violationOperation.empty) {
			throw new RuntimeException("QueryType, CallStack and Operation parameters are required in the solution.")
		}

		// Retrieve (optional) extra class variable unifications
		val classVariableNames = collectClassVariableNames(evaluatedConstraint)
		var classVariables = new HashMap<String, String>
		for (variable : classVariableNames) {
			val value = getSolutionVariable(iterator, '''«GlobalConstants.Prefixes.CLASS_VARIABLE»«variable»''')
			if (value.present) {
				// Prefix has to be removed again
				classVariables.put(variable, value.get)
			}
		}

		evaluatedConstraint.addViolation(
			new Violation(violationQueryType.get, violationCallStack.get, violationOperation.get, violationParameter,
				violationCallState, classVariables))
	}

	private static def Optional<String> getSolutionVariable(SolutionIterator<Object> iterator, String variableName) {
		try {
			Optional.of(iterator.get(variableName).toString)
		} catch (UnknownVariableException e) {
			// This exception is thrown if the variable does not exist. There is no other way to get this information.
			Optional.empty
		} catch (RuntimeException e) {
			// This exception is thrown if the variable exists, but is empty. There is no other way to get this information.
			Optional.of("")
		}
	}

	private static def Optional<List<String>> getSolutionArray(SolutionIterator<Object> iterator, String variableName) {
		try {
			val value = iterator.get(variableName)
			Optional.of(value as List<String>)
		} catch (UnknownVariableException e) {
			// This exception is thrown if the variable does not exist. There is no other way to get this information.
			Optional.empty
		} catch (RuntimeException e) {
			// This exception is thrown if the variable exists, but is empty. There is no other way to get this information.
			Optional.of(new ArrayList<String>())
		}
	}

	private static def collectClassVariableNames(EvaluatedConstraint constraint) {
		// Classes can be used in attribute and property selectors. This has no effect on the variable naming
		val dataSelectorClasses = constraint.dataSelectors.filter(AttributeClassSelector).map [ selector |
			selector.ref
		].toList
		val destinationSelectorClasses = constraint.destinationSelectors.filter(PropertyClassSelector).map [ selector |
			selector.ref
		].toList
		
		val allConstraintClasses = Stream.concat(dataSelectorClasses.toList.stream,
			destinationSelectorClasses.toList.stream).distinct.collect(Collectors.toList)

		allConstraintClasses.map [ clazz |
			clazz.members.map [ member |
				member.ref.name
			]
		].flatten
	}

}
