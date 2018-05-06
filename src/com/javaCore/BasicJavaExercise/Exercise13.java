package com.javaCore.BasicJavaExercise;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * a java  program to read date in 'YYYYMMDD' format
 * Also dispaly in mm/dd/yy and "dd day month yyyy" formats
 *
 */

public class Exercise13 {
	
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Date: ");
		String ind = sc.nextLine();
		DateFormat df = new SimpleDateFormat("yyyymmdd");
		Date d = null;
		try {

			d = df.parse(ind);
			System.out.println(d);

		} catch (ParseException e) {
			System.out.println("Unable to parse " + ind);
		}

		DateFormat df3 = new SimpleDateFormat("mm/dd/yy");

		String s3 = df3.format(d);

		System.out.println("The entered date is: " + s3);

		System.out.println("-----------------------");

		System.out.println();
		
		sc.close();

	}

}