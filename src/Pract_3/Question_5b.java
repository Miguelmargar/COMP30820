package Pract_3;

import java.util.Scanner;

public class Question_5b {
	public static void main(String[] args) {
		// Read a number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the required size: ");
		int n = input.nextInt();
			
//		loop with i for the amount of rows
		for (int i = n; i > 0; i-- ) {
//			loop with j to populate each row for each i 
			for ( int j = 1; j <= i; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		// Close the Scanner
		input.close();
	}
}