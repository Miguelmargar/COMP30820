package test;

import java.util.Scanner;

public class examPractice_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a word: ");

        String word = input.next();
        String lower = word.toLowerCase();

        int vowel = 0;
        int conso = 0;


        for (int i = 0; i < lower.length(); i ++) {
            if (lower.charAt(i) == 'a' || lower.charAt(i) == 'e' || lower.charAt(i) == 'i' || lower.charAt(i) == 'o' || lower.charAt(i) == 'u') {
                vowel++;
            } else {
                conso++;
            }
        }

        System.out.println("Vowels: " + vowel + " Consonants: " + conso);



    }
}
