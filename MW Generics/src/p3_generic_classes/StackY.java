package p3_generic_classes;

public class StackY <T> {
	private T[] arr;
	private int maxSize;
	
	public StackY(int maxSize) {
		this.maxSize = maxSize;
		arr = (T[])new Object[maxSize];
	}
	
	
}
