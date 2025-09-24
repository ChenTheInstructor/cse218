package p1_stacks;

public class StackX {
	private long[] stackArr;
	private int top; // by the loader in JVM
	private int maxSize;
	
	public StackX(int stackSize) {
		stackArr = new long[stackSize];
		top = -1;
		maxSize = stackSize;
	}
	
	public long peek() {
		return stackArr[top];
	}
	
	public int size() {
		return top + 1;
	}
	
	public long pop() {
		return stackArr[top--];
	}
	
	public void push(long value) {
		stackArr[++top] = value;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}
