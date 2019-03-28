package test;

import java.util.Scanner;

public class examPractice_1_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please type in the cylinder radius: ");
        double radius = input.nextDouble();

        System.out.println("please type the length of the cylinder");
        double length = input.nextDouble();

        double area = Math.PI * (Math.pow(radius, 2));
        double volume = area * length;

        System.out.println("The area is: " + area);
        System.out.println("The volume is " + volume);
    }

}
