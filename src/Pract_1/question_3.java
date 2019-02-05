package Pract_1;

import java.util.Scanner;

public class question_3 {
	public static void main(String[] args) {
	// Create a Scanner object
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter x1: ");
	double x1 = input.nextInt();
	
	System.out.println("Enter y1: ");
	double y1 = input.nextDouble();
	
	System.out.println("Enter x2: ");
	double x2 = input.nextDouble();
	
	System.out.println("Enter y2: ");
	double y2 = input.nextDouble();
	
	input.close();
	
	double a = Math.pow(x1, y1);
	double b = Math.pow(x2, y2);
	
	double tot = Math.sqrt(a + b);
	
	// Display result
	System.out.println("Total is: " + tot );
	
	}	
}
