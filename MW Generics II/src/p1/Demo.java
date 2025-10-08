package p1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Number> list1 = new ArrayList<>();// upper bounded constraint
		ArrayList<? super Integer> list2 = new ArrayList<>();// lower bounded constraint
		
		list2.add(123);
	}

}
