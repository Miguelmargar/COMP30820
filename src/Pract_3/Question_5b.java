package Pract_3;

import java.util.Scanner;

public class Question_5b {
	public static void main(String[] args) {
		// Read a number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the required size: ");
		int n = input.nextInt();
			
		for (int i = n; i > 0; i-- ) {
			for ( int j = 1; j <= i; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		// Close the Scanner
		input.close();
	}
}