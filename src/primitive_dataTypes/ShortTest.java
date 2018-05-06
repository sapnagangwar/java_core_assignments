package primitive_dataTypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShortTest {
	public static void main(String[] args) {

		short s1 = 32;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter your input for short: ");
			try {
				s1 = sc.nextShort();
				System.out.println("A short: " + s1);
			} catch (InputMismatchException e) {
				System.out.println("message: " + e.getMessage());
			}
		}

		long s2;

		System.out.print("Enter your input for long: ");
		try {
			s2 = sc.nextLong();
			System.out.println("A long: " + s2);
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
