package Pract_3;

import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = input.next();
		
//		if any uppercase turn to lower case
		String low = s.toLowerCase();
		
		String end = "";
		
//		iterate through the string in reverse order and save in variable
		for (int i = low.length() -1; i >= 0; --i ) {
			char c = low.charAt(i);
			end += c;
			
		}
		
		System.out.println("The final word is: " + end);
				
		
		// Close the Scanner
		input.close();
	} 
}