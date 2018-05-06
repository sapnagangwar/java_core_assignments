package IfElse;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter item price: ");
		double itemPrice = sc.nextDouble();
		System.out.print("enter discount percentage: ");
		double discountPercent = sc.nextDouble();
		System.out.println("Discount: " + applyDiscount(itemPrice, discountPercent));
		sc.close();
	}

	public static double applyDiscount(double itemPrice, double discountPercent){
		if(itemPrice>10.0){
			return itemPrice*discountPercent/100.00 ;
		}
		else{
			return 0;
		}
	}
}
