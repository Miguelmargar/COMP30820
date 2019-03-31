package test;

import java.util.Arrays;
import java.util.Scanner;

public class examPracticeHangMan {
    public static void main(String[] args) {
        String[] words = {"hello", "fine", "well", "cool", "amphibious", "super", "computer"};
        Scanner input = new Scanner(System.in);

        String word = selectWord(words);
        char[] emptyList = emptyList(words);

        boolean play = true;

        while (play) {

            int count = 1;
            int failed = 0;
            while (count < word.length()) {

                // Ask guess of a letter
                System.out.println("Type in a letter to guess: ");
                char guess = input.nextLine().toLowerCase().charAt(0);

                if (isInWord(guess, word)) {
                    newResult(emptyList, word, guess);
                    System.out.println("Correct!");
                    System.out.println("This is how it's looking so far: " + Arrays.toString(emptyList));
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
                main(args);
            } else if (a == 'n' || a == 'N') {
                play = false;
                System.out.println("Good bye!");
            }
        }



    }

    public static String selectWord(String[] words) {
        // Select one word from the list of words to guess
        int index = (int)(Math.random() * words.length);
        String word = words[index].toLowerCase();

        return word;
    }

    public static char[] emptyList(String[] words) {
        // Create Array with no guesses
        char[] result = new char[selectWord(words).length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = '_';
        }

        System.out.println("result is: " + Arrays.toString(result));
        return result;
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
