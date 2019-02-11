package Pract_3;

import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = input.next();
		
		String low = s.toLowerCase();
		
		String end = "";
		
		for (int i = 0; i < low.length(); ++i ) {
			char c = low.charAt(i);
			end += ++c;
			
		}
		
		System.out.println("The final word is: " + end);
				
		
		// Close the Scanner
		input.close();
	} 
}