package p1_stacks;

import java.util.ArrayList;

public class StackDemo {

	public static void main(String[] args) {
		StackX stack1 = new StackX(5);
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		System.out.println("Peek value: " + stack1.peek());
		while(!stack1.isEmpty()) {
			System.out.println(stack1.pop());
		}
	}

}
