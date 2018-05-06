package primitive_dataTypes;

import java.util.Scanner;

public class charType {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.print("enter a character: ");
			char ch = sc.next().charAt(0);
			System.out.println("entered character by user: " + ch);
		}
		sc.close();
	}
}


