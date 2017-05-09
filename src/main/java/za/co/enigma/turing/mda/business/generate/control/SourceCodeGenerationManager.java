package za.co.enigma.turing.mda.business.generate.control;

import java.io.IOException;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.inject.Inject;

import za.co.enigma.turing.mda.process.TaskPerformable;
import za.co.enigma.turing.mda.process.common.ConfigurationService;
import za.co.enigma.turing.mda.process.project.ProjectStructureGenerator;

@Stateless
public class SourceCodeGenerationManager  implements TaskPerformable {

	private ProjectStructureGenerator projectStructureGenerator;
	private ConfigurationService propertyLoader;
	
	public SourceCodeGenerationManager() {}
	
	@Inject
	public SourceCodeGenerationManager(ProjectStructureGenerator projectStructureGenerator,
										ConfigurationService propertyLoader){
		this.projectStructureGenerator = projectStructureGenerator;
		this.propertyLoader = propertyLoader;
	}

	public boolean runCodeGenerationAgents() throws IOException {
		//TODO: concurrency execution of code
		boolean executionResult = false;
		
		/*Properties projectConfigurations = propertyLoader.getProjectConfigurations();
		executionResult = projectStructureGenerator.execute(projectConfigurations);
		*/
		return executionResult;
	}

	public boolean execute() {
		// TODO Auto-generated method stub
		return false;
	}

		
}
