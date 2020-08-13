package com.nt.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment {

	static FileInputStream file;
	static Properties prop;
	static String path = System.getProperty("user.dir") + "/resources/config.properties";

	public Environment() {
		try {
			file = new FileInputStream(path);
			prop = new Properties();
			prop.load(file);
		} catch (IOException e) {
			e.getCause();
		}
	}

	public static String getUsername() {
		return prop.getProperty("username");
	}

	public static String getPassword() {
		return prop.getProperty("password");
	}

	public static String getURL() {
		return prop.getProperty("url");
	}

}
