package test;

import java.util.Scanner;

public class examPractice_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a 3 digit interger to sum up digits: ");

        int interger = input.nextInt();

        int first = interger / 100;
        int second = (interger / 10) % 10;
        int last = interger % 10;

        System.out.print(first + second + last);
    }
}
