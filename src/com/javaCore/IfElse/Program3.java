package com.javaCore.IfElse;

/**
 * a java program to calculate the Discount price for a collection of items if
 * total cost is more than $10.0 5 cents per cookie 3 cents per cake
 */

public class Program3 {

	private int noOfCookies;
	private double pricePerCookie;
	private int noOfCakes;
	private double pricePerCake;
	private double discountPercent;

	public Program3(int noOfCookies, double pricePerCookie, int noOfCakes,
			double pricePerCake, double discountPercent) {
		super();
		this.noOfCookies = noOfCookies;
		this.pricePerCookie = pricePerCookie;
		this.noOfCakes = noOfCakes;
		this.pricePerCake = pricePerCake;
		this.discountPercent = discountPercent;
	}

	public double totalPrice() {
		return noOfCookies * (pricePerCookie / 100) + noOfCakes
				* (pricePerCake / 100);
	}

	public double applyDiscount() {
		double totalItemPrice = totalPrice();
		if (totalItemPrice > 10.0) {
			return totalItemPrice * discountPercent / 100.00;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "[noOfCookies=" + noOfCookies + ", pricePerCookie="
				+ pricePerCookie + "cents" + ", noOfCakes=" + noOfCakes
				+ ", pricePerCake=" + pricePerCake + "cents"
				+ ", discountPercent=" + discountPercent + "]";
	}

}
