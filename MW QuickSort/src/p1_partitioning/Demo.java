package p1_partitioning;

public class Demo {

	public static void main(String[] args) {
		ArrayPar arr = new ArrayPar(20);
		arr.insert(3);
		arr.insert(8);
		arr.insert(2);
		arr.insert(9);
		arr.insert(4);
		arr.insert(1);
		arr.insert(10);
		arr.insert(5);
		arr.insert(6);
		arr.insert(7);
		arr.display();
		int partitionIndex = arr.partitionIt(0, arr.size(), 100);
		System.out.println("The partition index is: " + partitionIndex);
		arr.display();
	}

}
