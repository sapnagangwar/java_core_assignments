package com.javaCore.IfElse;

import java.util.Scanner;

public class TestProgram3 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number of cookies: ");
		int noOfCookies = sc.nextInt();
		System.out.print("enter price of a cookie: ");
		double pricePerCookie = sc.nextDouble();
		
		System.out.print("enter number of cakes: ");
		int noOfCakes = sc.nextInt();
		System.out.print("enter price of a cake: ");
		double pricePerCake = sc.nextDouble();
		
		System.out.print("enter discount percentage: ");
		double discountPercent = sc.nextDouble();
		
		Program3 p = new Program3(noOfCookies, pricePerCookie, noOfCakes, pricePerCake, discountPercent);
		System.out.println("Discount: $" +p.applyDiscount());
		
		sc.close();
	}
}

/*
enter price of a cookie: 5
enter number of cakes: 1000
enter price of a cake: 3
enter discount percentage: 5
Discount: 4.0
*/

