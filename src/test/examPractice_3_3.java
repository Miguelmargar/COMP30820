package test;

import java.util.Scanner;

public class examPractice_3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a string: ");

        String string = input.nextLine();

        String result = "";

        for (int i = 0; i < string.length(); i++) {
            int r = string.charAt(i) +1;
            result += (char)r;
        }

        System.out.println("Result is: " + result);
    }
}
