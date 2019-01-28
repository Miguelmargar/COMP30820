package Pract_1;

import java.util.Scanner;

public class question_2 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
				
		int SecondsYear = 60 * 60 * 24 * 365;
		int deaths = SecondsYear / 13;
		int births = SecondsYear / 7;
		int immigrants = SecondsYear / 45;
		
		int current = 312032486;
		
		
		// Prompt the user to enter amount of years
		System.out.println("Enter amount of years: ");
		int years = input.nextInt();
		
		int tot = current - (deaths * years) + (births * years) + (immigrants * years);
		
		// Display result
		System.out.println("The population is: " + tot );
		
	}
}
