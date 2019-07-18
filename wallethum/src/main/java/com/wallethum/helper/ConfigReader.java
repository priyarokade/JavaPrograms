package com.wallethum.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Config reader class to read the properties
 */
public class ConfigReader {

	public static Properties prop;
	public static File file;
	public static FileInputStream fis;

	public static void loadproperties() throws IOException {
		prop = new Properties();

		file = new File(ResourceHelper.getresourcepath("\\src\\main\\java\\com\\wallethum\\config\\config.properties"));
		fis = new FileInputStream(file);
		prop.load(fis);

	}

	public static String getProperty(String propname) throws IOException {
		loadproperties();
		return prop.getProperty(propname);

	}

}
