package p2_apps;

public class DemoPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("Racet car"));
	}

	private static boolean isPalindrome(String str) {
		str = str.toUpperCase().replaceAll("[^A-Z0-9]", "");
		
		if(str.length() <= 1) {
			return true;
		}
		
		if(str.charAt(0) != str.charAt(str.length()-1)) {
			return false;
		}
		
		return isPalindrome(str.substring(1, str.length() - 1));
	}

}
