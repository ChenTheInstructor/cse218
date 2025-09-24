package p3_pq;

public class Demo {

	public static void main(String[] args) {
		PriorityQ pq = new PriorityQ(5);
		pq.insert(10);
		pq.insert(5);
		pq.insert(6);
		pq.insert(3);
		pq.insert(1);
		while (!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}

}
