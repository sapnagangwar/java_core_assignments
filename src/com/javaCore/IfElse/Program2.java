package com.javaCore.IfElse;

/**
 * a java program to calculate the discount price for an item, where the
 * discount applies to purchase over $10.0
 */
public class Program2 {

	private double itemPrice;
	private double discountPercent;

	public Program2(double itemPrice, double discountPercent) {
		this.itemPrice = itemPrice;
		this.discountPercent = discountPercent;
	}

	public double applyDiscount() {
		if (itemPrice > 10.0) {
			return itemPrice * discountPercent / 100.00;
		} else {
			return 0;
		}
	}
}
