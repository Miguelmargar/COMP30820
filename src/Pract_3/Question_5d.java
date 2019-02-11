package Pract_3;

import java.util.Scanner;

public class Question_5d {
	public static void main(String[] args) {
		// Read a number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the required size: ");
		int n = input.nextInt();
			
		for (int i = n; i >= 1; i-- ) {
			
			for ( int j = 0; j < n-i; j++ ) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			
			System.out.println("");
		}
		
		// Close the Scanner
		input.close();
	}
}