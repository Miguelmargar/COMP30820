package test;

import java.util.Scanner;

public class ExamPractice_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please type temperature between −58◦F and 41◦F and wind speed greater than 2: ");

        double temp = input.nextDouble();
        double windSpeed = input.nextDouble();

        if ((temp >= -58 && temp <= 41) && (windSpeed >= 2)) {
            double twc = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16) + (0.4275 * temp * Math.pow(windSpeed, 0.16)));
            System.out.println("The Wind Chill temperature is: " + twc);
        } else {
            System.out.println("Error, temperature has to be between −58◦F and 41◦F and wind speed greater than 2:");
        }

    }
}
