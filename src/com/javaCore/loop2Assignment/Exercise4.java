package com.javaCore.loop2Assignment;

import java.util.Scanner;

/**
 * Display star output
 */
public class Exercise4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of lines in display required: "); 
		int noOfLines=sc.nextInt();
		display(noOfLines);
		sc.close();
	}
	
	public static void display(int n){
		for(int i=1; i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
