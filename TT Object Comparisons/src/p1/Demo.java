package p1;

import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Z", 3.5);
		Student s2 = new Student("a", 3.5);
		System.out.println(s1.compareTo(s2) );
		
//		StudentComparator myComparator = (new Demo()).new StudentComparator();
//		StudentComparator myComparator = new StudentComparator();
		
//		Comparator<Student> myComparator = new Comparator<>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		};
		
		Comparator<Student> myComparator = (o1, o2) -> {
			System.out.println("I am using lambda expression!");
			System.out.println("I am using lambda expression!");
			System.out.println("I am using lambda expression!");
			System.out.println("I am using lambda expression!");
			System.out.println("I am using lambda expression!");
			return o1.getName().compareTo(o2.getName());
			};
		
		System.out.println(myComparator.compare(s1, s2));
	}

//	// inner class
//	 class StudentComparator implements Comparator<Student>{
//
//		@Override
//		public int compare(Student o1, Student o2) {
//			return o1.getName().compareTo(o2.getName());
//		}

//	}
}
