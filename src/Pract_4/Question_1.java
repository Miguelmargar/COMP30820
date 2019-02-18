package Pract_4;

public class Question_1 {
	public static void main(String[] args) {
		int check = 2;
		int count = 1;
		
		while (count < 11 ) {
			if (isPrime(check)) {
				System.out.println(check);
				count++;
			}
			check++;
		}
	} 
	
	public static boolean isPrime(int number) {
		int count = 2;
		
		while (count <= (Math.sqrt(number))) {
			if (number % count == 0) {
				return false;
			} else {
				count++;
			}	
		}
		return true;
	}

}