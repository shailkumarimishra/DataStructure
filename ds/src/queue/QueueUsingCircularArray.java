package queue;
/*
 * 1. enQueue
 * 2. deQueue
 * 3. getFist
 * 4. getLast
 * 5. size
 * 6. isEmpty
 * 7. isFull
 * 8. clean
 */
public class QueueUsingCircularArray {
private static final int CAPACITY=10;
private int[]array;
private int size;
private int front;
private int rear;
public QueueUsingCircularArray() {
	this.array=new int[CAPACITY];
}
/*
 * T.C:-O(1)
 */
public void enQueue(int data) {
	if(!isFull()) {
	this.array[size++]=data;
	}
}
/*
 * T.C:-O(1)
 */
public int deQueue() {
	if(!isEmpty()) {
		rear=(front+(size-1))%CAPACITY;
		int data=this.array[front++];
		size--;
		return data;
	}
	return -1;
}
/*
 * T.C:-O(1)
 */
public int getFirst() {
	return isEmpty() ? -1 : this.array[front];
}
/*
 * T.C:-O(1)
 */
public int getLast() {
	return isEmpty() ? -1 : this.array[size-1];
}
/*
 * T.C:-O(1)
 */
public boolean isFull() {
	return size==CAPACITY;
}
/*
 * T.C:-O(1)
 */
public boolean isEmpty() {
	return size==0;
}
/*
 * T.C:-O(1)
 */
public int size() {
	return size;
}
/*
 * T.C:-O(1)
 */
public void clean() {
	this.array=null;
}
public static void main(String[] args) {
	QueueUsingCircularArray queue=new QueueUsingCircularArray();
	queue.enQueue(10);
	queue.enQueue(20);
	queue.enQueue(30);
	queue.enQueue(40);
	queue.enQueue(50);
	System.out.println(queue.getFirst()+" "+queue.getLast());//10 50
	System.out.println(queue.deQueue());//10
	System.out.println(queue.size());//4
	System.out.println(queue.getFirst()+" "+queue.getLast());//20 50
	System.out.println(queue.deQueue());//20
	System.out.println(queue.deQueue());//30
	System.out.println(queue.getFirst()+" "+queue.getLast());//40 50
	System.out.println(queue.deQueue());//40
	System.out.println(queue.deQueue());//50
	System.out.println(queue.size());//0
	System.out.println(queue.deQueue());//-1
}

}
