package test;

import java.util.Scanner;

public class examPractice_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a string: ");

        String string = input.nextLine();

        String result = "";

        for (int i = string.length() -1; i >= 0 ; i--) {
            result += string.charAt(i);
        }

        System.out.println("Backwards string is: " + result);
    }
}
