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
//	check for the perfect number
	public static boolean isPerfectNumber(int number) {
//		initialise count and a total 
		int count = 1;
		int tot = 0;
		
//		loop as long as count is less than the input number
		while (count < number) {
//			if number mod count is 0
			if (number % count == 0) {
//				add the count to the total
				tot += count;
			}
//			increase the count anyway
			count++;
		}
//		return true when number is not 0 and the total is the same as the input number
		return (number != 0 && tot == number);
	}
}