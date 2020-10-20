package dequeue;
/*
 * Operations on Dequeue:-
 * 1. insertFront 
 * 2. insertRear
 * 3. deleteFront
 * 4. deleteRear
 * 5. getFirst
 * 6. getRear
 * 7. isFull
 * 8. isEmpty
 * 9. size
 * 
 * MyDequeue underlying Data Structure is simple array / circular array
 * 
 */
public class MyDequeue {
private static int capacity=5;
private int[] array;
private int size;
private int front;
private int rear;
private int f;
private static int r=capacity-1;
public MyDequeue() {
	this.array=new int[capacity];
}
public void insertFront(int data) {
	if(!isFull()) {
	front=(front+capacity-1)%capacity;
	this.array[front]=data;
	size++;
	}
}
public void insertRear(int data) {
	if(!isFull()) {
	rear=(front+size)%capacity;
	this.array[rear]=data;
	size++;
	}
}
public int deleteFront() {
	if(isEmpty()) {
		return -1;
	}
	int data= this.array[f++];
	size--;
	return data;
}
public int deleteRear() {
	if(isEmpty()) {
		return -1;
	}
	int data= this.array[r--];
	size--;
	return data;
}
public int getFront() {
	if(isEmpty()) {
		return -1;
	}
	
	return  this.array[f];
}
public int getRear() {
	if(isEmpty()) {
		return -1;
	}
	return this.array[r];
}
public boolean isFull() {
	return size==capacity;
}
public boolean isEmpty() {
	return size==0;
}
public int size() {
	return size;
}
public static void main(String[] args) {
	MyDequeue dequeue=new MyDequeue();
	dequeue.insertFront(10);
	dequeue.insertFront(20);
	dequeue.insertFront(30);
	dequeue.insertRear(40);
	dequeue.insertRear(50);
	dequeue.insertRear(100);
	System.out.println(dequeue.size());
	System.out.println(dequeue.getFront());
	System.out.println(dequeue.getRear());
	System.out.println("-------------");
	System.out.println(dequeue.deleteFront());
	System.out.println(dequeue.deleteRear());
	System.out.println(dequeue.getFront());
	System.out.println(dequeue.getRear());
	System.out.println("-------------");
	System.out.println(dequeue.deleteFront());
	System.out.println(dequeue.deleteRear());
	System.out.println(dequeue.getFront());
	System.out.println(dequeue.getRear());
	System.out.println("-------------");
	System.out.println(dequeue.deleteFront());
	System.out.println(dequeue.deleteRear());
	System.out.println(dequeue.getFront());
	System.out.println(dequeue.getRear());
	System.out.println("-------------");
	System.out.println(dequeue.size());
}
}





