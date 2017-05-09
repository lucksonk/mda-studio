package za.co.enigma.turing.mda.process.project.pom;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.ejb.Stateless;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;

import za.co.enigma.turing.mda.process.Generatable;

// TODO loads of work to dynamically create dependencies on prop file.
//@Stateless
public class DependenciesCreator implements Generatable {
	
	private List<Dependency> dependencies;
	
	public DependenciesCreator(){}
	
	
	public boolean execute(Properties context) throws Exception {
		buildDependencies(context);
		
		System.out.println("@@@ Created Maven POM Dependencies @@@");
		return true;
	}
	
	
	//TODO refactor remove hard coding
	public List<Dependency>  buildDependencies(Properties context) {
		dependencies = new ArrayList<Dependency>();
		Dependency platformDependency = new Dependency();
		platformDependency.setGroupId("javax");
		platformDependency.setArtifactId("javaee-api");
		platformDependency.setVersion("7.0");
		platformDependency.setScope("provided");

		dependencies.add(platformDependency);

		Dependency junitDependency = new Dependency();
		junitDependency.setGroupId("junit");
		junitDependency.setArtifactId("junit");
		junitDependency.setVersion("4.12");

		dependencies.add(junitDependency);

		Dependency lombokDependency = new Dependency();
		lombokDependency.setGroupId("org.projectlombok");
		lombokDependency.setArtifactId("lombok");
		lombokDependency.setVersion("1.16.14");


		dependencies.add(lombokDependency);


		Dependency jbossVFSDependency  = new Dependency();
		jbossVFSDependency.setGroupId("org.jboss");
		jbossVFSDependency.setArtifactId("jboss-vfs");
		jbossVFSDependency.setVersion("${version.jbossVFS}");

		dependencies.add(jbossVFSDependency);

		Dependency hibernateCoreDependency  = new Dependency();
		hibernateCoreDependency.setGroupId("org.hibernate");
		hibernateCoreDependency.setArtifactId("hibernate-core");
		hibernateCoreDependency.setVersion("${hibernate.version}");

		dependencies.add(hibernateCoreDependency);

		Dependency hibernateEntityManagerDependency  = new Dependency();
		hibernateEntityManagerDependency.setGroupId("org.hibernate");
		hibernateEntityManagerDependency.setArtifactId("hibernate-entitymanager");
		hibernateEntityManagerDependency.setVersion("${hibernate.version}");

		dependencies.add(hibernateEntityManagerDependency);


		String fasterXmlCore = "com.fasterxml.jackson.core";
		String fasterXmlVersion = "2.8.7";

		Dependency fasterXmlCoreAnnotationsDependency = new Dependency();
		fasterXmlCoreAnnotationsDependency.setGroupId(fasterXmlCore);
		fasterXmlCoreAnnotationsDependency.setArtifactId("jackson-annotations");
		fasterXmlCoreAnnotationsDependency.setVersion(fasterXmlVersion);

		Dependency fasterXmlCoreDependency = new Dependency();
		fasterXmlCoreDependency.setGroupId(fasterXmlCore);
		fasterXmlCoreDependency.setArtifactId("jackson-core");
		fasterXmlCoreDependency.setVersion(fasterXmlVersion);

		dependencies.add(fasterXmlCoreDependency);
		dependencies.add(fasterXmlCoreAnnotationsDependency);
		
		Dependency platformServices = new Dependency();
		platformServices.setGroupId("za.co.enigma.turing.mda");
		platformServices.setArtifactId("platform-services");
		platformServices.setVersion("1.0");
		
		dependencies.add(platformServices);
		
		return dependencies;
	}

	public List<Dependency> getDependencies() {
		return dependencies;
	}

	/*	
	public void setDependencies(List<Dependency> dependencies) {
		this.dependencies = dependencies;
	}
	
    public Dependency buildDependency() {
		return null;
	}*/



}
