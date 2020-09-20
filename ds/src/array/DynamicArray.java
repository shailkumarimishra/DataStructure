package array;

public class DynamicArray {
private int[] array;
private int capacity=10;
private int size;
public DynamicArray() {
	this.array=new int[capacity];
}
/*
 * 1. check bucket is full or not
 * 2. if bucket is full then 
 * 	a) store original array reference to temp array
 *  b) Double the capacity of original array.
 *  c) copy the data from temporary array to original one.
 * 3. add the data to the array
 * 4. increase the size.
 *
 *T.C:- O(n)
 *S.C:- O(n^2)
 */
public void add(int data) {
	if(size!=capacity) {
		this.array[size++]=data;
	}
	else {
		int[] temp=array;
		this.capacity=capacity*2;
		this.array=new int[capacity];
		for(int i=0;i<size;i++) {
			array[i]=temp[i];
		}
		array[size++]=data;
	}
}
/*
 * 1. first check index is in the range. 
 * 2. start the loop from index till size.
 * 3. assign value of array[i+1] into array[i].
 * 4. and then increase the size.
 * 
 * T.C:- O(n)
 * S.C:- O(1)
 */
public void remove(int index) {
	if(index>=0 && index<size) {
		for(int i=index;i<size;) {
			array[i]=array[++i];
		}
		size--;
	}
}
/*
 * 1. check index is in the range
 * 2. return the value (array[index])
 * T.C:- O(1)
 * S.C:- O(1)
 */
public int get(int index) {
	if(index>=0 && index<size) {
		return array[index];
	}
	else {
		return -1;
	}
}
/*
 * 1. iterate the loop from o to size.
 * 2. check array[i]==data then return true. 
 * 3. else return false.
 * T.C:- O(n)
 * S.C:- O(n)
 */
public boolean contains(int data) {
	for(int i=0;i<size;i++) {
		if(array[i]==data) {
			return true;
		}
	}
	return false;
}
/*
 * T.C:- O(1)
 * S.C:- O(1)
 */
public int size() {
	return size;
}
/*
 * 1. iterate loop from 0 to size
 * 2. print array[i]
 * 
 * T.C:- O(n)
 * S.C:- O(1)
 */
public void display() {
	for(int i=0;i<size;i++) {
		System.out.println(array[i]);
	}
}
public static void main(String[] args) {
	DynamicArray array=new DynamicArray();
	array.add(10);
	array.add(20);
	array.add(30);
	array.add(40);
	array.add(50);
	array.add(60);
	array.add(70);
	array.add(80);
	array.add(90);
	array.add(100);
	array.add(110);
	array.add(120);
	array.add(130);
	array.add(140);
	array.add(150);
	array.add(160);
	array.display();
	System.out.println(array.size());
	System.out.println("---------------");
	array.remove(15);
	array.display();
	System.out.println(array.size());
}
}




