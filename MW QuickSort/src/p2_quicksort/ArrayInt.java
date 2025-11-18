package p2_quicksort;

public class ArrayInt {
	private long[] arr;
	private int nElems;

	public ArrayInt(int maxSize) {
		arr = new long[maxSize];
		nElems = 0;
	}

	public void recQuickSort(int left, int right) {
		if(left >= right) {
			return;
		} else {
			long pivot = arr[right];
			int partition = partitionIt(left,right, pivot);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}

	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;

		while (true) {
			while (leftPtr < right && arr[++leftPtr] < pivot) {
				; // no-op
			}

			while (rightPtr > left && arr[--rightPtr] >= pivot) {
				; // no-op
			}

			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}

		}

		swap(right, leftPtr);
		return leftPtr;
	}

	public void quickSort() {
		recQuickSort(0, nElems - 1);
	}

	public void insert(long value) {
		arr[nElems++] = value;
	}

	public int size() {
		return nElems;
	}

	public void swap(int dex1, int dex2) {
		long temp = arr[dex1];
		arr[dex1] = arr[dex2];
		arr[dex2] = temp;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
