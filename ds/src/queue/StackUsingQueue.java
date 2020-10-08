package queue;

import java.util.LinkedList;
import java.util.Queue;

/*
* 1. push
* 2. pop
* 3. peek
* 4. isEmpty
* 5. size
* 6. clean
*/
public class StackUsingQueue {
private Queue<Integer> queue;

public StackUsingQueue() {
	this.queue=new LinkedList<>();
}
public void push(int data) {
	queue.add(data);
}
public int pop() {
	return -1;
}
public int size() {
	return queue.size();
}
public int peek() {
	if(!queue.isEmpty()) {
		return queue.peek();
	}
	return -1;
}
public boolean isEmpty() {
	return queue.isEmpty();
}
public void clean() {
	queue.clear();
}
public static void main(String[] args) {
	StackUsingQueue stack=new StackUsingQueue();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.push(50);
	System.out.println(stack.size());
	System.out.println(stack.peek());
	System.out.println(stack.pop());
}
}
