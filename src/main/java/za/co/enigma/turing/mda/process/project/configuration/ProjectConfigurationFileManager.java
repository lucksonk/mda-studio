package za.co.enigma.turing.mda.process.project.configuration;

import javax.ejb.Stateless;
import javax.inject.Inject;

import za.co.enigma.turing.mda.process.TaskPerformable;

@Stateless
public class ProjectConfigurationFileManager implements TaskPerformable {

	private BeansXMLGenerator beansXMLGenerator;
	private PersistenceXMLGenerator persistenceXMLGenerator;
	private WebXMLGenerator webXMLGenerator;

	public ProjectConfigurationFileManager() {}

	@Inject
	public ProjectConfigurationFileManager(BeansXMLGenerator beansXMLGenerator,
			PersistenceXMLGenerator persistenceXMLGenerator,
			WebXMLGenerator webXMLGenerator) {
		this.beansXMLGenerator = beansXMLGenerator;
		this.persistenceXMLGenerator = persistenceXMLGenerator;
		this.webXMLGenerator = webXMLGenerator;

	}

	public boolean execute() {
		// TODO Auto-generated method stub
		return false;
	}
}
