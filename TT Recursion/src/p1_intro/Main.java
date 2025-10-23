package p1_intro;

public class Main {
	private static int count = 1;
	public static void main(String[] args) {
		greetings(count);
//		while(true) {
//			System.out.println("hi");
//		}
	}
	
	public static void greetings(int count) {
		if(count > 5) { // base case!
			return;
		}
		System.out.println("Hi\t" + count);
		count++;
		greetings(count);
	}
}
