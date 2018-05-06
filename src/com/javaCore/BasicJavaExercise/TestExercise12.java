package com.javaCore.BasicJavaExercise;

import java.util.ArrayList;

public class TestExercise12 {
	public static void main(String[] args) {
		Exercise12 e1 = new Exercise12("CA", "California", "Sacromento");
		Exercise12 e2 = new Exercise12("AL","Alabma", "Montgomery");
		Exercise12 e3 = new Exercise12("AK", "Alaska", "Juneau");
		Exercise12 e4 = new Exercise12("AZ", "Arizona", "Phoneix");
		Exercise12 e5 = new Exercise12("ID", "Idaho", "Boise");
		Exercise12 e6= new Exercise12("GA", "Georgia", "Atlanta");
		Exercise12 e7 = new Exercise12("KS", "Kansas", "Topeka");
		Exercise12 e8 = new Exercise12("FL", "Florida", "Tallahassee");
		Exercise12 e9= new Exercise12("DE", "Delaware", "Dover");
		Exercise12 e10 = new Exercise12("CO", "Colorado", "Denver");
		
		ArrayList<Exercise12> list = new ArrayList<Exercise12>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);
		
		for(Exercise12 x: list){
			System.out.println(x);
		}
	
		
		
	}

}
