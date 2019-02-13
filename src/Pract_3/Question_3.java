package Pract_3;

import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = input.next();
		
//		String low = s.toLowerCase();
		
		String end = "";
		
//		iterate through string
		for (int i = 0; i < s.length(); ++i ) {
//			select the char in question
			char c = s.charAt(i);
//			if char is z or Z turn to a or A respectively and add it to end variable
			if (c == 'z') {
				end += 'a';
			} else if (c == 'Z') {
				end += 'A';
//				else add to end variable the next letter in alphabet
			} else {
			end += ++c;
			}
		}
		
		System.out.println("The final word is: " + end);
				
		
		// Close the Scanner
		input.close();
	} 
}