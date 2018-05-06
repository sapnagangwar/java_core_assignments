package com.javaCore.BasicJavaExercise;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestResourceBundle {
	
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.javaCore.BasicJavaExercise.company");
		Enumeration <String> keys = rb.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = rb.getString(key);
			System.out.println(key + ": " + value);
		}
	}
}
