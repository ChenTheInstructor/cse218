package p1_iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
//		
//		for(Integer n : list1) {
//			System.out.println(n);
//		}
		
		System.out.println(list1);
		
		ListIterator<Integer> iter1 = list1.listIterator();
		
//		System.out.println(list1.contains(2));
//		
//		iter1.next();
//		iter1.set(10);
//		iter1.previous();
//		while(iter1.hasNext()) {
//			System.out.println(iter1.next());
//		}

//		iter1.forEachRemaining(n -> System.out.println(n));
//		iter1.forEachRemaining(n -> System.out.println(n));

	}

}
