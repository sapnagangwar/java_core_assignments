package com.javaCore.BasicJavaExercise;

/**
 * a java program to generate 1000 numbers
 * Also generates numbers which are multiples of 5 and are less than 1000
 * Also generates odd numbers up to 1000 
 */

public class Exercise5 {

	public Exercise5() {
		super();
	}

	public void generate1000Numbers() {

		for (int i = 1; i <= 1000; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	/*
	 * generate multiples of 5 and less than 1000
	 */
	public void generateMultipleOf5() {

		for (int i = 5; i < 1000; i += 5) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	/*
	 * generate odd numbers upto 1000
	 */

	public void generateOddNumbers() {
		for (int i = 1; i < 1000; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
