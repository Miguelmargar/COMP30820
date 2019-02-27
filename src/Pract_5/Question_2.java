package Pract_5;

import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
//		ask the user for a number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many values to read: ");
		int n = input.nextInt();
		
//		create list of size given by the user
		double[] list = new double[n];
	
//		ask the user for numbers to populate the empty list
		for (int i = 0; i < list.length; i++) {
			System.out.print("Enter a number: ");
			double num = input.nextDouble();
			list[i] = num;
		}
		
		// Close the Scanner
		input.close();
		
		System.out.print(isConsecutiveFour(list) ? "There are 4 consecutive Items in the list" : "There are NOT 4 consecutive items in the list");
	} 
	
//	check for consecutive numbers
	public static boolean isConsecutiveFour(double[] list) {
//		initialise count to 1
		int count = 1;
			
//		iterate through the length of the list from end to beginning to avoid out of bounds
		for (int i = list.length -1; i > 0; i--) {
//			if the item in question is same as the next add to count
			if (list[i] == list[i - 1]) {
				count += 1;
			}
		}
//		return if the count is bigger or equal to 4
		return count >= 4;
	}
		
		}



