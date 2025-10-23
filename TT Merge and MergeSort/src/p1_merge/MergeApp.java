package p1_merge;

public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayB = { 10, 13, 17, 19, 34, 68 };
		int[] arrayC = new int[arrayA.length + arrayB.length];
		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC);
	}

	private static void display(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;

		while (indexA < sizeA && indexB < sizeB) { // neither array is finished
			if (arrayA[indexA] <= arrayB[indexB]) {
				arrayC[indexC++] = arrayA[indexA++];
			} else {
				arrayC[indexC++] = arrayB[indexB++];
			}
		}
		while (indexA < sizeA) {
			arrayC[indexC++] = arrayA[indexA++];
		}

		while (indexB < sizeB) {
			arrayC[indexC++] = arrayB[indexB++];
		}
	}

	
}
