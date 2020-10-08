package queue;
/*
 * 1. enQueue
 * 2. deQueue
 * 3. getFront
 * 4. getRear
 * 5. size
 * 6. isEmpty
 * 7. isFull
 * 8. clear
 */
public class QueueUsingCircularArray {
private static final int CAPACITY=10;
private int[]array;
private int size;
private int front;
public QueueUsingCircularArray() {
	this.array=new int[CAPACITY];
}
public void enQueue(int data) {
	if(!isFull()) {
	this.array[size++]=data;
	front=array[0];
	}
}
public int deQueue() {
	return -1;
}
public boolean isFull() {
	return size==CAPACITY;
}
public boolean isEmpty() {
	return size==0;
}
}
