package p2_generic_classes;

public class GenericBag <T extends Comparable<T>> {
	private T[] arr;
	private int nElems;
	
	public GenericBag(int maxSize) {
		arr = (T[])(new Object[maxSize]);
		
	}
}
