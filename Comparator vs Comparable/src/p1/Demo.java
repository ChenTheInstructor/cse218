package p1;

import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student(19, 4.0);
		Student s2 = new Student(19, 4.0);
		Student s3 = new Student(s1);
		
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println(s1 == s3); // compare the addresses of the objects
		// == compares addresses of objects, not contents of objects
		//
		
		
		System.out.println(s1.equals(s2));
		
		
		
//		System.out.println(s1.compareTo(s2));
		
//		StudentGPAComparator myComparator = new StudentGPAComparator();
//		int result = myComparator.compare(s1, s2);
		
		// 
//		Comparator<Student> myComparator = new Comparator<>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Double.compare(o1.getGpa(), o2.getGpa());
//			}
//			
//		};
		
//		Comparator<Student> myComparator = (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa());
//		System.out.println(myComparator.compare(s1, s2));
	}

}
