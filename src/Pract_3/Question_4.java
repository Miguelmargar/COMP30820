package Pract_3;

import java.util.Scanner;

public class Question_4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s1 = input.next();
		
		System.out.print("Enter a word: ");
		String s2 = input.next();
		
//		initiate an empty variable
		String end = "";
		
//		initiate count for while variable
		int count = 0;
		
//		start while loop with length less than either of the inputs so we don't run out of length - use length of both inputs as max length of count for end of while loop
		while (count < s1.length() && count < s2.length()) {
//			select character from the first input
			char c = s1.charAt(count);
//			if the 1st input is the same as the second input add it to empty variable and add 1 to count
			if (c == s2.charAt(count)) {
				end += c;
				count += 1;
			} else {
				break;
			}
		}
		
		
		System.out.println("The final word is: " + end);
				
		
		// Close the Scanner
		input.close();
	} 
}