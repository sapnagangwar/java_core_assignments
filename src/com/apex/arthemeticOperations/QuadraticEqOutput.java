package com.apex.arthemeticOperations;

/**
 * a program to calculate the result of a quadratic equation
 */

public class QuadraticEqOutput {

	private int x;

	public QuadraticEqOutput(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}

	public int output(){
		return 3*x*x-8*x+4;
	}

	@Override
	public String toString() {
		return "[x=" + x + "]";
	}
}


