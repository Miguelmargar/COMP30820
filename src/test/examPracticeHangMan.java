package test;

import java.util.Arrays;
import java.util.Scanner;

public class examPracticeHangMan {
    public static void main(String[] args) {
        String[] words = {"hello", "hell", "cool", "amphibious"};
        Scanner input = new Scanner(System.in);

        boolean play = true;

        while (play) {

            // Select one word from the list of words to guess
            int index = (int)(Math.random() * words.length);
            String word = words[index].toLowerCase();

            System.out.println("word is: " + word);

            // Create Array with no guesses
            char[] result = new char[word.length()];
            for (int i = 0; i < result.length; i++) {
                result[i] = '_';
            }

            System.out.println("result is: " + Arrays.toString(result));


            int count = 1;
            int failed = 0;
            while (count < word.length()) {

                // Ask guess of a letter
                System.out.println("Type in a letter to guess: ");
                char guess = input.nextLine().toLowerCase().charAt(0);

                if (isInWord(guess, word)) {
                    newResult(result, word, guess);
                    System.out.println("Correct!");
                    System.out.println("This is how it's looking so far: " + Arrays.toString(result));
                    count++;
                } else {
                    System.out.println("Wrong!");
                    failed++;
                    System.out.println("Total mistakes: " + failed);
                }
            }
            // Ask if user wants to play again
            System.out.println("Play again? (y, n): ");
            String again = input.next();
            char a = again.charAt(0);

            // if yes continue of no quit
            if (a == 'y' || a == 'Y') {
                play = true;
            } else if (a == 'n' || a == 'N') {
                play = false;
            }
        }







    }

    public static boolean isInWord(char guess, String word) {
        // Check if letter is in word
        boolean is = false;
        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                is = true;
            }
        }
        return is;
    }


    public static void newResult(char[] result, String word, char guess) {
        // Change "_" for the letter
        for (int i = 0; i < result.length; i++) {
            if (guess == word.charAt(i)) {
                result[i] = word.charAt(i);
            }
        }
    }




}
