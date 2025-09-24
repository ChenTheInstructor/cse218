package p3_pq;

public class PriorityQ {
	private long[] arr;
	private int nItems;
	private int maxSize;
	
	public PriorityQ(int maxSize) {
		this.maxSize = maxSize;
		arr = new long[maxSize];
		nItems  = 0;
	}
	
	public long remove() {
		return arr[--nItems];
	}
	
	public int size() {
		return nItems;
	}
	
	public long peekMin() {
		return arr[nItems - 1];
	}
	
	public void insert(long value) {
		int j;
		if(nItems == 0) {
			arr[nItems++] = value;
		} else {
			for(j = nItems - 1; j >= 0; j--) {
				if(value > arr[j]) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = value;
			nItems++;
		}
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
}
