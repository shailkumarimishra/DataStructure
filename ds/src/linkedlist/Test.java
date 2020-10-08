package linkedlist;

public class Test {
	private Node head;
	private Node tail;
	private int size;

	public void add(int data) {
		Node newNode = new Node(data, null);
		if (head == null) {
			head = newNode;
			tail = head;
			size++;
		} else {
			tail.next = newNode;
			tail = tail.next;
			size++;
		}
	}

	public void addLoop(int index) {
		if (head != null) {
			Node move = head;
			if (index < size) {
				if (index == 0) {
					tail.next = move;
					return;
				}
				if (index == (size - 1)) {
					tail.next = tail;
					return;
				}
				for (int i = 0; i < index - 1; i++) {
					move = move.next;
				}
				tail.next = move.next;
			} else {
				System.out.println("invalid index");
			}
		} else {
			System.out.println("list is empty!!");
		}
	}

	public boolean isLoopPresent() {
		if (head != null) {
			if (tail.next == null) {
				return false;
			}
		}
		return true;
	}

	public void removeLoop() {
		if (isLoopPresent()) {
			tail.next = null;
			return;
		}
	}


	private static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		Test test = new Test();
//		test.addLoop(2);
		test.add(10);
		test.add(20);
		test.add(30);
		test.add(40);
		test.add(50);
		test.add(60);
		test.add(70);
		test.add(80);
		test.add(90);
		test.add(100);
		test.addLoop(3);
//		System.out.println(test.isLoopPresent());
//		test.removeLoop();
//		System.out.println(test.isLoopPresent());
	}
}
