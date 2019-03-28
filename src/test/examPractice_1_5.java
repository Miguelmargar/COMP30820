package test;

import java.util.Scanner;

public class examPractice_1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input Distance, Fuel efficiency in miles and price per gallon: ");

        int distance = input.nextInt();
        double efficiency = input.nextDouble();
        double priceGallon = input.nextDouble();

        double cost = distance/efficiency * priceGallon;

        System.out.println("The cost of the trip is going to be: " + cost);


    }
}
