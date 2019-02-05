package Pract_2;

import java.util.*;

public class Question_4 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value: ");
		int x = input.nextInt();
		
		if (x >= 0 && x <= 15) {
			System.out.println(Integer.toHexString(x));
		} else {
			System.out.println("number needs to be between 0 and 15 inclusive");
		}

		
	}
}