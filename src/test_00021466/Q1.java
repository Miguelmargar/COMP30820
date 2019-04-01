package test_00021466;

public class Q1 {
	public static void main(String[] args) {
		// test cases
		
		// should return: 0
		System.out.println("test case 1: " + getSumDigits(""));

		// should return: 0
		System.out.println("test case 2: " + getSumDigits("hello"));
		
		// should return: 5
		System.out.println("test case 3: " + getSumDigits("a2b3"));
	}

	// write this method
	public static int getSumDigits(String str) {

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sum += (str.charAt(i) -48);
			}
		}
		return sum;
	}
}
