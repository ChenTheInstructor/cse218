package p2_binarySearch;

public class Demo {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 9, 10, 14, 23, 25 };
		System.out.println(search(arr, 6));
	}

	private static int search(int[] arr, int key) {// Helper method
		return binarySearch(arr, key, 0, arr.length-1);
	}

	private static int binarySearch(int[] arr, int key, int start, int end) {
		if(start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if(arr[mid] == key) {
			return mid;
		} else if(arr[mid] > key) {
			end = mid - 1;
		} else {
			start = mid + 1;
		}
		
		return binarySearch(arr, key, start, end);
	}

}
