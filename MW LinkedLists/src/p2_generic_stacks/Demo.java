package p2_generic_stacks;

public class Demo {

	public static void main(String[] args) {
		SimpleLinkList<String, Double> list = new SimpleLinkList();
		list.push("10", 1.1);
		list.push("20", 2.1);
		list.push("30", 3.1);
		list.push("40", 4.1);
		list.push("50", 5.1);
//		System.out.println(list.find("30"));
		
		System.out.println("Peek: " + list.peek());
		
		
		while (!list.isEmpty()) {
			System.out.println(list.pop());
		}

//		System.out.println("delete: ");
//		System.out.println(list.delete("40"));
//		System.out.println("Show List: ");
//		list.display();
	}

}
