package p1;

import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("B", 3.1);
		Student s2 = new Student("C", 2.2);
//		System.out.println(s1.compareTo(s2));

//		Comparator<Student> comparator = new Comparator<>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//
//		};
		
		Comparator<Student> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
		
		System.out.println(comparator.compare(s1, s2));
	}

}
