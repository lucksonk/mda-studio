package za.co.enigma.turing.mda.process.transaction;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.lang.model.element.Modifier;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import za.co.enigma.turing.mda.process.Generatable;

@SuppressWarnings("restriction")
@Stateless
public class TransactionScriptingGenerator implements Generatable {

	private static final String PACKAGE_NAME = "za.co.enigma.turing.mda.generated.microservice";

	private static final File SRC_FOLDER = Paths.get(System.getProperty("user.home"),"turing_mda","proof-of-concept","src"
			,"main","java").toFile();

	private File sourcePath = new File(SRC_FOLDER.getAbsolutePath());
	
	public TransactionScriptingGenerator() {}
	

	public void generateSuperHeroClass() {
		
		//Specification for getName() method
		MethodSpec getNameMethod = MethodSpec.methodBuilder("getName")
				.returns(String.class)
				.addModifiers(Modifier.ABSTRACT, Modifier.PROTECTED)
				.build();

		TypeSpec superHero = TypeSpec.classBuilder("SuperHero")
				.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT) //SuperHero class will be PUBLIC ABSTRACT
				.addMethod(getNameMethod) //Add getName() method to SuperHero class
				.addField(String.class, "name", Modifier.PROTECTED)
				.build();

		JavaFile superHeroFile = JavaFile.builder(PACKAGE_NAME, superHero)
				.build();

		try {
			superHeroFile.writeTo(sourcePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void generateIronManClass() {
		//Generated class will be located in "src" folder

		//getName() and getSuperPower() methods
		MethodSpec getNameMethod = MethodSpec.methodBuilder("getName")
				.returns(String.class)
				.addAnnotation(Override.class)
				.addStatement("return this.$N", "name")
				.addModifiers(Modifier.PROTECTED)
				.build();

		MethodSpec getSuperPowerMethod = MethodSpec.methodBuilder("getSuperPower")
				.returns(String.class)
				.addAnnotation(Override.class)
				.addStatement("return $S", "hasMoney")
				.addModifiers(Modifier.PUBLIC)
				.build();

		//Constructor for IronManClass
		MethodSpec constructor = MethodSpec.constructorBuilder()
				.addParameter(String.class, "name")
				.addStatement("this.$N = $N", "name", "name")
				.addModifiers(Modifier.PUBLIC).build();


		//Get name for superclass and interface
		ClassName superClass = ClassName.get(PACKAGE_NAME, "SuperHero");
		ClassName superPowerInterface = ClassName.get(PACKAGE_NAME, "SuperPower");

		//Building IronMan class
		TypeSpec ironMan = TypeSpec.classBuilder("IronMan")
				.addModifiers(Modifier.PUBLIC)
				.superclass(superClass)
				.addMethod(constructor)
				.addMethod(getNameMethod)
				.addMethod(getSuperPowerMethod)
				.addSuperinterface(superPowerInterface)
				.build();

		JavaFile ironManFile = JavaFile.builder(PACKAGE_NAME, ironMan)
				.build();

		try {
			ironManFile.writeTo(sourcePath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void generateSuperPowerInterface() {
		MethodSpec getSuperPowerMethod = MethodSpec.methodBuilder("getSuperPower")
				.returns(String.class)
				.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
				.build();

		TypeSpec superPowerInterface = TypeSpec.interfaceBuilder("SuperPower")
				.addMethod(getSuperPowerMethod)
				.addModifiers(Modifier.PUBLIC).build();

		JavaFile superPowerFile = JavaFile.builder(PACKAGE_NAME, superPowerInterface)
				.build();

		try {
			superPowerFile.writeTo(sourcePath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	public boolean execute(Properties context) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}	
}
