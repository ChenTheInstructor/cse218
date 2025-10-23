package p2_apps;

public class DemoNumSum {

	public static void main(String[] args) {
		System.out.println(factorial(17));
	}

	private static int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
