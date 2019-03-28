package test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class examPractice_2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type your X (first) and Y (second) coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if ((x <= 10 && y <= 6) && (x >= 0 && y >= 0)) {
            System.out.println("The coordinates are within the rectangle");
        } else {
            System.out.println("The coordinates are NOT within the rectangle");
        }
    }
}
