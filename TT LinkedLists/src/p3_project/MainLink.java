package p3_project;

import java.util.LinkedList;

public class MainLink {
	public String keyword;
	public LinkedList<String> babyList;
	public MainLink next;
//	public int babyListSize = 0;
	
	public MainLink(String keyword) {
		this.keyword = keyword;
		babyList = new LinkedList<>();
		next = null;
	}
	
	public void addToBabyList(String nextWord) {
		babyList.addFirst(nextWord);
//		babyListSize++;
	}
	
	public String getWordFromBabyList() {
		int index = (int)(Math.random() * babyList.size());
		return babyList.get(index);
	}
	
	
}
