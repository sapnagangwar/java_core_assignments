package com.javaCore.BasicJavaExercise;

import java.util.Scanner;

public class Exercise6 {

	private int[] array;

	public Exercise6(int arrayLength) {
		this.array = new int[arrayLength];
	}
	
	public int[] fillArray() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("enter an element for an array:");
			array[i] = sc.nextInt();
		}
		sc.close();
		return array;
	}

	public void displayArrayElements() {

		for (int i = 0; i < array.length; i++) {
			System.out.println("index " + i + ": " + array[i]);
		}
	}
}
