package test;

import java.util.Scanner;

public class examPractice_2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the year (format egs: 1982) desired: ");
        int year = input.nextInt();

        System.out.println("Please enter the month (format egs.: Jan, Feb)desired: ");
        String month = input.next();


        switch (month) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec": System.out.println(month + " has 31 days"); break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov": System.out.println(month + " has 30 days"); break;
            case "Feb":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) && (month == "Feb")) {
                    System.out.println("Its a leap year, " + month + " has 29 days!");
                } else {
                    System.out.println(month + " has 28 days");
                }
                break;
            default: System.out.println("There is an error with your month format, please try again");
        }











    }
}
