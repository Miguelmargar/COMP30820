package test;

import java.util.Scanner;

public class examPractice_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a number to display pattern: ");

        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");

        }

        System.out.println();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");

        }


        System.out.println();


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }

            System.out.println();
        }

        System.out.println();


        for (int i = n; i > 0; i--) {

            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k<= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();


        }

    }
}