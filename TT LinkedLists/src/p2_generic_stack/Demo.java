package p2_generic_stack;

public class Demo {

	public static void main(String[] args) {
		// a stack behavior
		SimpleLinkList<String, String> list = new SimpleLinkList<>();
		list.push("10", "1.1");
		list.push("20", "2.1");
		list.push("30", "3.1");
		list.push("40", "4.1");

		System.out.println(list.peek());
		System.out.println();
		System.out.println("List content:");
		while(!list.isEmpty()) {
			System.out.println(list.pop());
		}
	}

}
