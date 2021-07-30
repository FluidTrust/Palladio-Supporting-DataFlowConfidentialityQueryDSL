package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.jobs;

import java.util.Arrays;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.blackboards.KeyValueMDSDBlackboard;
import org.prolog4j.IProverFactory;
import org.prolog4j.Prover;
import org.prolog4j.Query;
import org.prolog4j.Solution;
import org.prolog4j.swicli.DefaultSWIPrologExecutableProvider;
import org.prolog4j.swicli.SWIPrologCLIProverFactory;
import org.prolog4j.swicli.SWIPrologCLIProverFactory.SWIPrologExecutableProviderStandalone;
import org.prolog4j.swicli.enabler.SWIPrologEmbeddedFallbackExecutableProvider;
import de.uka.ipd.sdq.workflow.jobs.AbstractBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;

public class RunConstraintsQueryJob <T extends KeyValueMDSDBlackboard> extends AbstractBlackboardInteractingJob<T> {
	
	private final String solutionKey;
	private final String constraintsKey;
	private final String prologCodeKey;
	private final String callableQueryKey;
	
	private Prover prover;
	private IProverFactory proverFactory;
	
	public RunConstraintsQueryJob(String prologCodeKey, String constraintsKey, String callableQueryKey, String solutionKey) {
		this.solutionKey = solutionKey;
		this.constraintsKey = constraintsKey;
		this.prologCodeKey = prologCodeKey;
		this.callableQueryKey = callableQueryKey;
		
		this.proverFactory = new SWIPrologCLIProverFactory(
				Arrays.asList(new SWIPrologExecutableProviderStandalone(new DefaultSWIPrologExecutableProvider(), 2),
						new SWIPrologExecutableProviderStandalone(new SWIPrologEmbeddedFallbackExecutableProvider(), 1)));
		
		prover = proverFactory.createProver();
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		monitor.beginTask(getName(), 1);
		var optProgram = getBlackboard().get(prologCodeKey);
		if(optProgram.isEmpty()) {
            throw new JobFailedException("There is no serialized model available on blackboard.");
		}
		
		String prologProgram = (String) optProgram.get();
		
		var optConstraints = getBlackboard().get(constraintsKey);
		if(optConstraints.isEmpty()) {
            throw new JobFailedException("There are no serialized constraints available on blackboard!");
		}
		
		String constraints = (String) optConstraints.get();
		
		var optCallQuery = getBlackboard().get(callableQueryKey);
		if(optCallQuery.isEmpty()) {
            throw new JobFailedException("There are no serialized top level constraint available on blackboard.");
		}
		
		String callQuery = (String) optCallQuery.get();
		
		prover.loadTheory(prologProgram);
		prover.addTheory(constraints);
		Query query = prover.query(callQuery);
		Solution solution = query.solve();
		
		getBlackboard().put(solutionKey, solution);
		
		monitor.worked(1);
        monitor.done();
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
		// do nothing
	}

	@Override
	public String getName() {
		return "Running constraints query on prolog programm";
	}

}
