package za.co.enigma.turing.mda.process.project.pom;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.apache.maven.model.*;
import org.apache.maven.model.io.xpp3.MavenXpp3Writer;

import za.co.enigma.turing.mda.process.Generatable;
import za.co.enigma.turing.mda.process.common.DirectoryHelper;
import za.co.enigma.turing.mda.process.common.PropertiesHelper;

//@Stateless
public class POMGenerator implements Generatable  {

	private ModelCreator modelCreator;
	private DependenciesCreator dependenciesCreator;
	private PropertiesCreator propertiesCreator;
	
	public POMGenerator() {}

	//@Inject
	public POMGenerator(ModelCreator modelCreator,
			DependenciesCreator dependenciesCreator,
	        PropertiesCreator propertiesCreator) {
		this.modelCreator = modelCreator;
		this.dependenciesCreator = dependenciesCreator;
		this.propertiesCreator = propertiesCreator;
	}
	
	public boolean execute(Properties context) throws Exception {
		boolean executionResult = false;
		Model model = null;
		Properties properties = null;
		List<Dependency> dependencies = null; 
		
		executionResult = modelCreator.execute(context);
		if (executionResult) {
			 model = modelCreator.getModel();
		}
		 
		executionResult =  propertiesCreator.execute(context);
		if (executionResult) {
			properties = propertiesCreator.getProperties();
		}
		
		executionResult = dependenciesCreator.execute(context);
		if (executionResult) {
			dependencies = dependenciesCreator.getDependencies();
		}
		
		
		model.setProperties(properties);
		model.setDependencies(dependencies);
		File file = Paths.get(System.getProperty("user.home"),"turing_enigma_mda","proof-of-concept","pom.xml").toFile();
		Writer writer = new FileWriter(file);
		new MavenXpp3Writer().write(writer, model);
		return true;
	}

	
	public static void main(String[] args) {
		// todo move to project structure (only temp)
		Path path = Paths.get("/home/luckson/turing_enigma_mda/proof-of-concept");
		DirectoryHelper.createProjectDirectories(path);
		
		Path projectStructure = Paths.get("/home/luckson/turing_enigma_mda/proof-of-concept/src/main/java");
		DirectoryHelper.createProjectDirectories(projectStructure);
		
		
		ModelCreator modelCreator1 = new ModelCreator();
		DependenciesCreator dependenciesCreator1 = new DependenciesCreator();
		PropertiesCreator propertiesCreator1 = new PropertiesCreator();
		POMGenerator pomGenerator = new POMGenerator(modelCreator1, dependenciesCreator1, propertiesCreator1);
		
		String propertiesFile = "/home/luckson/turing_enigma_mda/generated_project_pom.properties";
		Properties context = PropertiesHelper.loadAllProperties(propertiesFile);
		try {
			pomGenerator.execute(context);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
