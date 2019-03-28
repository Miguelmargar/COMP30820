package test;

import java.util.Scanner;

public class examPractice_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please type 4 different points: ");

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        double solution = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("The distance is: " + solution);
    }
}
