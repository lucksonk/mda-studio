package za.co.enigma.turing.mda.process.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesHelper {

	public  static Properties loadAllProperties(String propertiesFile) {
		Properties properties = new Properties();
		InputStream input = null;

		try {
			File file = Paths.get(propertiesFile).toFile();
			input = new FileInputStream(file);

			properties.load(input);

			Enumeration<?> e = properties.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = properties.getProperty(key);
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
		return properties;
	}

}
