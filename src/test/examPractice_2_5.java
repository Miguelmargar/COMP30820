package test;

import java.util.Scanner;

public class examPractice_2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in a letter: ");
        char any = input.next().charAt(0);

        if (any >= 'A' && any <= 'z') {
            boolean isVowel =
                    any == 'A' || any == 'E' || any == 'I' || any == 'O' || any == 'U' || any == 'a' || any == 'e' || any == 'i' || any == 'o' || any == 'u';
            if (isVowel) {
                System.out.println("The letter is a Vowel");
            } else {
                System.out.println("The letter is a Consonant");
            }
        } else {
            System.out.println("The character entered is not a letter, please try again");
        }

    }
}
