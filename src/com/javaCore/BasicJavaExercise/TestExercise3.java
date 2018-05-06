package com.javaCore.BasicJavaExercise;

public class TestExercise3 {

	public static void main(String[] args) {
		Exercise3 calculator = new Exercise3(8,4);
		System.out.println(calculator.add());
		System.out.println(calculator.sub());
		System.out.println(calculator.mul());
		System.out.println(calculator.div());
		
		Exercise3 cal = new Exercise3(2,0);
		System.out.println(cal.add());
		System.out.println(cal.sub());
		System.out.println(cal.mul());
		System.out.println(cal.div());
		
		Exercise3 cal1 = new Exercise3(0,0);
		System.out.println(cal1.add());
		System.out.println(cal1.sub());
		System.out.println(cal1.mul());
		System.out.println(cal1.div());
		
		Exercise3 cal2 = new Exercise3(-3,-2);
		System.out.println(cal2.add());
		System.out.println(cal2.sub());
		System.out.println(cal2.mul());
		System.out.println(cal2.div());
	}

}
