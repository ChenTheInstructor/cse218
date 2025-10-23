package p1_simply_linked_lists;

public class SimpleLinkList <T, S> {
	private Link<T, S> first;

	public SimpleLinkList() {
		first = null;
	}
	
	public Link<T, S> delete(T key) {
		Link current = first;
		Link previous = first;
		while(!current.equals(new Link(key, null))) {
			if(current.getNext() == null) {
				return null;
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		
		if(current == first) {
			first = current.getNext();
		} else {
			previous.setNext(current.getNext());
		}
		
		return current;
	}

	public void display() {
		System.out.println("List (First --> Last): ");
		Link current = first;
		while (current != null) {
			System.out.println(current);
			current = current.getNext();
		}
		System.out.println();

	}

	public Link<T, S> find(int key) {
		Link current = first;
		while (!current.equals(new Link(key, null))) {
			if (current.getNext() == null) {
				return null;
			} else {
				current = current.getNext();
			}
		}
		return current;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.getNext();
		return temp;
	}

	public void insertFirst(T iData, S dData) {
		Link<T, S> newLink = new Link<>(iData, dData);
		newLink.setNext(first);
		first = newLink;
	}

	public boolean isEmpty() {
		return first == null;
	}
}
