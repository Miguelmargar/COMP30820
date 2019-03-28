package test;

import java.util.Scanner;

public class examPractice_2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 15 inclusive: ");

        int num = input.nextInt();

        String[] hex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e",
                "f"};

        if (num >= 0 && num <= 15) {
            System.out.println("the hex representation of your number is: " + hex[num]);
        } else {
            System.out.println("Your input needs to be within 0 and 15 inclusive, Please try " +
                    "again");
        }
    }
}
