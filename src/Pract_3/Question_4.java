package Pract_3;

import java.util.Scanner;

public class Question_4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s1 = input.next();
		
		System.out.print("Enter a word: ");
		String s2 = input.next();
		
		
		String end = "";
		
		int count = 0;
		
		while (count < s1.length() && count < s2.length()) {
			char c = s1.charAt(count);
			if (c == s2.charAt(count)) {
				end += c;
				count += 1;
			} else {
				break;
			}
		}
		
		
//		for (int i = 0; i < s1.length(); ++i ) {
//			char c = s1.charAt(i);
//			if (c == s2.charAt(i)) {
//				end += c;
//			}
//		}
		
		System.out.println("The final word is: " + end);
				
		
		// Close the Scanner
		input.close();
	} 
}