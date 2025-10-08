package p3_generic_classes;

public class Demo3 {

	public static void main(String[] args) {
		Point<Integer, Float> p1 = new Point<>(2, 2.5f);
		Point<Double, Integer> p2 = new Point<>(1.5, 25);
		Point<String,Double> p3 = new Point<>("One", 2.0);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
