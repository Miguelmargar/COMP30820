package test;

import java.util.Scanner;

public class examPracticePallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a string to check for pallindrome: ");
        String word = input.nextLine();



        if (isPalindrome(word)) {
            System.out.println("It IS a pallindrome!");
        } else {
            System.out.println("It is NOT a pallindrome!");
        }
    }


    public static boolean isPalindrome(String word) {
        boolean is = true;
        if (word.length() == 1) {
            return is;
        } else if (word.length() < 1) {
            return is;
        } else {
            if (word.charAt(0) == word.charAt(word.length()-1)) {
                isPalindrome(word.substring(1,word.length()-1));
            } else {
                is = false;
            }
        }
        return is;
    }


}
