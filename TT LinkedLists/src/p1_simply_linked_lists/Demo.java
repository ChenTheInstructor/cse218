package p1_simply_linked_lists;

public class Demo {

	public static void main(String[] args) {
		// a stack behavior
		SimpleLinkList<String, String> list = new SimpleLinkList<>();
		list.insertFirst("10", "1.1");
		list.insertFirst("20", "2.1");
		list.insertFirst("30", "3.1");
		list.insertFirst("40", "4.1");

		System.out.println(list.delete("40"));
		
		System.out.println("List content:");
		list.display();
	}

}
