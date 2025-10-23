package p2_generic_stack;

public class SimpleLinkList<T, S> {
	private Link<T, S> first;

	public SimpleLinkList() {
		first = null;
	}
	
	public Link peek() {
		return first;
	}

	public Link pop() {
		Link temp = first;
		first = first.getNext();
		return temp;
	}

	public void push(T iData, S dData) {
		Link<T, S> newLink = new Link<>(iData, dData);
		newLink.setNext(first);
		first = newLink;
	}

	public boolean isEmpty() {
		return first == null;
	}
}
