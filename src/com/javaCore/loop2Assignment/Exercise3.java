package com.javaCore.loop2Assignment;

import java.util.Scanner;

/*
 * a java program to calculate sum of square of first n numbers
 */
public class Exercise3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter an integer: ");
		int n = sc.nextInt();
		System.out.println("sum of first " + n + " numbers: " + sum(n));
		sc.close();
	}
	
	public static int sum(int n){
		return n*(n+1)*(2*n+1)/6;
	}
}
