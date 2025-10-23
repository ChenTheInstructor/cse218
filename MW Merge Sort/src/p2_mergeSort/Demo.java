package p2_mergeSort;

public class Demo {

	public static void main(String[] args) {
		MergeSortArray theArray = new MergeSortArray(100);
		theArray.insert(34);
		theArray.insert(12);
		theArray.insert(32);
		theArray.insert(4);
		theArray.insert(6);
		theArray.insert(15);
		theArray.insert(19);
		theArray.insert(18);
		theArray.display();
		
		theArray.mergeSort();
		
		theArray.display();
		
	}

}
