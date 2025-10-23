package p2_apps;

public class DemoArray1 {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 4, 3, 9, 1};
		System.out.println(sumArr(arr, 0, arr.length - 1));
		System.out.println(sumArray(arr));
		
	}
	
	public static int sumArray(int[] arr) { // helper method
		return sumArr(arr, 0, arr.length - 1);
	}

	private static int sumArr(int[] arr, int start, int end) {
		if(start > end) {
			return 0;
		}
		return arr[start] + sumArr(arr, start + 1, end);
	}

}
