package za.co.enigma.turing.mda.process.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * 
 * @author luckson
 * This Service is responsible for creating/reading enigma's configuration files.
 */
/*@Singleton
@Startup*/
public class ConfigurationService {

/*	@PostConstruct
	public void init() {
		readEnigmaProperties();
		createEnigmaProperties();
		
	}*/

	protected void createEnigmaProperties() {
		Path defaultEnigmaDirectory = Paths.get(System.getProperty("user.home"),"turing_enigma_mda");
		boolean isCreated = DirectoryHelper.createProjectDirectories(defaultEnigmaDirectory);
		if (isCreated) {
			String enigmaPropertiesFile = "enigma.properties";
			Map<String, String> enigmaProperties = new HashMap<String, String>();
			enigmaProperties.put("enigma.default.location", defaultEnigmaDirectory.toString());
			enigmaProperties.put("enigma.default.mysql.location", "/usr");
			enigmaProperties.put("enigma.default.java.home", "/usr/lib/jvm/java-8-oracle");
			enigmaProperties.put("enigma.default.maven.home", "/home/luckson/mda/tools/apache-maven-3.3.9");
			
			createPropertiesFile(enigmaPropertiesFile, enigmaProperties);
			
			String generatedProjectConfiguration = "project_config.properties";
			Map<String, String> generatedProjectConfigValues = new HashMap<String, String>();
			//db connection
			generatedProjectConfigValues.put("model.database", "root:D3v3l0p3r@jdbc:mysql://localhost:3306/ea_mda_training");
			generatedProjectConfigValues.put("knowledge_database", "root:D3v3l0p3r@jdbc:mysql://localhost:3306/ea_knowledge_base");
			// docker
			generatedProjectConfigValues.put("docker.base.image", "/somedockerimage");
			generatedProjectConfigValues.put("docker.target.repo", "/dockertargetrepo");
			generatedProjectConfigValues.put("docker.image.host", "/dockerimagehost");
			// generated code
			generatedProjectConfigValues.put("generated.code.location", "/home/luckson/");
			generatedProjectConfigValues.put("generated.code.swagger", "/home/luckson/");
			generatedProjectConfigValues.put("generated.code.docker", "/home/luckson/");
			
			// database Properties
			generatedProjectConfigValues.put("database.properties.database.type", "mysql");
			generatedProjectConfigValues.put("database.properties.database.auditing.strategy", "hibernate");
			generatedProjectConfigValues.put("database.properties.database.super.username", "root");
			generatedProjectConfigValues.put("database.properties.database.super.password", "D3v3l0p3r");
			generatedProjectConfigValues.put("database.properties.database.max.attribute.name.length", "999");
			generatedProjectConfigValues.put("database.properties.database.max.table.name.length", "999");

			// project
			generatedProjectConfigValues.put("company.name", "Enigma Turing Architects");
			generatedProjectConfigValues.put("package.namespace", "za.co.enigma.business");
			generatedProjectConfigValues.put("module.prefix", "eta");
			
			// runtime
			generatedProjectConfigValues.put("runtime.loadbalancer.ip.address", "172.17.0.1");
			generatedProjectConfigValues.put("runtime.product.database.ip.address", "172.17.0.1");
			generatedProjectConfigValues.put("runtime.product.database.port", "1521");
			
			createPropertiesFile(generatedProjectConfiguration, generatedProjectConfigValues);
			
			String enigmaGeneratedProjectFile = "generated_project_pom.properties";

			Map<String, String> generatedProjectProperties = new HashMap<String, String>();
			generatedProjectProperties.put("pom.model.version", "1.0");
			generatedProjectProperties.put("pom.model.model_version", "4.0.0");
			generatedProjectProperties.put("pom.model.group_id", "za.co.enigma.business");
			generatedProjectProperties.put("pom.model.artifact_id", "enterprise-application");
			generatedProjectProperties.put("pom.model.packaging", "war");
			generatedProjectProperties.put("pom.model.name", "enterprise-application");
			generatedProjectProperties.put("pom.properties.endorsed.dir", "${project.build.directory}/endorsed");
			generatedProjectProperties.put("pom.properties.project.build.sourceEncoding", "UTF-8");
			generatedProjectProperties.put("pom.properties.maven.compiler.source", "1.8");
			generatedProjectProperties.put("pom.properties.maven.compiler.target", "1.8");
			generatedProjectProperties.put("pom.properties.failOnMissingWebXml", "false");
			generatedProjectProperties.put("pom.properties.hibernate.version", "5.2.2.Final");
			generatedProjectProperties.put("pom.properties.version.jbossVFS", "3.1.0.Final");
			
			generatedProjectProperties.put("pom.dependency.platform.group_id", "javax");
			generatedProjectProperties.put("pom.dependency.platform.artifact_id", "javaee-api");
			generatedProjectProperties.put("pom.dependency.platform.version", "7.0");
			generatedProjectProperties.put("pom.dependency.platform.scope", "provided");
			
			generatedProjectProperties.put("pom.dependency.junit.group_id", "junit");
			generatedProjectProperties.put("pom.dependency.junit.artifact_id", "junit");
			generatedProjectProperties.put("pom.dependency.junit.version", "4.12");
			
			generatedProjectProperties.put("pom.dependency.lombok.group_id", "org.projectlombok");
			generatedProjectProperties.put("pom.dependency.lombok.artifact_id", "lombok");
			generatedProjectProperties.put("pom.dependency.lombok.version", "1.16.14");
			
			generatedProjectProperties.put("pom.dependency.jboss_vfs.group_id", "org.jboss");
			generatedProjectProperties.put("pom.dependency.jboss_vfs.artifact_id", "jboss-vfs");
			generatedProjectProperties.put("pom.dependency.jboss_vfs.version", "${version.jbossVFS}");
			
			generatedProjectProperties.put("pom.dependency.hibernate_core.group_id", "org.hibernate");
			generatedProjectProperties.put("pom.dependency.hibernate_core.artifact_id", "hibernate-core");
			generatedProjectProperties.put("pom.dependency.hibernate_core.version", "${hibernate.version}");
			
			generatedProjectProperties.put("pom.dependency.hibernate_entity_manager.group_id", "org.hibernate");
			generatedProjectProperties.put("pom.dependency.hibernate_entity_manager.artifact_id", "hibernate-entitymanager");
			generatedProjectProperties.put("pom.dependency.hibernate_entity_manager.version", "${hibernate.version}");
			
			generatedProjectProperties.put("pom.dependency.faster_xml_core.annotation.group_id", "com.fasterxml.jackson.core");
			generatedProjectProperties.put("pom.dependency.faster_xml_core.annotation.artifact_id", "jackson-annotations");
			generatedProjectProperties.put("pom.dependency.faster_xml_core.annotation.version", "2.8.7");
			
			generatedProjectProperties.put("pom.dependency.faster_xml_core.group_id", "com.fasterxml.jackson.core");
			generatedProjectProperties.put("pom.dependency.faster_xml_core.artifact_id", "jackson-core");
			generatedProjectProperties.put("pom.dependency.faster_xml_core.version", "2.8.7");
			
			createPropertiesFile(enigmaGeneratedProjectFile, generatedProjectProperties);
		}
		
	}

	//TODO refactor try with resources
	protected void createPropertiesFile(String propertiesFileName, Map<String, String> propertiesValues)  {
		Properties property = new Properties();
		OutputStream output = null;
		try {
			File file = Paths.get(System.getProperty("user.home"),"turing_enigma_mda",propertiesFileName).toFile();
			output = new FileOutputStream(file);
			
			Iterator<Entry<String, String>> iterator = propertiesValues.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<String, String> propertyElement = iterator.next();
				property.setProperty(propertyElement.getKey(), propertyElement.getValue());
				System.out.println("@@@ Property " + propertyElement);
			}

			property.store(output, null);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected void readEnigmaProperties() {
		
	}

	protected void loadAllProperties() {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			File file = Paths.get(System.getProperty("user.home"),"turing_enigma_mda","generated_project_pom.properties").toFile();
			input = new FileInputStream(file);

			prop.load(input);

			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				System.out.println("*Key* : " + key + ", *Value* : " + value);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args){
		ConfigurationService service = new ConfigurationService();
		service.createEnigmaProperties();
		service.readEnigmaProperties();
		service.loadAllProperties();
	}

}
