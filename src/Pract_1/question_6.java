package Pract_1;

import java.util.Scanner;

public class question_6 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number up to three digits: ");
		int num = input.nextInt();
		
		input.close();
		
		int first = num / 100;
		int second = num / 10 % 10;
		int last = num % 10;
		
		int total = first + second + last;
		
		// Display result
		System.out.println("Total is: " + total );
		
	}
}
