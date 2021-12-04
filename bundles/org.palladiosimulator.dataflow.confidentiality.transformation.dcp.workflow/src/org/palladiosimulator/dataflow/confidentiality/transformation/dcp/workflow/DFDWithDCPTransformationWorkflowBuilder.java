package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.SaveOptions;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.impl.TransformDFDWithDCPConstraintsToPrologWorkflowImpl;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.internal.Activator;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.jobs.CreateResultMappingFromSolutionJob;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.jobs.RunConstraintsQueryJob;
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.jobs.TransfromDFDConstraintsToPrologJob;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.TransformationWorkflowBuilder;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.blackboards.KeyValueMDSDBlackboard;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.jobs.LoadModelJob;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.jobs.SerializeModelToStringJob;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary;
import org.prolog4j.IProverFactory;

import de.sebinside.dcp.dsl.dSL.Model;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ModelLocation;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

public class DFDWithDCPTransformationWorkflowBuilder extends TransformationWorkflowBuilder {
	
	private static final ModelLocation DEFAULT_DCPDSL_LOCATION = new ModelLocation("dfd", URI.createFileURI("tmp/constaints.DCPDSL"));
	private static final ModelLocation DEFAULT_CONSTRAINTS_LOCATION = new ModelLocation("constraints", URI.createFileURI("tmp/constraints.pl"));
	private static final ModelLocation DEFAULT_CALLABLE_QUERY_LOCATION = new ModelLocation("query", URI.createFileURI("tmp/query.pl"));
	private static final String DEFAULT_CONSTRAINTS_KEY = "stringconstraints";
	private static final String DEFAULT_CALLABLE_QUERY_KEY = "stringquery";
	private static final String DEFAULT_SOLUTION_KEY = "solution";
	
	
	private ModelLocation dcpdslLocation;
//	private ModelLocation ddcLocation;
	private IProverFactory proverFactory;
	private boolean serializeFlowTree = true;
	
	protected final Collection<IJob> dcpPrologSerializationJobs = new ArrayList<>();
	
	public TransformDFDWithDCPConstraintsToPrologWorkflow build() {
		var jobSequence = super.createJobSequence();
		
		// validate state
		Validate.validState(dcpdslLocation != null, "A DFD diagram has to be given");
		//Validate.validState(dcpdslLocation != null, "DCP DSL constraints have to be given");
        Validate.validState(!dcpPrologSerializationJobs.isEmpty(), "At least one serialization option for DCP DSL constraints has to be given");
		
        if (proverFactory == null) {
            var proverFactories = Activator.getInstance()
                .getProverManager()
                .getProvers()
                .values();
            Validate.isTrue(!proverFactories.isEmpty());
            proverFactory = proverFactories.iterator()
                .next();
        }
        
		//add load existing dcpDSL model; add to blackboard at DEFAULT_DCPDSL_LOCATION
        var loadDCPJob = new LoadModelJob<>(dcpdslLocation);
        jobSequence.add(loadDCPJob);

        //initialize partitions for transformed prolog constraints and callable query
        getBlackboard().addPartition(DEFAULT_CONSTRAINTS_LOCATION.getPartitionID(), new ResourceSetPartition());
        getBlackboard().addPartition(DEFAULT_CALLABLE_QUERY_LOCATION.getPartitionID(), new ResourceSetPartition());
        
        // create transformation job
        jobSequence.add(new TransfromDFDConstraintsToPrologJob<KeyValueMDSDBlackboard>(dcpdslLocation, DEFAULT_CONSTRAINTS_LOCATION, DEFAULT_CALLABLE_QUERY_LOCATION, DEFAULT_TRACE_KEY));
		
		//add serialize model job; prolog constraints at DEFAULT_CONSTRAINTS_LOCATION
		jobSequence.addAll(dcpPrologSerializationJobs);
		
		//add serialize model job; toplevel constraints at DEFAULT_CALLABLE_QUERY_LOCATION
		jobSequence.add(new SerializeModelToStringJob(DEFAULT_CALLABLE_QUERY_LOCATION, SaveOptions.newBuilder().format().getOptions().toOptionsMap(), DEFAULT_CALLABLE_QUERY_KEY));
		
		jobSequence.add(new RunConstraintsQueryJob<>(DEFAULT_PROLOG_KEY, DEFAULT_CONSTRAINTS_KEY, DEFAULT_CALLABLE_QUERY_KEY, DEFAULT_SOLUTION_KEY, proverFactory));

		jobSequence.add(new CreateResultMappingFromSolutionJob<>(DEFAULT_SOLUTION_KEY, dcpdslLocation, "", serializeFlowTree));
		
		return new TransformDFDWithDCPConstraintsToPrologWorkflowImpl(jobSequence, progressMonitor, workflowExceptionHandler, getBlackboard(), 
				DEFAULT_PROLOG_KEY, DEFAULT_TRACE_KEY, DEFAULT_CONSTRAINTS_KEY);
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addDFD(DataFlowDiagram dfd, DataDictionary dd, Model dcp) {
		getBlackboard().removePartition(DEFAULT_DFD_LOCATION.getPartitionID());
		getBlackboard().addPartition(DEFAULT_DFD_LOCATION.getPartitionID(), new ResourceSetPartition());
		
		getBlackboard().setContents(DEFAULT_DD_LOCATION, Arrays.asList(dd));
		getBlackboard().setContents(DEFAULT_DFD_LOCATION, Arrays.asList(dfd));
		getBlackboard().setContents(DEFAULT_DCPDSL_LOCATION, Arrays.asList(dcp));
		dfdLocation = DEFAULT_DFD_LOCATION;
//		ddcLocation = DEFAULT_DFD_LOCATION;
		dcpdslLocation = DEFAULT_DCPDSL_LOCATION;
		return this;
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addDDC(URI ddcURI) {
//		ddcLocation = new ModelLocation(dfdLocation.getPartitionID(), ddcURI);
		return this;
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addDCPDSL(URI dcpURI) {
		dcpdslLocation = new ModelLocation(dfdLocation.getPartitionID(), dcpURI);
		return this;
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addSerializeDCPPrologToString(Map<Object, Object> saveOptions) {
		dcpPrologSerializationJobs.removeIf(SerializeModelToStringJob.class::isInstance);
		var serializeJob = new SerializeModelToStringJob(DEFAULT_CONSTRAINTS_LOCATION, saveOptions, DEFAULT_CONSTRAINTS_KEY);
		dcpPrologSerializationJobs.add(serializeJob);
		return this;
	}
	
	public DFDWithDCPTransformationWorkflowBuilder addProverFactory(IProverFactory proverFactory) {
	    this.proverFactory = proverFactory;
	    return this;
	}
	
	public DFDWithDCPTransformationWorkflowBuilder setSerializeFlowTree(boolean serializationFlag) {
	    this.serializeFlowTree = serializationFlag;
	    return this;
	}
}
