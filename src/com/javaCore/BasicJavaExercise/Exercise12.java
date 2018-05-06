package com.javaCore.BasicJavaExercise;

import java.util.ArrayList;

/*
 * define a class with state code,state name and capitals
 * define 10 states and save in an arraylist
 * print all the objects
 */
public class Exercise12 {
	private String stateCode;
	private String stateName;
	private String stateCapital;
	
	public Exercise12() {
	}

	public Exercise12(String stateCode, String stateName, String stateCapital) {
		this.stateCode = stateCode;
		this.stateName = stateName;
		this.stateCapital = stateCapital;
	}

	public String getStateCode() {
		return stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public String getStateCapital() {
		return stateCapital;
	}

	@Override
	public String toString() {
		return "[stateCode=" + stateCode + ", stateName="
				+ stateName + ", stateCapital=" + stateCapital + "]";
	}
	

}
