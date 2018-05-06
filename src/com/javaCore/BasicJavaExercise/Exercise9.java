package com.javaCore.BasicJavaExercise;

/*
 * define a string buffer and append all alphabets 
 * display the final string
 */
public class Exercise9 {

	StringBuffer sb;
	StringBuilder strb;

	public Exercise9() {
		this.sb = new StringBuffer();
		;
		this.strb = new StringBuilder();
	}

	public String finalStringWithStringBuffer() {

		for (char c = 'a'; c <= 'z'; c++) {
			sb.append(c);
		}
		return sb.toString();
	}

	public String finalStringWithStringBuilder() {

		for (char c = 'a'; c <= 'z'; c++) {
			strb.append(c);
		}
		return strb.toString();
	}
}
