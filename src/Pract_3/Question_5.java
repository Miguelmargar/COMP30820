package Pract_3;

import java.util.Scanner;

public class Question_5 {
	public static void main(String[] args) {
		// Read a number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the required size: ");
		int number = input.nextInt();
		
//		loop as far as the number given to create the number of rows
		for (int i = 1; i <= number; i++ ) {
//			loop as far as i to populate rows with J and space
			for ( int j = 1; j <= i; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		// Close the Scanner
		input.close();
	}
}