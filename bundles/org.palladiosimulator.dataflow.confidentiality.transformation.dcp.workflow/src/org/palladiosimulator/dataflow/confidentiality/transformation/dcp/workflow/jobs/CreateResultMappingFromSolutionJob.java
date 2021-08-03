package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.jobs;

import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.ResultMapping;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.serialize.ResultMappingSerializer;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.serialize.SerializerFactory;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.blackboards.KeyValueMDSDBlackboard;
import org.prolog4j.Solution;
import de.sebinside.dcp.dsl.dSL.Model;
import de.sebinside.dcp.dsl.generator.crossplatform.Converter;
import de.uka.ipd.sdq.workflow.jobs.AbstractBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ModelLocation;

public class CreateResultMappingFromSolutionJob <T extends KeyValueMDSDBlackboard> extends AbstractBlackboardInteractingJob<T>{

	private final String solutionKey;
	private final ModelLocation dcpdslLocation;
	private final String resultMappingKey;
	private ResultMappingSerializer serializer;
	
	public CreateResultMappingFromSolutionJob(String solutionKey, ModelLocation dcpdslLocation, String resultMappingKey) {
		this.solutionKey = solutionKey;
		this.dcpdslLocation = dcpdslLocation;
		this.resultMappingKey = resultMappingKey;
		serializer = SerializerFactory.createPlainTextSerializer();
	}
	
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		monitor.beginTask(getName(), 1);
		
		var blackboardSolution = getBlackboard().get(solutionKey);
		@SuppressWarnings("unchecked")
        var optSolution = blackboardSolution.filter(Solution.class::isInstance).map(Solution.class::cast).map(s -> (Solution<Object>)s);
		if(optSolution.isEmpty()) {
            throw new JobFailedException("There are no serialized top level constraint available on blackboard.");
		}
		Solution<Object> solution = optSolution.get();
		
		var dcpdslFiles = getBlackboard().getContents(this.dcpdslLocation)
				.stream()
	            .filter(Model.class::isInstance)
	            .map(Model.class::cast)
	            .collect(Collectors.toList());
		if (dcpdslFiles.size() != 1) {
            throw new JobFailedException("There is not exactly one DCP DSL Constraints file available.");
        }

		Model model = dcpdslFiles.get(0);
		
		var optConverter = getBlackboard().get("converter");
		if(optConverter.isEmpty()) {
            throw new JobFailedException("There are no serialized top level constraint available on blackboard.");
		}
		
		Converter converter = (Converter) optConverter.get();
		
		var result = new ResultMapping(model, converter, solution);
		var serializedResult = serializer.serialize(result);
		
		getBlackboard().put(resultMappingKey, serializedResult);
		
		monitor.worked(1);
        monitor.done();
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException { }

	@Override
	public String getName() {
		return "Create result mapping from solution";
	}

}
