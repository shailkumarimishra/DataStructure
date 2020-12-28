package heap;
/*
 * Operations on Binary Heap:-
 * 1. size
 * 2. insert
 * 3. deleteHeap
 * 4. isEmpty
 * 5. traverse/display
 * 6. peek/getMinElement
 * 7. poll
 */
public class BinaryHeap {
private int[] arr;
private int size;
private static int CAPACITY=10;
public BinaryHeap() {
	this.arr = new int[CAPACITY];
}
public int size() {
	return size;
}
public boolean isEmpty() {
	return size>0?false:true;
}
public void insert(int data) {
	arr[size++]=data;
	//heapyfy bottom to top
	heapyfyBottomToTop(size-1);
}
private void heapyfyBottomToTop(int index) {
	int parent=index/2;
	//when we are at the root of the tree. Hence no more heapyfy is required.
	if(index<=0) {
		return;
	}
	//If current value is smaller than it's parent.
	if(arr[index]<arr[parent]) {
		int temp=arr[index];
		arr[index]=arr[parent];
		arr[parent]=temp;
	}
	heapyfyBottomToTop(parent);
}
public void display() {
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]+" ");
	}
}
public void peek() {
	System.out.println(arr[0]);
}
public void deleteHeap() {
	arr=null;
	size=0;
}
public int poll() {
	if(size==0) {
		return -1;
	}
	else {
		int temp=arr[0];
		arr[0]=arr[size-1];
		heapyfyTopToBottom(0);
		size--;
		return temp;
	}
}
private void heapyfyTopToBottom(int index) {
	int left=index;
	int right=index+1;
	int smallestChild=0;
	//if there is no child of this node
	if(size==1) {
		return;
	}
	//if their is only left child of this node then do a comparison & return
	else if(size==left+2) {
		if(arr[index]>arr[left]) {
			int temp=arr[index];
			arr[index]=arr[left];
			arr[left]=temp;
		}
		return;
	}
	//if both children are there,find out the smallest child
	else {
		if(arr[left]<arr[right]) {
			smallestChild=left;
		}
		else {
			smallestChild=right;
		}
		//if parent is greater than smallest child then do swapping
		if(arr[index]>arr[smallestChild]) {
			int temp=arr[index];
			arr[index]=arr[smallestChild];
			arr[smallestChild]=temp;
		}
	}
	heapyfyTopToBottom(smallestChild);
}
public static void main(String[] args) {
	BinaryHeap heap=new BinaryHeap();
	heap.insert(10);
	heap.insert(5);
	heap.insert(20);
	heap.insert(30);
	heap.insert(3);
	heap.insert(50);
	System.out.println(heap.poll());
	heap.display();
}
}
