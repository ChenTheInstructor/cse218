package p1;

public class Demo3Palindrome {

	public static void main(String[] args) {
		String str = "mom";

		str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		System.out.println(isPalindrome(str));
	}

	private static boolean isPalindrome(String str) {
		if (str.length() <= 1) {
			return true;
		}
		if (str.charAt(0) != str.charAt(str.length() - 1)) {
			return false;
		} else {
			return isPalindrome(str.substring(1, str.length()-1));
		}
	}

}
