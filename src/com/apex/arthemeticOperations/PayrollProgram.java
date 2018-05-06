package com.apex.arthemeticOperations;

/**
 * a java program to calculate salary for an employee
 */

public class PayrollProgram {

	private double hoursWorked;
	private double payRate;

	public PayrollProgram(double hoursWorked, double payRate) {
		this.hoursWorked = hoursWorked;
		this.payRate = payRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public double getPayRate() {
		return payRate;
	}

	public double getSalary() {
		return hoursWorked*payRate;
	}

	@Override
	public String toString() {
		return "[hoursWorked=" + getHoursWorked() + ", payRate="
				+ getPayRate() + ", salary=" + getSalary() + "]";
	}
}
