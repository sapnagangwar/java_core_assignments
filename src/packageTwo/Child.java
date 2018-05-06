package packageTwo;

import packageOne.Parent;

public class Child extends Parent{
	public void testMethod(){
		System.out.println("name is " + name);
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.testMethod();
	}
}
