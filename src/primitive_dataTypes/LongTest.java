package primitive_dataTypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LongTest {

	public static void main(String[] args) {

		long s2 = 5678998;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter your input for long: ");
			try {
				s2 = sc.nextLong();
				System.out.println("A long: " + s2);
			} catch (InputMismatchException e) {
				System.out.println("message: " + e.getMessage());
			}
		}
		sc.close();
	}

}
