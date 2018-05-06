package com.javaCore.BasicJavaExercise;

import java.io.IOException;
import java.util.Scanner;

public class TestExercise8 {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter path for the file: ");
		String path = sc.nextLine();
		
		System.out.print("enter which character to count: ");
		char f = sc.next().charAt(0);
		
		Exercise8 e = new Exercise8(path);
		System.out.println("count for character: " + e.readFile(f));
		
		sc.close();

	}

	
}




