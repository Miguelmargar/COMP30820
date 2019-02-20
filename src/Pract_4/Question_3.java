package Pract_4;

import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {
//		ask the user for a word
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = input.next();

		// Close the Scanner
		input.close();
		
//		print whether the the input word is a palindrome or not
		System.out.print(isPalindrome(s) ? "It is a Palindrome" : "It is NOT a Palindrome");
	} 
	
//	check if the word is a palindrome
	public static boolean isPalindrome(String str) {
//		set an empty string
		String reverse = "";
		
//		loop through the input string from the end to the beging
		for (int i = str.length() - 1; i >= 0; i--) {
//			add the chars in the input string to the reverse string - this is in reverse due to the loop set up
			reverse += str.charAt(i);
		}
//		return true if the input and reverse strings are equal
		return str.equals(reverse);
	}

}