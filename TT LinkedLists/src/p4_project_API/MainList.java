package p4_project_API;

import java.util.LinkedList;

public class MainList {
	private LinkedList<Data> list;

	public MainList() {
		list = new LinkedList<>();
	}
	
	public void addFirst(Data data) {
		list.addFirst(data);
	}
	
	public boolean contains(String keyword) {
		return null;
	}
}
