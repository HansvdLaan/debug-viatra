package validator;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IMatchUpdateListener;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements;
import org.eclipse.xtext.xbase.lib.Extension;

import com.google.common.base.Objects;

import queries.AccessRelation;
import queries.DemarcationShouldHaveAPermission;
import queries.OnlyOneDirector;
import queries.OnlyOneOperationsManager;
import queries.OnlyOneRnDManager;
import queries.Policy;
import queries.PrerequisiteEverybodyHasAccessToLobby;
import queries.PrerequisiteVaultImpliesOpenOffice;
import queries.RoleName;
import queries.RoleShouldHaveADemarcation;
import queries.SoDEmployeeAndContractor;
import queries.SoDEmployeeAndVisitor;
import queries.TestQueries;
import queries.UserShouldHaveARole;

public class Validator implements IApplication {

	/**
	 * Transformation-related extensions
	 */
	@Extension
	private BatchTransformation transformation;

	@Extension
	private BatchTransformationStatements statements;

	/**
	 * Transformation rule-related extensions
	 */
	@Extension
	private BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory();

	@Extension
	private IModelManipulations manipulation;

	@Override
	public Object start(IApplicationContext context) throws Exception {
		
		System.out.println("Validator Called!");
		System.out.print("Initialize model scope and preparing engine... ");
		EMFScope scope = initializeModelScope();
		AdvancedViatraQueryEngine engine = prepareAdvancedQueryEngine(scope);
		System.out.println(" Done!");
		
		Thread.sleep(5000);
		
		System.out.println("\nAdding Change Listeners... ");
		addChangeListeners(engine);
		System.out.println("Done!");
		
		Thread.sleep(5000);
		
		System.out.println("\nSearching for Access Relation Matches... ");
		printAllAccessRelationMatches(engine);
		System.out.println("Done!");
		
		Thread.sleep(5000);
		
		System.out.println("\nCreate and Execute Model Transformation");
		createTransformation(engine);
		execute();
		System.out.println("Done!");
		
		return 0; // Return value 0 is considered as a successful execution on Unix systems
	}

	@Override
	public void stop() {
		// Headless applications do not require specific stop steps
	}

	private EMFScope initializeModelScope() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResource(URI.createPlatformPluginURI("rbacviatratest/trebla.rbac", true), true);

		return new EMFScope(rs);
	}

	private AdvancedViatraQueryEngine prepareAdvancedQueryEngine(EMFScope scope) {
		AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(scope);

		// Initialize all queries on engine
		TestQueries.instance().prepare(engine);

		return engine;
	}


	private void addChangeListeners(AdvancedViatraQueryEngine engine) {
		try {
			// fireNow = true parameter means all current matches are sent to the listener
			
			// Add some other Listeners
			engine.addMatchUpdateListener(UserShouldHaveARole.Matcher.on(engine), ListenerFactory.getUserShouldHaveARoleUpdateListener(), true);
			engine.addMatchUpdateListener(RoleShouldHaveADemarcation.Matcher.on(engine), ListenerFactory.getRoleShouldHaveADemarcationUpdateListener(), true);
			engine.addMatchUpdateListener(DemarcationShouldHaveAPermission.Matcher.on(engine), ListenerFactory.getDemarcationShouldHaveAPermissionUpdateListener(), true);
			
			engine.addMatchUpdateListener(OnlyOneDirector.Matcher.on(engine), ListenerFactory.getOnlyOneDirectorUpdateListeer(), true);
			engine.addMatchUpdateListener(OnlyOneRnDManager.Matcher.on(engine), ListenerFactory.getOnlyOneRnDManagerUpdateListener(), true);
			engine.addMatchUpdateListener(OnlyOneOperationsManager.Matcher.on(engine), ListenerFactory.getOnlyOneOperationsManagerUpdateListener(), true);
			
			engine.addMatchUpdateListener(SoDEmployeeAndContractor.Matcher.on(engine), ListenerFactory.getSoDEmployeeAndContractorUpdateListener(), true);
			engine.addMatchUpdateListener(SoDEmployeeAndVisitor.Matcher.on(engine), ListenerFactory.getSoDEmployeeAndVisitorUpdateListener(), true);

			engine.addMatchUpdateListener(PrerequisiteEverybodyHasAccessToLobby.Matcher.on(engine), ListenerFactory.getPrerequisiteEveryHasAccessToLobbyUpdateListener(), true);
			engine.addMatchUpdateListener(PrerequisiteVaultImpliesOpenOffice.Matcher.on(engine), ListenerFactory.getPrerequisiteVaultImpliesOpenOfficeUpdateListener(), true);


			// Add Access Relation Listener
			engine.addMatchUpdateListener(AccessRelation.Matcher.on(engine), ListenerFactory.getAccessRelationUpdateListener(), true);
			
			// Add Role Name Listener
			engine.addMatchUpdateListener(RoleName.Matcher.on(engine), ListenerFactory.getRoleNameMatchUpdateListener(), true);
			
						

		} finally {
			// Don't forget to remove listeners if not required anymore
			// TODO: move this to a separate method
			//engine.removeMatchUpdateListener(matcherRoleName, listenerRoleName);
			//engine.removeMatchUpdateListener(matcherSameRoleName, listenerSameRoleName);
		}
	}

	private void printAllRoleNameMatches(ViatraQueryEngine engine) {
		// Access pattern matcher
		RoleName.Matcher matcher = RoleName.Matcher.on(engine);
		// Get and iterate over all matches
		for (RoleName.Match match : matcher.getAllMatches()) {
			// Print all the matches to the standard output
			System.out.println("Found Role:" + match.getName());
		}
	}
	
	private void printAllAccessRelationMatches(ViatraQueryEngine engine) {
		// Access pattern matcher
		AccessRelation.Matcher matcher = AccessRelation.Matcher.on(engine);
		// Get and iterate over all matches
		for (AccessRelation.Match match : matcher.getAllMatches()) {
			// Print all the matches to the standard output
			System.out.println("Found Access Relation:" + match.prettyPrint());
		}
	}

	public void execute() {
		System.out.println("Execute Called!");
		this.statements.<Policy.Match>fireOne(this.getExampleRule());
	}

	private BatchTransformationStatements createTransformation(AdvancedViatraQueryEngine engine) {
		BatchTransformationStatements _xblockexpression = null;
		{
			SimpleModelManipulations _simpleModelManipulations = new SimpleModelManipulations(engine);
			this.manipulation = _simpleModelManipulations;
			this.transformation = BatchTransformation.forEngine(engine).build();
			_xblockexpression = this.statements = this.transformation.getTransformationStatements();
		}
		return _xblockexpression;
	}

	  private BatchTransformationRule<Policy.Match, Policy.Matcher> getExampleRule() {
		    final Consumer<Policy.Match> _function = (Policy.Match it) -> {
		    	it.getPolicy().getRoles().get(0).setName("R2");
		    };
		    final BatchTransformationRule<Policy.Match, Policy.Matcher> exampleRule = this.factory.<Policy.Match, Policy.Matcher>createRule(Policy.instance()).action(_function).build();
		    return exampleRule;
	  }

	public void dispose() {
		boolean _notEquals = (!Objects.equal(this.transformation, null));
		if (_notEquals) {
			this.transformation.getRuleEngine().dispose();
		}
		this.transformation = null;
		return;
	}

}
