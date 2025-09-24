package p2_queues;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q1 = new Queue(5);
		System.out.println(q1.isEmpty());
		q1.insert(10);
		q1.insert(20);
		q1.insert(30);
		q1.insert(40);
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		q1.insert(50);
		q1.insert(60);
		System.out.println(q1.remove());
		System.out.println(q1.size());
		System.out.println(q1.peekFront());

	}

}
