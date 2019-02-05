package Pract_2;

import java.util.*;

public class Question_5 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter letter: ");
		char ch = input.next().charAt(0);
		
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("The letter is lower case");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("The letter is upper case");
		} else {
			System.out.println("Wrong input, it needs to be a letter");
		}

		
	}
}