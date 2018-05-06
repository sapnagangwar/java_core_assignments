package com.javaCore.loop2Assignment;

import java.util.Scanner;

/*
 * a program to display sum of integers using while loop
 */
public class Exercise1 {
	
	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(count <= 4){
			System.out.println("Enter an integer: ");
			sum += sc.nextInt();
			System.out.println("sum = " + sum);
			count++;
		}
		sc.close();
	}
}
