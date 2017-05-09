package za.co.enigma.turing.mda.process.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import javax.ejb.Stateless;
import javax.inject.Inject;

import za.co.enigma.turing.mda.process.Generatable;
import za.co.enigma.turing.mda.process.common.ConfigurationService;
import za.co.enigma.turing.mda.process.project.configuration.ProjectConfigurationFileManager;
import za.co.enigma.turing.mda.process.project.pom.POMGenerator;

//@Stateless
public class ProjectStructureGenerator implements Generatable {

	private static final String PROJECT_LOCATION = "project_location";
	private static final String PROJECT_POM = "project_location";

	private POMGenerator pomGenerator;
	private ProjectConfigurationFileManager projectConfigurationFileManager;
	private ConfigurationService propertyLoader;
	
	public ProjectStructureGenerator(){}

	//@Inject
	public ProjectStructureGenerator(POMGenerator pomGenerator,
			ProjectConfigurationFileManager projectConfigurationFileManager,
			ConfigurationService propertyLoader){
		this.pomGenerator = pomGenerator;
		this.projectConfigurationFileManager = projectConfigurationFileManager;
		this.propertyLoader = propertyLoader;
	}
	
	public boolean execute(Properties properties) throws IOException {
		boolean executionResult = false;
		String projectLocation = properties.getProperty(PROJECT_LOCATION);

		executionResult = createProject(projectLocation);
		
		/*Properties projectPom = propertyLoader.getProjectPom();		
		executionResult =  createProjectPOM(projectPom);
		*/
		return executionResult;
	}

	protected boolean createProject(String projectLocation) {
		boolean executionResult = false;
		Path generationFolder = null;
		
		if (projectLocation.isEmpty()) {
			generationFolder = Paths.get(System.getProperty("user.home"),"turing_enigma_mda");
			executionResult = createProjectDirectories(generationFolder);
			
		} else {
			generationFolder = Paths.get(projectLocation);
			executionResult = createProjectDirectories(generationFolder);
		}
		return executionResult;
	}

	protected boolean createProjectConfigurationFiles() {
		return false;
	}

	protected boolean createProjectPOM(Properties projectPom) throws IOException {
	//	pomGenerator.execute(projectPom);
		return false;


	}

	protected boolean createProjectStructureLayers() {

		return false;
	}

	private boolean createProjectDirectories(Path path) {
		Set<PosixFilePermission> permissions = new HashSet<PosixFilePermission>();
		permissions.add(PosixFilePermission.GROUP_EXECUTE);
		permissions.add(PosixFilePermission.GROUP_READ);
		permissions.add(PosixFilePermission.GROUP_WRITE);
		permissions.add(PosixFilePermission.OTHERS_EXECUTE);
		permissions.add(PosixFilePermission.OTHERS_READ);
		permissions.add(PosixFilePermission.OTHERS_WRITE);
		permissions.add(PosixFilePermission.OWNER_EXECUTE);
		permissions.add(PosixFilePermission.OWNER_READ);
		permissions.add(PosixFilePermission.OWNER_WRITE);
		
		FileAttribute<Set<PosixFilePermission>> posixattrs =
				PosixFilePermissions.asFileAttribute(permissions);
		try {
			LinkOption options = LinkOption.NOFOLLOW_LINKS;
			if (!Files.exists(path, options)) {
				Files.createDirectory(path, posixattrs);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

}
