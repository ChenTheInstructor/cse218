package p1_stacks;

import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
//		StackX stack1 = new StackX(5);
//		stack1.push(10);
//		stack1.push(20);
//		stack1.push(30);
//		stack1.push(40);
//		stack1.push(50);
//		System.out.println(stack1.isFull());
//		System.out.println(stack1.pop());
//		System.out.println(stack1.peek());
//		System.out.println(stack1.pop());
//		while(!stack1.isEmpty()) {
//			System.out.println(stack1.pop());
//		}
		
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		stack1.push(50);
		while(!stack1.isEmpty()) {
			System.out.println(stack1.pop());
		}
		
	}

}
