package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(4);
//		
//		System.out.println("---stack---");
//		
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//			System.out.println(stack.());
//		}
		
		LinkedList<Integer> queue = new LinkedList<Integer>(); //Queue 자료구조 사용한 예  메서드에 따라 다름!
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		System.out.println("---queue---");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());  // poll: FIFO
		}
		
		
	}

}
