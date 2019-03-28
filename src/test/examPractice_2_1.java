package test;

import java.util.Scanner;

public class examPractice_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of triangle sides");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if ((a + b) > c || (a + c) > b || (c + b) > a) {
            double perimeter = a + b + c;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else {
            System.out.println("One side has to be bigger than the sum of the other two sides");
        }

    }
}
