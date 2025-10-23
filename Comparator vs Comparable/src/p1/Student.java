package p1;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int age;
	private double gpa;

	public Student(int age, double gpa) {
		super();
		this.age = age;
		this.gpa = gpa;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(age, gpa);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa);
	}


	public Student(Student s1) {
		this.age = s1.age;
		this.gpa = s1.gpa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.age, o.age);
	}

}
