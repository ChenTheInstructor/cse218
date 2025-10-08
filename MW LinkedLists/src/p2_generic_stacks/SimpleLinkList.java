package p2_generic_stacks;

public class SimpleLinkList<T, S> {
	private Link<T, S> first;
	
	public SimpleLinkList() {
		first = null;
	}
	
//	public Link<T, S> delete(T key) {
//		Link<T, S> current = first;
//		Link<T, S> previous = first;
//		while(!current.equals(new Link<>(key, null))) {
//			if(current.getNext() == null) {
//				return null;
//			}else {
//				previous = current;
//				current = current.getNext();
//			}
//		}
//		
//		if(current == first) {
//			first = first.getNext();
//		} else {
//			previous.setNext(current.getNext());
//		}
//		return current;
//	}
	
//	public void display() {
//		System.out.println("List: (first -- last): ");
//		Link<T, S> current = first;
//		while(current != null) {
//			System.out.println(current);
//			current = current.getNext();
//		}
//		System.out.println();
//	}
	
//	public Link<T,S> find(T key) {
//		Link<T, S> current = first;
////		while(current.getiData() != key) {
////			if(current.getNext() == null) {
////				return null;
////			} else {
////				current = current.getNext();
////			}
////		}
////		return current;
//		
//		while(current != null) {
//			if(current.equals(new Link<>(key, null))) {
//				return current;
//			} 
//				current = current.getNext();
//		}
//		return null;
//	}
//	
	public Link<T, S> pop() {
		Link<T, S> temp = first;
		first = first.getNext();
		return temp;
	}
	
	public Link<T, S> peek() {
		return first;
	}
	
	public void push(T iData, S dData) {
		Link<T, S> newLink = new Link<>(iData, dData);
		if(isEmpty()) {
			first = newLink;
		} else {
			newLink.setNext(first);
			first = newLink;
		}
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}
