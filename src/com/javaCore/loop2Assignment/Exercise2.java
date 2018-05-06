/**
 * a program to display sum of integers using while loop
 */
package com.javaCore.loop2Assignment;

import java.util.Scanner;

public class Exercise2 {
	
public static void main(String[] args) {
		
		int count = 1;
		double sum = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		while(count <= 4){
			System.out.println("Enter a double: ");
			sum += sc.nextDouble();
			System.out.println("sum = " + sum);
			count++;
		}
		sc.close();
	}
}
