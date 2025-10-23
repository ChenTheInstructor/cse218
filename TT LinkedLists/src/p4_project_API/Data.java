package p4_project_API;

import java.util.LinkedList;

public class Data {
	public String keyword;
	public LinkedList<String> babyList;

	public Data(String keyword) {
		super();
		this.keyword = keyword;
		this.babyList = new LinkedList<>();
	}

	@Override
	public String toString() {
		return "Data [keyword=" + keyword + "]";
	}

}
