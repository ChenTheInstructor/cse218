package p2_apps;

public class DemoBinarySearch {

	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 9, 13, 17, 21, 23 };
		System.out.println(search(arr, 20));
	}

	private static int search(int[] arr, int key) {
		return binarySearch(arr, key, 0, arr.length-1);
	}

	private static int binarySearch(int[] arr, int key, int start, int end) {
		if(start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if(arr[mid] == key) {
			return mid;
		} else if (arr[mid] > key) {
			end = mid - 1;
		} else {
			start = mid + 1;
		}
		return binarySearch(arr, key, start, end);
	}

}
