package array;

public class MyArrayList {
	private int[] array;
	private int size;

	public MyArrayList() {
		this.array = new int[10];
	}

	/*
	 * 1. Check array is full or not. 2. if not full then add the element. 3.
	 * increase the size.
	 * T.C:- O(1) if  you are adding element at last position
	 * S.C:- O(1)
	 */
	public void add(int data) {
		if (size < array.length) {
			array[size++] = data;
		}
	}
	/*
	 * 1. first validate the index (lies b/w the range).
	 * 2. start the loop from size-1 till given index.
	 * 3. do the right shifting e.g; array[i+1]=array[i]
	 * 4. assign the data into the array at given position.
	 * 5. increase the size.
	 * T.C:- O(n)
	 * S.C:- O(1) explanation 4(index)+4(data)+4(i)
	 */
	public void add(int index,int data) {
		if(index>=0 && index<size) {
			for(int i=size-1;i>=index;i--) {
				array[i+1]=array[i];
			}
			array[index]=data;
			size++;
		}
		
	}

	/*
	 * 1.first validate the index (lies b/w the range). 2.start the loop from the
	 * given index till size-1. 3.do the left shifting till the size-1. e.g; refer
	 * line no 28 4.after left shifting decrease the size.
	 * T.C:-O(n)
	 * S.C:-O(1)
	 */
	public void remove(int index) {
		if (index >= 0 && index < size) {
			for (int i = index; i < size - 1; i++) {
				array[index] = array[++index];
			}
			size--;
		}

	}

	/*
	 * 1.validate the index range. 2.if valid then return the element. 3.else return
	 * -1.
	 * T.C:-O(1)
	 * S.C:-O(1)
	 */
	public int get(int index) {
		if (index > 0 && index < size) {
			return array[index];
		}
		return -1;
	}

	/*
	 * 1. Iterate all the elements. 2. check with the given value if matched then
	 * return true. 3. else return false.
	 * T.C:-O(n)
	 * S.C:-O(1)
	 */
	public boolean contains(int data) {
		for (int i = 0; i < size; i++) {
			if (data == array[i]) {
				return true;
			}
		}
		return false;
	}
/*
 * T.C:- O(1)
 */
	public int size() {
		return size;
	}
/*
 * T.C:-O(n)
 * S.C:-O(1)
 */
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.display();
		System.out.println(list.size());
//		list.remove(3);
//	list.remove(5);
//		list.display();
//		System.out.println(list.size());
		System.out.println("--------------------");
		list.add(7, 58);
		list.display();
		System.out.println(list.size());

	}
}
