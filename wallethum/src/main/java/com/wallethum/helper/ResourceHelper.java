package com.wallethum.helper;

/*
 * Resource helper to get the path of perticular resource
 */
public class ResourceHelper {

	public static String projectbasepath = System.getProperty("user.dir");

	public static String getresourcepath(String path) {

		String newresourcepath = projectbasepath + path;
		System.out.println("New resource path : " + newresourcepath);
		return newresourcepath;

	}

}
