package p2_generic_methods;

public class Demo2 {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 3, 5, 7 };
		String[] arr2 = { "One", "Two", "Three" };
		showArray(arr1);
		showArray(arr2);
		Student[] arr3= {new Student("A", 1.5), new Student("B", 2.5)};
		showArray(arr3);
	}
	
	// generic method
	public static <E extends Comparable> void showArray(E[] a) { // upperbound constraint
		for (E s : a) {
			System.out.println(s);
		}
	}

//	public static void showArray2(String[] arr) {
//		for (String s : arr) {
//			System.out.println(s);
//		}
//	}
//
//	public static void showArray1(Integer[] arr) {
//		for (int n : arr) {
//			System.out.println(n);
//		}
//	}
}
