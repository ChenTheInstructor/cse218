package p1;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(); // raw type
		list1.add("Hi");
		list1.add("12");
		String s = list1.get(0);
		String n = list1.get(1);
		System.out.println(s);
		System.out.println(n);
		// Reifiable type: No information lost between compile time and runtime.
		// primitive types, non-generic classes, Raw type (List,Map), Unbounded wild-card types 
		
		// Non-reifiable type: Runtime loses parameterized type information
		// applies to generics List<String>, Map<String, Integer>
		
//		System.out.println(list1 instanceof ArrayList<Integer>);
		ArrayList<String>[] arr = new ArrayList<>()[4];
	}

}
