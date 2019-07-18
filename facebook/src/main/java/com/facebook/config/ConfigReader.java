package com.facebook.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/***
 * 
 * @author priya ConfigReader class to read properties from config.properties
 */
public class ConfigReader {
	public static Properties prop;
	public static File file;
	public static FileInputStream fis;

	public static void loadproperties() throws IOException {
		prop = new Properties();
		file = new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\facebook\\config\\config.properties");
		fis = new FileInputStream(file);
		prop.load(fis);

	}

	public static String getProperty(String propname) throws IOException {
		loadproperties();
		return prop.getProperty(propname);

	}
}
