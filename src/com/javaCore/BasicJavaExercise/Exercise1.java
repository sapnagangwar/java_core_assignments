package com.javaCore.BasicJavaExercise;

/**
 * a java program to generate fibonacci series
 */
public class Exercise1 {

	private int n;
	
	public Exercise1(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}

	public void displayFibonacciSeries() {

		int f1 = 0;
		int f2 = 0;
		int f = 1;

		for (int i = 0; i < n; i++) {
			f1 = f2;
			f2 = f;
			f = f1 + f2;
			System.out.print(f1 + " ");
		}
	}
}
