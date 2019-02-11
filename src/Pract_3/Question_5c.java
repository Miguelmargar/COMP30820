package Pract_3;

import java.util.Scanner;

public class Question_5c {
	public static void main(String[] args) {
		// Read a number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the required size: ");
		int n = input.nextInt();
			
		for (int i = 1; i <= n; i++ ) {
			for ( int j = 1; j <= n-i; j++ ) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(" " + k);
			}
			System.out.println("");
		}
		
		// Close the Scanner
		input.close();
	}
}