package p1;

public class Demo {
	private static int count = 1;
	public static void main(String[] args) {
//		while(true) {
//			System.out.println("Hi " + count++);
//		}
		greetings(count);
	}
	
	public static void greetings(int count) {
//		if(count > 4) { //base case
//			return;
//		}
		String greet = "Hi";
		System.out.println(greet + "!\t" + count++);
		greetings(count);
	}

}
