package test_00021466;

public class Q3 {
	public static void main(String[] args) {
		// test cases...

		// the following test cases should return: true
		System.out.println(isBalanced(""));
		System.out.println(isBalanced("()"));
		System.out.println(isBalanced("()()"));
		System.out.println(isBalanced("(())"));

		// the following test cases should return: false
		System.out.println(isBalanced("("));
		System.out.println(isBalanced(")"));
		System.out.println(isBalanced("(()"));
		System.out.println(isBalanced("()(("));
	}

	// write this method
	public static boolean isBalanced(String p) {

		int countR = 0;
		int countL = 0;

		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				countL++;
			}
			if (p.charAt(i) == ')') {
				countR++;
			}
		}
		if (countL != countR) {
			return false;
		}

		int count = 0;
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				count++;
			}
			if (p.charAt(i) == ')') {
				count--;
			}
			if (count < 0) {
				return false;
			}
		}
	return true;
	}
}
