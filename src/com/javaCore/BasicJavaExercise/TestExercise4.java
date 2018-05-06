package com.javaCore.BasicJavaExercise;

public class TestExercise4 {

	public static void main(String[] args) {
		Exercise4 f = new Exercise4();
		System.out.println(f.isInteger("153"));
		System.out.println(f.isOddNumber("153"));
		System.out.println(f.isEvenNumber("153"));
		System.out.println(f.isPrimeNumber("153"));
		
		Exercise4 f1 = new Exercise4();
		System.out.println(f1.isInteger("53"));
		System.out.println(f1.isOddNumber("53"));
		System.out.println(f1.isEvenNumber("53"));
		System.out.println(f1.isPrimeNumber("53"));
		
		Exercise4 f2 = new Exercise4();
		System.out.println(f2.isInteger("0"));
		System.out.println(f2.isOddNumber("0"));
		System.out.println(f2.isEvenNumber("0"));
		System.out.println(f2.isPrimeNumber("0"));
		
		Exercise4 f3 = new Exercise4();
		System.out.println(f3.isInteger("1"));
		System.out.println(f3.isOddNumber("1"));
		System.out.println(f3.isEvenNumber("1"));
		System.out.println(f3.isPrimeNumber("1"));

	}
}
