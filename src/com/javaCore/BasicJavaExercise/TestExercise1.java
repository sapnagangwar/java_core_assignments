package com.javaCore.BasicJavaExercise;

import java.util.Scanner;

public class TestExercise1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Please enter number of terms you want as an input:");
		int n = scanner.nextInt();

		Exercise1 e = new Exercise1(n);
		e.displayFibonacciSeries();
		
		scanner.close();
	}
}
