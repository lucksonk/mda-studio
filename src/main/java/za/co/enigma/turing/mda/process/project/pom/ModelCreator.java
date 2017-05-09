package za.co.enigma.turing.mda.process.project.pom;

import java.util.Properties;

import javax.ejb.Stateless;

import org.apache.maven.model.Model;

import za.co.enigma.turing.mda.process.Generatable;

//@Stateless
public class ModelCreator implements Generatable {

	private Model model;
	
	public ModelCreator(){}
	
	public boolean execute(Properties context) throws Exception {
		model = new Model();
		
		String version = context.getProperty("pom.model.version");
		model.setVersion(version);
		
		String modelVersion = context.getProperty("pom.model.model_version");
		model.setModelVersion(modelVersion);
		
		String groupId = context.getProperty("pom.model.group_id");
		model.setGroupId(groupId);
		
		String artifactId = context.getProperty("pom.model.artifact_id");
		model.setArtifactId(artifactId);
		
		String packaging = context.getProperty("pom.model.packaging");
		model.setPackaging(packaging);
		
		String name = context.getProperty("pom.model.name");
		model.setName(name);
		
		System.out.println("@@@ Created Maven POM Model @@@");
		return true;
	}
	
	public Model getModel() {
		return model;
	}

	/*public void setModel(Model model) {
		this.model = model;
	}*/
}
