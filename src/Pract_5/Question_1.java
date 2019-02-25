package Pract_5;

import java.util.Scanner;

public class Question_1 {
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
		
		System.out.print("The mean is: " + Mean(list) + " and the Deviation is: " + Deviation(list));
	} 
	
	public static double Mean(double[] list) {
			double sum = 0;
			
			for (int i = 0; i < list.length; i++) {
				sum += list[i];
			}
			double mean = sum / list.length;
			return mean;
		}
	
	public static double Deviation(double[] list) {
		double sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += Math.pow(list[i] - Mean(list), 2);
				}
		double dev = Math.sqrt(sum / (list.length - 1));
		return dev;
	}
	
	}

