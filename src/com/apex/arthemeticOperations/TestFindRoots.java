package com.apex.arthemeticOperations;

public class TestFindRoots {

	public static void main(String[] args) {
		
		FindRoots f1 = new FindRoots(1,-4,3);//rational roots
		f1.findRoots();
		
		FindRoots f2 = new FindRoots(1, 6, 5);//rational roots
		f2.findRoots();
		
		FindRoots f3 = new FindRoots(3, -13, 4);//4,1/3  
		f3.findRoots();
		
		FindRoots f4 = new FindRoots(3, -5, -12);//-4/3,3 
		f4.findRoots();
		
		FindRoots f5 = new FindRoots(1, -4, 13);//imaginary
		f5.findRoots();
		
		FindRoots f6 = new FindRoots(1, 4, 6);//imaginary
		f6.findRoots();
		
	
	}
}


