package test;

public class Q1 {
	public static void main (String[] args) {
		// test cases
		
		// Should return: "M1ss2ss3pp4"
		System.out.println(replace("Mississippi", 'i'));

		// Should return: "Hello World"
		System.out.println(replace("Hello World", 'w'));

		// Should return: "1134"
		System.out.println(replace("1234", '2'));
	}

	// write this method
	public static String replace(String str, char ch) {

		String result = "";
		char count = '1';

		for (int i = 0; i <= str.length() -1; i++) {
			if (str.charAt(i) == ch) {
				result += count;
				count++;
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	}
}
