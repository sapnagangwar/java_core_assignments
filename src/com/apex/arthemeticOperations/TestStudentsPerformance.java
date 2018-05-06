package com.apex.arthemeticOperations;

import java.util.Scanner;

public class TestStudentsPerformance {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sub1,sub2,sub3,sub4,sub5,sub6;
		System.out.print("enter marks for 6 subjects: " );
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		sub4=sc.nextInt();
		sub5=sc.nextInt();
		sub6=sc.nextInt();
		
		StudentsPerformance s = new StudentsPerformance(sub1, sub2, sub3, sub4, sub5, sub6);
		
		System.out.println("Total marks: " + s.getTotal());
		
		System.out.println("Average: " + s.getAverage());
		
		sc.close();
	}
}
