package com.javaCore.IfElse;

/**
 * a java program to calculate discount price for an item
 */

public class Program1 {

	private double itemPrice;
	private double discountPercent;

	public Program1(double itemPrice, double discountPercent) {
		this.itemPrice = itemPrice;
		this.discountPercent = discountPercent;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public double discount() {
		return itemPrice*discountPercent / 100.00;
	}

	public double discount(double itemPrice, double discountPercent) {
		return itemPrice * discountPercent / 100.00;
	}

	@Override
	public String toString() {
		return "[itemPrice= $" + itemPrice + ", discountPercent="
				+ discountPercent + "]";
	}
}
