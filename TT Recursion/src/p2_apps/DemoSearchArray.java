package p2_apps;

public class DemoSearchArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 4, 3, 9, 1 };
		System.out.println(searchArray(arr, 19));
	}

	private static int searchArray(int[] arr, int key) {
		return recSearch(arr, key, 0);
	}

	private static int recSearch(int[] arr, int key, int startIndex) {
		if (startIndex == arr.length) {
			return -1;
		} else if (arr[startIndex] == key) {
			return startIndex;
		} else {
			return recSearch(arr, key, startIndex + 1);
		}
	}

}
