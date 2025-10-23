package p1_simple_linked_Lists;

public class Demo {

	public static void main(String[] args) {
		Link link1 = new Link(10, new Book("A", 1.0));
		Link link2 = new Link(20, new Book("B", 12.0));
		Link link3 = new Link(30, new Book("C", 10.0));
		
		LinkedList list = new LinkedList();
		list.insert(link1);
		list.insert(link2);
		list.insert(link3);
		list.displayList();
		System.out.println("-------");
		System.out.println(list.remove());
		System.out.println(list.remove());
		System.out.println(list.remove());
		
	}

}
