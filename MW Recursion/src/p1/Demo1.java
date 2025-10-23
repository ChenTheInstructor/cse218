package p1;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println(factorial(20));
	}

	private static double numSum(int n) {
		if(n == 1) {
			return 1;
		}
		return 1.0 / n + numSum(n - 1);
	}
	
	public static int factorial(int n) {
		if(n == 1 ) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
