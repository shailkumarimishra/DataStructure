package stack;

public class StackUsingDynamicArray {
	private static final int CAPACITY = 10;
	private int[] array;
	private int size;

	public StackUsingDynamicArray() {
		this.array = new int[CAPACITY];
	}

	public void push(int data) {
		if (size < CAPACITY) {
			this.array[size++] = data;
			return;
		} else {
			int[] temp = this.array;
			this.array = new int[2 * CAPACITY];
			for (int i = 0; i < size; i++) {
				this.array[i] = temp[i];
			}
			this.array[size++] = data;
		}
	}

	public int pop() throws StackUnderflowException {
		if (size > 0) {
			int data = this.array[size - 1];
			size--;
			return data;
		} else {
			throw new StackUnderflowException("stack UnderFlow");
		}
	}

	public int peek() throws StackUnderflowException {
		if (size > 0) {
			return this.array[size - 1];
		} else {
			throw new StackUnderflowException("stack UnderFlow");
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public static void main(String[] args) {
		StackUsingDynamicArray array = new StackUsingDynamicArray();
		try {
			array.push(100);
			System.out.println(array.pop());
//			System.out.println(array.peek());
			System.out.println(array.isEmpty());
			array.push(200);
			array.push(300);
			System.out.println(array.pop());
		} catch (StackUnderflowException e) {
			System.out.println(e.getMessage());
		}
	}
}
