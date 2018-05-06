package com.javaCore.BasicJavaExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * a java program to read the contents of text file 
 * also count the occurrence of any chosen character
 */
public class Exercise8 {
	
	private String path;
	
	public Exercise8(String path) {
		this.path = path;
	}

	public int readFile(char f) throws IOException,ClassNotFoundException {

		int count = 0;

		try {
			FileReader reader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;
			
			System.out.println("contents of the file: ");

			while ((line = bufferedReader.readLine()) != null) {
				
				System.out.println(line);
				char[] array = line.toCharArray();
				for (char x : array) {
					if (x == f) {
						count++;
					}
				}
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
}
