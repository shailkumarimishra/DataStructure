package stack;

public class StackUsingSLL {
private Node top;
private int size;
public void push(int data) {
	Node newNode=new Node(data,null);
	newNode.next=top;
	top=newNode;
	size++;
}
public int pop() {
	if(top==null) {
		throw new RuntimeException("Stack Underflow");
	}
	else {
		int data = top.data;
		top=top.next;
//		size=size-1;
		size--;
		return data;
	}
}
public int peek() {
	if(top==null) {
		throw new RuntimeException("Stack Underflow");
	}
	else {
		return top.data;
	}
}
public int size() {
	return size;
}
public boolean isEmpty() {
	return size==0;
}
public void clean() {
	this.top=null;
}
private static class Node{
	int data;
	Node next;
	public Node(int data, Node next) {
		this.data=data;
		this.next=next;
	}
}
public static void main(String[] args) {
	StackUsingSLL stack=new StackUsingSLL();
	System.out.println(stack.isEmpty());//true
	stack.push(100);
	stack.push(200);
	stack.push(300);
	stack.push(400);
	stack.push(500);
	System.out.println(stack.size());//5
	System.out.println(stack.peek());//500
	System.out.println(stack.pop());//500
	System.out.println(stack.size());//4
	stack.clean();
	System.out.println(stack.pop());//exception
}
}
