package com.apex.arthemeticOperations;

import java.util.Scanner;

public class TestQuadraticEqOutput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer: ");
		int x = sc.nextInt();
		
		QuadraticEqOutput q = new QuadraticEqOutput(x);
		System.out.println("output: "+ q.output());
		
		sc.close();
		}

}
