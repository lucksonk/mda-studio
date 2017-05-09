package za.co.enigma.turing.mda.process.project.pom;

import java.util.Properties;

import javax.ejb.Stateless;

import za.co.enigma.turing.mda.process.Generatable;

//@Stateless
public class PropertiesCreator implements Generatable {

	private Properties properties;
	
	public PropertiesCreator() {}

	public boolean execute(Properties context) throws Exception {
		properties = new Properties();
		
		String endorsed = context.getProperty("pom.properties.endorsed.dir");
		properties.setProperty("endorsed.dir", endorsed);
		
		String sourceEncoding = context.getProperty("pom.properties.project.build.sourceEncoding");
		properties.setProperty("project.build.sourceEncoding", sourceEncoding);
		
		String mavenCompiler = context.getProperty("pom.properties.maven.compiler.source");
		properties.setProperty("maven.compiler.source", mavenCompiler);
		
		String mavenTarget = context.getProperty("pom.properties.maven.compiler.target");
		properties.setProperty("maven.compiler.target", mavenTarget);
		
		
		properties.setProperty("failOnMissingWebXml", "false");
		
		
		properties.setProperty("hibernate.version", "5.2.2.Final");
		
		
		properties.setProperty("version.jbossVFS", "3.1.0.Final");
		
		System.out.println("@@@ Created Maven POM Properties @@@");
		return true;
	}

	public Properties getProperties() {
		return properties;
	}

	/*public void setProperties(Properties properties) {
		this.properties = properties;
	} 
	*/
	
}
