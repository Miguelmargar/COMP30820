package test;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		// test cases

		// should return: [], i.e. an array with zero elements
		System.out.println("test case 1: " + Arrays.toString(getDistinctLCLetters("")));
		System.out.println();
		// should return: [], i.e. an array with zero elements
		System.out.println("test case 2: " + Arrays.toString(getDistinctLCLetters("BEE")));
		System.out.println();
		// should return: [e]
		System.out.println("test case 3: " + Arrays.toString(getDistinctLCLetters("Bee")));
		System.out.println();
		// should return: [d, e, l, o, r]
		System.out.println("test case 4: " + Arrays.toString(getDistinctLCLetters("Hello World!")));
	}

	// write this method
	public static char[] getDistinctLCLetters(String str) {

		if (str.length() == 0) {
			return new char[0]; // i.e. an array with zero elements
		} else {

			String lower = "";
			for (int i = 0; i < str.length(); i++) {
				if (Character.isLowerCase(str.charAt(i))) {
					lower += str.charAt(i);
				}
			}
//			System.out.println("lower is: " + lower);


			String almost = "";
			for (int i = 0; i < lower.length(); i++) {
//				System.out.println("lower char is: " + lower.charAt(i));
				if (almost.indexOf(lower.charAt(i)) == -1) {
					almost += lower.charAt(i);
				}
			}

//			System.out.println("complete almost is: " + almost);


			char[] result = new char[almost.length()];
			for (int i = 0; i < almost.length(); i++) {
				result[i] = almost.charAt(i);
			}

			return result;


		}
	}
}