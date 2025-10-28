package p1_comparable;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("D", 2.5, 20);
		Student s2 = new Student("A", 3.5, 18);
		Student s3 = new Student("M", 1.5, 21);
		
		LinkedList<Student> myList = new LinkedList<>();
		myList.add(s1);
		myList.add(s2);
		myList.add(s3);
		
		System.out.println(myList.toString());
		
		System.out.println("Sort by age: ");
		Collections.sort(myList);
		System.out.println(myList);
		
//		Student[] arr = {s1, s2, s3};
//		System.out.println(Arrays.toString(arr));
//		
//		Comparator<Student> myComparator1 = new Comparator<>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		};
//		
		System.out.println("Sort by name: ");
		Comparator<Student> myComparator1 = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Collections.sort(myList, myComparator1);
		System.out.println(myList.toString());
		
		System.out.println("\nSort by GPA: ");
		Collections.sort(myList, (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa()));
		System.out.println(myList.toString());
		
		
		
	}

}
