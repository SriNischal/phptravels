package com.atmecs.travelphp.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.atmecs.travelphp.constants.ProjectBaseConstantPaths;

public class PhpTravelsProperties {

	public String readHomrPagePropertiesFile(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ProjectBaseConstantPaths.LOCATORS_FILE);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
	
	public String readSelectPagePropertiesFile(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ProjectBaseConstantPaths.LOCATORS_FILE11);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
	
	public String readBookingPagePropertiesFile(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ProjectBaseConstantPaths.LOCATORS_FILE1);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}

	public static String readConfig(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ProjectBaseConstantPaths.CONFIG_FILE);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}

}
