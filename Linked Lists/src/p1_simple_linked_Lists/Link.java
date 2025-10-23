package p1_simple_linked_Lists;

public class Link {
	private int data;
	private Book book;
	private Link next;

	public Link(int data, Book book) {
		super();
		this.data = data;
		this.book = book;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public Link getNext() {
		return next;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Link [data=" + data + ", book=" + book + "]";
	}

}
