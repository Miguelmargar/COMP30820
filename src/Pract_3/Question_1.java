package Pract_3;

import java.util.Scanner;

public class Question_1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = input.next();
		
//		if any uppercase turn to lowercase
		String low = s.toLowerCase();
		
//		initiate count for vowels and consonants
		int vowel = 0;
		int cons = 0;
		
//		loop through the user input
		for (int i = 0; i < low.length(); ++i ) {
			
//			get the specific letter
			char c = low.charAt(i);
			
//			compare letter to vowel and if true add 1 to vowel count
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowel += 1;
//				if not vowel as above comparison check if it is a letter and if so add to cons count
			} else if (Character.isLetter(c)) {
				cons += 1;
//				if non of the above do nothing and continue
			} else {
				continue;
			}
		}
		
		System.out.println("There are " + vowel + " vowels and " + cons + " consonants in your word");
				
		
		// Close the Scanner
		input.close();
	} 
}