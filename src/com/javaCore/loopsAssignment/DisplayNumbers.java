package com.javaCore.loopsAssignment;

/**
 * a java program to display first n numbers with their squares
 */

public class DisplayNumbers {

	private int n;

	public DisplayNumbers(int n) {
		this.n = n;
	}


	public void display() {
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "\t" + i * i);
		}
	}
}
