package Pract_1;

import java.util.Scanner; // Scanner is in the java.util package

public class question_1 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter area
		System.out.println("Enter the Radius: ");
		double radius = input.nextDouble();
		
		// Prompt the user to enter area
		System.out.println("Enter the Length: ");
		double length = input.nextDouble();
		
		
		
		double area = radius * radius * 3.14159;
		double volume = area * length;
		
		// Display result
		System.out.println("The Area is " + area);
		System.out.println("The volume is " + volume);
	}
}
