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
	return count == 0;
	}
}
