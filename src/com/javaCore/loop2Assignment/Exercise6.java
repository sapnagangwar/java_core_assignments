package com.javaCore.loop2Assignment;

import java.util.Scanner;

/*
 * a java program to display factorial of a number
 */
public class Exercise6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter an integer: ");
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}
	
	public static int factorial(int n){
		int fact =1;
		for(int i=1;i<=n;i++){
			fact*=i;
		}
		return fact;
	}
}

