package p3_project;

public class MainLinkedList {
	private MainLink first;
	
	public MainLinkedList() {
		first = null;
	}
	
	public boolean insertFirst(String newWord) {
		MainLink newLink = new MainLink(newWord);
		newLink.next = first;
		first = newLink;
		return true;
	}
	
	public MainLink contains(String keyword) {
		
	}
}
