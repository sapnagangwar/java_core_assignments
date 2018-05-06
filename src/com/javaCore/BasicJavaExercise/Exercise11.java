package com.javaCore.BasicJavaExercise;

import java.util.HashMap;
import java.util.Map;

/*
 * Define HashMap state code and state name
 */
public class Exercise11 {

	private HashMap map;

	public Exercise11() {
		this.map = new HashMap<String, String>();
	}
	
	public HashMap<String, String> getMap() {
		return map;
	}

	public HashMap<String, String> addStateCodeAndName(String stateCode, String stateName) {
		map.put(stateCode, stateName);
		return map;
	}

	public void displayMap() {
		for (Map.Entry<String, String> entry : getMap().entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}



	
}
