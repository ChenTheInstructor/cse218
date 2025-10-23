package p2_apps;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}

	private static double factorial(int n) {
		if(n == 1) {
			return 1;
		}
		return 1.0/n + factorial(n-1);
	}

}
