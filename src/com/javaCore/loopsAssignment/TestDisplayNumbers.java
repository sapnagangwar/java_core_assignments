package com.javaCore.loopsAssignment;

import java.util.Scanner;

/**
 * a java program to display first n numbers with their squares
 */

public class TestDisplayNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many numbers is to be displayed: ");
		int n = sc.nextInt();

		DisplayNumbers d = new DisplayNumbers(n);
		d.display();

		sc.close();

	}

}
