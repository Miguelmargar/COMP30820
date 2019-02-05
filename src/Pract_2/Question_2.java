package Pract_2;

import java.util.*;

public class Question_2 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		int radius = input.nextInt();
		
		if (radius > 0) {
			double s = 2 * radius * Math.sin(Math.PI/5);
			double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));
			System.out.println(area);
		} else {
			System.out.println("invalid input");
		}

		
	}
}