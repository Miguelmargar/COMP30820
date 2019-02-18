package Pract_4;

public class Question_2 {
	public static void main(String[] args) {
		int check = 0;
		int count = 1;
		
		while (count < 5 ) {
			if (isPerfectNumber(check)) {
				System.out.println(check);
				count++;
			}
			check++;
		}
	} 
	
	public static boolean isPerfectNumber(int number) {
		int count = 1;
		int tot = 0;
		
		while (count < number) {
			if (number % count == 0) {
				tot += count;
			}
			count++;
		}
		return (number != 0 && tot == number);
	}
}