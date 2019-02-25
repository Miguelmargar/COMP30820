package Pract_5;

import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
//		ask the user for a number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many values to read: ");
		int n = input.nextInt();
		
		double[] list = new double[n];
	
		for (int i = 0; i < list.length; i++) {
			System.out.print("Enter a number: ");
			double num = input.nextDouble();
			list[i] = num;
		}
		
		// Close the Scanner
		input.close();
		
		System.out.print(isConsecutiveFour(list) ? "There are 4 consecutive Items in the list" : "There are NOT 4 consecutive items in the list");
	} 
	
	public static boolean isConsecutiveFour(double[] list) {
		int count = 1;
			
		for (int i = list.length -1; i > 0; i--) {
			if (list[i] == list[i - 1]) {
				count += 1;
			}
		}
		return count >= 4;
	}
		
		}



