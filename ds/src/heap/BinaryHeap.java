package heap;
/*
 * Operations on Binary Heap:-
 * 1. size
 * 2. insert
 * 3. delete
 * 4. isEmpty
 * 5. height
 * 6. traverse
 * 7. peek/getMinElement
 * 8. poll
 */
public class BinaryHeap {
private int[] arr;
private int size;
private static int CAPACITY=10;
public BinaryHeap(int[] arr) {
	this.arr = new int[CAPACITY];
}
public int size() {
	return size;
}
public boolean isEmpty() {
	return arr.length>0?false:true;
}
public void insert(int data) {
}
}
