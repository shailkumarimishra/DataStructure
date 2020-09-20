package ds;

public class MyArrayList {
	
	private int[] array;
	private int size; 
	public MyArrayList() {
		super();
		this.array = new int[5];
	}
	/*
	 * step1:- create an array of size 10
	 * step2:- check whether array is full or not
	 * step3:- If not then add data and increase the size
	 * step4:- else print "Array is full".
	 */
	public void add(int data) {
		if(size!=array.length) {
			array[size]=data;
			size++;
		}
		else {
			System.out.println("Array is full");
		}
	}
	
	public int size() {
		return size;
	}
	/*
	 * step1:- check whether array is empty or not
	 * step2:- if not empty then check given index is within a range
	 * step3:- if array is empty then return -1.  
	 */
	public int get(int index) {
		if(index>=0 && index<size ) {
			return array[index];
		}
		else
			return -1;
	}
	public static void main(String[] args) {
		MyArrayList list=new MyArrayList();
		System.out.println(list.size());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());//4
		list.add(50);
		list.add(60);
		System.out.println(list.get(5));
	}
}






