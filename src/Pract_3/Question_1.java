package Pract_3;

import java.util.Scanner;

public class Question_1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = input.next();
		
		String low = s.toLowerCase();
		
		int vowel = 0;
		int cons = 0;
		
		for (int i = 0; i < low.length(); ++i ) {
			
			char c = low.charAt(i);
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowel += 1;
			} else {
				cons += 1;
			}
		}
		
		System.out.println("There are " + vowel + " vowels and " + cons + " consonants in your word");
				
		
		// Close the Scanner
		input.close();
	} 
}