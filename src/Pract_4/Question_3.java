package Pract_4;

import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = input.next();

		// Close the Scanner
		input.close();
		
		System.out.print(isPalindrome(s) ? "It is a Palindrome" : "It is NOT a Palindrome");
	} 
	
	public static boolean isPalindrome(String str) {
		
		String reverse = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		
		return str.equals(reverse);
	}

}