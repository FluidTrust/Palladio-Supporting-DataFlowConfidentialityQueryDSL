package de.sebinside.dcp.dsl.resultmapping

import de.sebinside.dcp.dsl.dSL.Model
import org.prolog4j.Solution

class ResultMapper {
	
	Model model = null
	Solution<Object> solution = null
	
	new(Model model, Solution<Object> solution) {
		this.model = model
		this.solution = solution
	}
	
	def String createResult() {
		'''Not yet implemented. Received model '«model.toString»' and solution '«solution.toString»'.'''
	}
	
}