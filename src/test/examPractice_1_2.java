package test;

import java.util.Scanner;

public class examPractice_1_2 {
    public static void main(String[] args) {

        int current = 312032486;
        int secondsInYear = 60 * 60 * 24 * 365;
        int birthsYear = secondsInYear / 7;
        int deathsYear = secondsInYear / 13;
        int inmigrantsYear = secondsInYear / 45;


        Scanner input = new Scanner(System.in);
        System.out.println("Please type how many years: ");
        int years = input.nextInt();

        int population = years * (birthsYear + inmigrantsYear - deathsYear) + current;

        System.out.println("The future population is: " + population);
    }
}
