package p2_generic_stacks;

import java.util.Objects;

public class Link<T, S> {
	private T iData;
	private S dData;
	private Link next;

	public Link(T iData, S dData) {
		this.iData = iData;
		this.dData = dData;
		next = null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(iData);
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
		return Objects.equals(iData, other.iData);
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

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "[iData=" + iData + ", dData=" + dData + "]";
	}

}
