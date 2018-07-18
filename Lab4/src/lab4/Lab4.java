// Arif Istiaque and Edward Carrington's Lab 4

package lab4;

import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String n = "Number";
		String s = "Squared";
		String c = "Cubed";
		String e = "=======";
		String f = null;

		System.out.println("Hello!");
		System.out.println(" ");

		do {
			System.out.println("Please enter an integer:");

			int userInput = scnr.nextInt();
			System.out.println(" ");

			System.out.println(n + "\t" + s + "\t" + c);

			System.out.println(e + "\t" + e + "\t" + e);

			for (int i = 1; i <= userInput; i++) {
				System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
				System.out.println(" ");
			}
			System.out.println("Continue? (y/n):");
			f = scnr.next();

		} while (f.equals("y"));
		{
			System.out.println("Thanks for playing!");
			scnr.close();
		}
	}
}
