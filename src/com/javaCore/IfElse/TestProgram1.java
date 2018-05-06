package com.javaCore.IfElse;

import java.util.Scanner;

public class TestProgram1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter item price in Dollars: ");
		double itemPrice = sc.nextDouble();

		System.out.print("enter discount percentage: ");
		double discountPercent = sc.nextDouble();

		Program1 p = new Program1(itemPrice, discountPercent);
		System.out.println("Discount:$ " + p.discount());

		sc.close();
	}
}
