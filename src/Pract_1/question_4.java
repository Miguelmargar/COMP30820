package Pract_1;

import java.util.Scanner;

public class question_4 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter temperature >-58F and < 41F: ");
		double temp = input.nextDouble();
		
		System.out.println("Enter wind speed more or equal to 2: ");
		double wind = input.nextDouble();
		
		double v = Math.pow(wind, 0.16);
		
		double t = 35.74 + (0.6215 * temp) - (35.75 * v) + (0.4275 * temp * v);
		
	
		// Display result
		System.out.println("Total is: " + t );
		
		
	}
}
