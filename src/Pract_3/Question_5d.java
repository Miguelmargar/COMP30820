package Pract_3;

import java.util.Scanner;

public class Question_5d {
	public static void main(String[] args) {
		// Read a number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the required size: ");
		int n = input.nextInt();
			
//		loop through i to create the amount of rows to be created 
		for (int i = n; i >= 1; i-- ) {
			
//			loop with j for each i to populate spaces
			for ( int j = 0; j < n-i; j++ ) {
				System.out.print("  ");
			}
//			loop with k to populate the numbers to be printed
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			
			System.out.println("");
		}
		
		// Close the Scanner
		input.close();
	}
}