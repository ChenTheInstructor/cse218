package p1_stacks;

public class StackX {
	private long[] stackArr;
	private int maxSize;
	private int top;
	
	public StackX(int size) {
		maxSize = size;
		stackArr = new long[size];
		top = -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	public long peek() {
		return stackArr[top];
	}
	public long pop() {
		return stackArr[top--];
	}
	public void push(long value) {
		stackArr[++top] = value;
	}
}
