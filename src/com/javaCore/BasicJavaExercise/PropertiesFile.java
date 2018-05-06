package com.javaCore.BasicJavaExercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.setProperty("Company", "ABC co.");
			properties.setProperty("Address", "Bay Area,CA");
			properties.setProperty("Totalnoofemployees", "2000");

			File file = new File("/Users/sapna/Documents/workspace/core_java_assignment/src/com/javaCore/BasicJavaExercise/company.properties");
			file.createNewFile();
			FileOutputStream fileOut = new FileOutputStream(file);
			properties.store(fileOut, "companyDetails");
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}