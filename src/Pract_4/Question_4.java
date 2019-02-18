package Pract_4;

import java.util.Scanner;

public class Question_4 {
	// main method
	public static void main(String[] args) {
		// Prompt the user to enter a credit card number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		String n = input.nextLine().trim();

		// Display result
				System.out.println(isValidNumber(n) ? " is valid" : " is invalid");

		// Close the Scanner
		input.close();
	}

	// Return true if the card number is valid
	public static boolean isValidNumber(String n) {
		return hasValidLength(n) && hasValidPrefix(n) && satisfiesMod10Check(n);
	}

	// Return true if the card number has between 13 and 16 digits 
	public static boolean hasValidLength(String n) {
		return n.length() >= 13 && n.length() >= 16;
	}

	// Return true if the card number has a valid prefix
	public static boolean hasValidPrefix(String n) {
		return n.substring(0, 1).equals("3") || n.substring(0, 1).equals("4") || n.substring(0, 2).equals("37") || n.substring(0, 1).equals("6");
	}

	// Return true if the Mod 10 check is satisfied
	public static boolean satisfiesMod10Check(String n) {
		return (sumOfDoubleEvenPlace(n) + sumOfOddPlace(n)) % 10 == 0;
	}

	// Double every second digit from right to left and return sum
	public static int sumOfDoubleEvenPlace(String n) {
		int sumE = 0;

		for (int i = n.length() -1; i >= 0; --i ) {
			int y = n.charAt(i) - '0';
			int x = 2 * y;
			if (x > 9) {
				x = getSumDigits(x);
			}
			sumE += x;
			i--;
		}
		return sumE;
	}

		// Return sum of digits in odd places from right to left 
		public static int sumOfOddPlace(String n) {
			int sumO = 0;
			for (int i = n.length() -1; i >= 0; i-- ) {
				int y = n.charAt(i) - '0';
				sumO += y;
				i--;
			}
			return sumO;
		}

		// Return this number if it is a single digit; 
		// otherwise return the sum of the two digits 
		public static int getSumDigits(int n) {
			return n -9;
		}
	}