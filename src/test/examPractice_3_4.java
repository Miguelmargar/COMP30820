package test;

import java.util.Scanner;

public class examPractice_3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type two strings to compare: ");

        String string_1 = input.next();
        String string_2 = input.next();


        String result = "";
        int count = 0;

        while (count < string_1.length()&& count < string_2.length()) {
            if (string_1.charAt(count) == string_2.charAt(count)) {
                result += string_1.charAt(count);
            } else {
                break;
            }
            count++;
        }
        System.out.println("Result is: " + result);



    }
}
