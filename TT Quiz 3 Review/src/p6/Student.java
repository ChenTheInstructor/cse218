package p6;

public class Student implements Comparable<Student> {
	private int age;
	private double gpa;

	public Student(int age, double gpa) {
		super();
		this.age = age;
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.age, o.age);
	}

}
