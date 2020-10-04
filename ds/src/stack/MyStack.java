package stack;
/*
 * Application of stack:-
 * 1. In function call
 * 2. Checking for balanced expression
 * 3. Reversing items
 * 4. Infix to Prefix/Postfix
 * 5. Undo/Redo or Forward/Backward
 * 6. Stock span problems and it's variation******
 * 
 * Operations on Stack(Abstract data type)
 * 1. push
 * 2. pop
 * 3. size
 * 4. isEmpty
 * 5. peek
 * 
 * Stack implementation using array(Fixed in size)
 */
public class MyStack {
private int[] array;
private int size;
private static int capacity=10;
public MyStack() {
	this.array=new int[capacity];
}
/*
 * 1.first check stack is full or not if it is full throw exception
 * 2. else push the element and increase the size. 
 * 
 * T.C:- O(1)
 */
public void push(int data) throws StackOverflowException {
	if(size!=capacity)
		array[size++]=data;
	else 
		throw new StackOverflowException("stack overflow");
}
/*
 * 1. first check stack is empty or not if empty then throw exception
 * 2. else pop the element and decrease the size.
 * 
 * T.C:- O(1)
 */
public int pop() throws StackUnderflowException {
	if(size>0) {
	int result = this.array[size-1];
	size--;
	return result;
	}
	else {
		throw new StackUnderflowException("stack underflow");
	}
}
/*
 * 1. first check stack is empty or not if empty then throw exception
 * 2. else pop the element
 * 
 *  T.C:- O(1)
 */
public int peek() throws StackUnderflowException {
	if(size>0) {
		return this.array[size-1];
	}
	else {
		throw new StackUnderflowException("stack underflow");
	}
}
/*
 * 1. check size==0 then true else false
 * 
 * T.C:-O(1)
 */
public boolean isEmpty() {
	return size==0;
}
/*
 * 1. return size
 * 
 * T.C:- O(1)
 */
public int size() {
	return size;
}
public static void main(String[] args) {
	MyStack stack=new MyStack();
	try {
	System.out.println(stack.isEmpty());//true
//	stack.pop();
	stack.push(10);
//	stack.pop();
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.push(50);
	System.out.println(stack.isEmpty());//false
	stack.push(60);
	stack.push(70);
	stack.push(80);
	stack.push(90);
	stack.push(100);
	System.out.println(stack.size());//10
	stack.push(110);
	System.out.println(stack.peek());//100
/*	System.out.println(stack.pop());//100
	System.out.println(stack.pop());//90
	System.out.println(stack.pop());//80
	System.out.println(stack.size());//7*/
	System.out.println("----------");
	int count=stack.size();
	for(int i=0;i<count;i++) {
		System.out.println(stack.pop());
	}
	System.out.println(stack.isEmpty());//true
//	System.out.println(stack.peek());
	}catch(StackOverflowException | StackUnderflowException e) {
		System.out.println(e.getMessage());
	}
}
}









