package p1_simply_linked_lists;

public class Demo {

	public static void main(String[] args) {
		SimpleLinkList<String, Double> list = new SimpleLinkList();
		list.insertFirst("10", 1.1);
		list.insertFirst("20", 2.1);
		list.insertFirst("30", 3.1);
		list.insertFirst("40", 4.1);
		list.insertFirst("50", 5.1);
		System.out.println(list.find("30"));
		System.out.println(list.deleteFirst());
		
		System.out.println("delete: ");
		System.out.println(list.delete("40"));
		System.out.println("Show List: ");
		list.display();
	}

}
