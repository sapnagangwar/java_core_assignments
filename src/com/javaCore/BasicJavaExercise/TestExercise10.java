package com.javaCore.BasicJavaExercise;

public class TestExercise10 {
	public static void main(String[] args) {
		Exercise10 e = new Exercise10();
		e.addStates();
		e.display(e.getList());

		System.out.println("------------------------");
		// use HashSet

		e.displaySet(e.useHashSet(e.getList()));

		System.out.println("------------------------");
		// use TreeSet

		e.displayTreeSet(e.useTreeSet(e.getList()));
	}

}
