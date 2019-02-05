package Pract_2;

import java.util.*;

public class Question_1 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length number one of triangle: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter length number two of triangle: ");
		int num2 = input.nextInt();
		
		System.out.println("Enter length number three of triangle: ");
		int num3 = input.nextInt();
		
		int perimeter = 0;
		
		if ((num1 + num2) > num3 && (num2 + num3) > num1 && (num1 + num3) > num2) {
			perimeter = num1 + num2 + num3; 
			System.out.println(perimeter);
		} else {
			System.out.println("invalid inputs");
		}
		

		
	}
}