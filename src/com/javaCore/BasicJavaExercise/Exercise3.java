package com.javaCore.BasicJavaExercise;

/**
 * a java program to provide basic mathematical operation like
 * addition,subtraction,multiplication and division of two numbers.
 */

public class Exercise3 {
	
	private double num1;
	private double num2;
	
	
	public Exercise3(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}
	
	public double add(){
		return getNum1()+getNum2();
	}
	
	public double sub(){
		return getNum1()-getNum2();
	}
	
	public double mul(){
		return getNum1()*getNum2();
	}
	
	public double div(){
		if(getNum2()!=0){
			return getNum1()/getNum2();
		}
		else{
			return Double.NaN;
		}
	}
}
