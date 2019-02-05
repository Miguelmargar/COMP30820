package Pract_2;

import java.util.*;

public class Question_3 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value for X: ");
		int x = input.nextInt();
		
		System.out.println("Enter value for Y: ");
		int y = input.nextInt();
		
		int limit_x = 10;
		int limit_y = 5;
		
		if (x <= limit_x && y <= limit_y) {
			System.out.println("X and Y are within the limit");
		} else {
			System.out.println("X or Y or both are NOT with in the limit");
		}

		
	}
}