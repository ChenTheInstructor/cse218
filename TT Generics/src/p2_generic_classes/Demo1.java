package p2_generic_classes;

public class Demo1 {

	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<>(20, 30.0);
		System.out.println(p1);

		Point<Double, Integer> p2 = new Point<>(10.0, 20);
		System.out.println(p2);

		Point<String, Double> p3 = new Point<>("one", 2.2);
		System.out.println(p3);
		
		Point<Integer, Double> p5 = new Point<>(2, 5.0); // type parameter
	
		Point<Student, Integer> p6 = new Point(new Student(), 100);
	}
	
	

}
