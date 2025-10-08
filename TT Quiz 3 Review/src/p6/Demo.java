package p6;

import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student(20, 1.5);
		Student s2 = new Student(19, 2.5);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(new StudentGPAComparator().compare(s1, s2));
	
		Comparator<Student> myComparator = (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa());
		System.out.println(((Student o1, Student o2) -> Double.compare(o1.getGpa(), o2.getGpa()).compare(s1, s2));
		
		
	}
	
	

}
