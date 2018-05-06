package com.javaCore.loopsAssignment;

/**
 *  a java program to display value and their squares
 */

public class DisplayInputValues {

	private int a;
	private int b;

	public DisplayInputValues(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void display(){
		for(int i =a;i<=b;i++){
			System.out.println(i + "\t" + i*i);
		}
	}
}

