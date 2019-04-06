package test_00021466;

public class Q2 {
	public static void main(String[] args) {
		// test cases

		// should return: "" (i.e. a string with no characters)
		System.out.println("test case 1: " + getLCS("hello", "HELLO"));

		// should return: "ing"
		System.out.println("test case 2: " + getLCS("computing", "working"));
	}

	// write this method
	public static String getLCS(String s1, String s2) {

//        String reS1 = "";
//        String reS2 = "";
//
//        for (int i = s1.length() - 1; i >= 0; i--) {
//            reS1 += s1.charAt(i);
//        }
//
//        for (int i = s2.length() - 1; i >= 0; i--) {
//            reS2 += s2.charAt(i);
//        }
//
//        int min = Math.min(reS1.length(), reS2.length());
//        String rev = "";
//
//        for (int i = 0; i < min; i++) {
//            if (reS1.charAt(i) == reS2.charAt(i)) {
//                rev += reS1.charAt(i);
//            }
//        }
//
//        String end = "";
//
//        for (int i = rev.length() -1; i >= 0; i--) {
//            end += rev.charAt(i);
//        }

        String end = "";

        for (int i = s1.length()-1, j = s2.length()-1;
             i >= 0 && j >= 0 && s1.charAt(i) == s2.charAt(j);
             i--, j--) {
            end = s1.charAt(i) + end;
        }

        return end;
    }
}