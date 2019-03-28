package test;

import java.util.Scanner;

public class examPractice_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type the length from the center of the pentagon to the vertex:" +
                " ");
        double r = input.nextDouble();

        if (r > 0) {
            double side = 2 * r * Math.sin(Math.PI / 5);
            double area = (5 * Math.pow(side, 2)) / 4 * Math.tan(Math.PI / 5);
            System.out.println("The area of the pentagon is: " + area);
        } else {
            System.out.println("The length input has to be bigger than 0, please try again");
        }


    }
}
