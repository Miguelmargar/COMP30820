package Pract_4;

public class Question_1 {
	public static void main(String[] args) {
		int check = 2;
		int count = 1;
		
//		if the number is prime print the first 10 prime numbers
		while (count < 11 ) {
			if (isPrime(check)) {
				System.out.println(check);
				count++;
			}
			check++;
		}
	} 
	
	public static boolean isPrime(int number) {
//		start counter at 2
		int count = 2;
		
//		loop while the count is less or equal to the square number
		while (count <= (Math.sqrt(number))) {
//			if the number mod the count is 0 return false
			if (number % count == 0) {
				return false;
			} else {
//				if not increase the count to keep checking
				count++;
			}	
		}
		return true;
	}

}