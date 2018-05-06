package com.apex.arthemeticOperations;

import java.util.Scanner;

public class TestPayrollProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter total number of hours worked: ");
		double hoursWorked = sc.nextDouble();
		System.out.print("enter pay rate per hour: ");
		double payRate = sc.nextDouble();
		
		PayrollProgram p = new PayrollProgram(hoursWorked, payRate);
		
		System.out.println("total number of hours worked: " + p.getHoursWorked());
		System.out.println("pay rate: " + p.getPayRate());
		System.out.println("salary: " + p.getSalary());
		
		sc.close();
	}

}
