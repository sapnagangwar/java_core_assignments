package com.javaCore.BasicJavaExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * define an arraylist of states of USA and print them
 * use HashSet and TreeSet
 */
public class Exercise10 {
	private ArrayList<String> list;

	public Exercise10() {
		this.list = new ArrayList<String>();
	}

	public ArrayList<String> addStates() {
		String[] statesArray = { "Alabama", "Alaska", "Arizona", "Arkansas",
				"California", "Colorado", "Connecticut", "Delaware", "Florida",
				"Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
				"Kansas", "Kentucky", "Louisiana", "Maine", "Maryland",
				"Massachusetts", "Michigan", "Minnesota", "Mississippi",
				"Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire",
				"New Jersey", "New Mexico", "New York", "North Carolina",
				"North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania",
				"Rhode Island", "South Carolina", "South,Dakota", "Tennessee",
				"Texas", "Utah", "Vermont", "Virginia", "Washington",
				"West Virginia", "Wisconsin", "Wyoming" };
		Collections.addAll(list, statesArray);
		return list;
	}

	public void display(ArrayList<String> list) {
		for (String x : list) {
			System.out.println(x);
		}
	}

	public ArrayList<String> getList() {
		return list;
	}

	// use HashSet
	public HashSet<String> useHashSet(ArrayList<String> list) {
		HashSet<String> set = new HashSet<String>();
		for (String x : list) {
			set.add(x);
		}
		return set;
	}

	// display HashSet
	public void displaySet(HashSet<String> set) {
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// use TreeSet
	public TreeSet<String> useTreeSet(ArrayList<String> list) {
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.addAll(list);
		return tSet;
	}

	// display TreeSet
	public void displayTreeSet(TreeSet<String> tSet) {
		Iterator<String> itr = tSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
