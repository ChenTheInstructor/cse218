package p1_generic_methods;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 3, 5, 7, 9 };
		String[] arr2 = { "One", "Two", "Three" };
		showArray(arr1);
		showArray(arr2);
	}
	
	public static <E> void showArray(E[] arr) {
		for(E n : arr) {
			System.out.println(n);
		}
	}
	
//	public static void showArray1(Integer[] arr) {
//		for(int n : arr) {
//			System.out.println(n);
//		}
//	}
//	
//	public static void showArray2(String[] arr) {
//		for(String n : arr) {
//			System.out.println(n);
//		}
//	}
}
