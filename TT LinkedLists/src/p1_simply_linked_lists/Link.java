package p1_simply_linked_lists;

import java.util.Objects;

public class Link <T, S>{
	private T iData;
	private S dData;

	private Link<T, S> next;

	public Link(T iData, S dData) {
		this.iData = iData;
		this.dData = dData;
	}

	public T getiData() {
		return iData;
	}

	public void setiData(T iData) {
		this.iData = iData;
	}

	public S getdData() {
		return dData;
	}

	public void setdData(S dData) {
		this.dData = dData;
	}

	public Link<T, S> getNext() {
		return next;
	}

	public void setNext(Link<T, S> next) {
		this.next = next;
	}

	
//	@Override
//	public int hashCode() {
//		return Objects.hash(iData);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Link other = (Link) obj;
//		return Objects.equals(iData, other.iData);
//	}

	
	@Override
	public String toString() {
		return "Link [TData=" + iData + ", SData=" + dData + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dData, iData);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Link other = (Link) obj;
		return Objects.equals(dData, other.dData) && Objects.equals(iData, other.iData);
	}

}
