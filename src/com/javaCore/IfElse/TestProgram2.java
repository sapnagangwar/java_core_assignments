package com.javaCore.IfElse;

import java.util.Scanner;

public class TestProgram2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter item price: ");
		double itemPrice = sc.nextDouble();

		System.out.print("enter discount percentage: ");
		double discountPercent = sc.nextDouble();

		Program2 p = new Program2(itemPrice, discountPercent);
		System.out.println("Discount: $" + p.applyDiscount());

		sc.close();
	}
}
