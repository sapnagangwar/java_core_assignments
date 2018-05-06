package com.javaCore.loopsAssignment;

import java.util.Scanner;

public class TestDisplayInputValues {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b value: " );
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		DisplayInputValues d = new DisplayInputValues(a, b);
		d.display();
		
		sc.close();
	}
}



