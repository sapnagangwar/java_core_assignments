package IfElse;

import java.util.Scanner;

public class Program3 {
	
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
		
		double totalPrice=totalPrice(noOfCookies, pricePerCookie, noOfCakes, pricePerCake);
		
		System.out.println("Discount: " + applyDiscount(totalPrice, discountPercent));
		sc.close();
	}
	
	public static double totalPrice(int noOfCookies,double pricePerCookie,int noOfcake, double pricePerCake){
		return noOfCookies*pricePerCookie/100 + noOfcake*pricePerCake/100;
	}

	public static double applyDiscount(double totalItemPrice, double discountPercent){
		if(totalItemPrice>10.0){
			return totalItemPrice*discountPercent/100.00 ;
		}
		else{
			return 0;
		}
	}

}

/*
enter price of a cookie: 5
enter number of cakes: 1000
enter price of a cake: 3
enter discount percentage: 5
Discount: 4.0
*/

