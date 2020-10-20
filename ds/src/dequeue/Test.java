package dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
	
	public static void main(String[] args) {
		ArrayDeque<Integer> dequeue=new ArrayDeque<>(5);
		dequeue.addFirst(10);
		dequeue.addFirst(20);
		dequeue.addFirst(30);
		dequeue.addLast(40);
		dequeue.addLast(50);
		System.out.print(dequeue+"  ");
		System.out.print(dequeue.removeFirst()+" ");
		System.out.print(dequeue.removeLast()+" ");
		System.out.print(dequeue.removeFirst()+" ");
		System.out.print(dequeue.removeLast()+" ");
	}

}
