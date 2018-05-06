package IfElse;

import java.util.Scanner;

public class DevelopSoftware {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter item price: ");
		double itemPrice = sc.nextDouble();
		System.out.print("enter discount percentage: ");
		double discountPercent = sc.nextDouble();
		System.out.println("Discount: " + discount(itemPrice, discountPercent));
		sc.close();
	}
	
	public static double discount(double itemPrice, double discountPercent){
		return itemPrice*discountPercent/100.00 ;
	}
	
	

}
