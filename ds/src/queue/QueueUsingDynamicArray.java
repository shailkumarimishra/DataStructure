package queue;
/*
 * 1. enQueue
 * 2. deQueue
 * 3. getFrist
 * 4. getLast
 * 5. size
 * 6. isEmpty
 * 8. clear
 */
public class QueueUsingDynamicArray {
private static int CAPACITY=10;
private int[] array;
private int size;
public QueueUsingDynamicArray() {
	this.array=new int[CAPACITY];
}
public void enQueue(int data) {
	if(size<CAPACITY) {
		this.array[size++]=data;
	}else {
		int[]temp=this.array;
		CAPACITY=2*CAPACITY;
		this.array=new int[CAPACITY];
		for(int i=0;i<size;i++) {
			this.array[i]=temp[i];
		}
		this.array[size++]=data;
	}
}
public int deQueue() {
	if(!isEmpty()) {
		int data=this.array[0];
		size--;
		return data;
	}
	return -1;
}
public int getFirst() {
	return isEmpty() ? -1: this.array[0];
}
public int getLast() {
	return isEmpty() ? -1 : this.array[size-1];
}
public boolean isEmpty() {
	return size==0;
}
public int size() {
	return size;
}
public void clear() {
	this.array=null;
}
public static void main(String[] args) {
	QueueUsingDynamicArray queue=new QueueUsingDynamicArray();
	queue.enQueue(10);
	queue.enQueue(20);
	queue.enQueue(30);
	queue.enQueue(40);
	queue.enQueue(50);
	queue.enQueue(60);
	System.out.println(queue.isEmpty());
	System.out.println(queue.size());
//	System.out.println(queue.deQueue());
	System.out.println(queue.getFirst());
	System.out.println(queue.getLast());
}
}
