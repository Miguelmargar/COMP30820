package Pract_1;

import java.util.Scanner;

public class question_5 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter distance to travel: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter fuel efficiency: ");
		double fuel = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double price = input.nextDouble();
		
		input.close();
		
		double cost = distance / fuel * price;
				
		// Display result
		System.out.println("Total is: " + cost );
	}	
}
