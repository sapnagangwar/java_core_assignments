package com.apex.arthemeticOperations;
/**
 * a java program to calculate a quadratic equation
 * display the roots of the quadratic equation
 * if roots are imaginary, then display no roots
 */
public class FindRoots {

	private double a;
	private double b;
	private double c;

	public FindRoots(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}


	/**
	 * a method to find the roots of the quadratic equation
	 */
	public void findRoots(){

		double d=Math.sqrt(b*b-4*a*c);

		if(d>=0){
			double x1 = (-b+d)/(2*a);
			double x2 = (-b-d)/(2*a);
			System.out.println("roots:" + x1 +", " + x2);
		}
		else{
			System.out.println("roots are imaginary.");
		}
	}
}


