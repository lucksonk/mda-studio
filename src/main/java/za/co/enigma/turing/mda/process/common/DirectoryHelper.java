package za.co.enigma.turing.mda.process.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

public class DirectoryHelper {

	public static boolean  createProjectDirectories(Path path) {
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
