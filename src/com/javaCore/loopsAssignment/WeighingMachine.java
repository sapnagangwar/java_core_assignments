package com.javaCore.loopsAssignment;

import java.util.Scanner;

public class WeighingMachine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		int leftSideWeight = 0, rightSideWeight = 0;

		while (flag) {

			System.out.println("Enter left side weight: ");
			leftSideWeight += sc.nextInt();

			System.out.println("Enter right side weight: ");
			rightSideWeight += sc.nextInt();

			if (leftSideWeight == rightSideWeight) {
				System.out.println("both are same weights");
				flag = false;
			} else {
				System.out.println("both are not same weights \n");
			}
		}
		sc.close();
	}
}
