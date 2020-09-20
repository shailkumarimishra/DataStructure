package linkedlist;

public class DLL {
	private Node head;
	private int size;
	private Node tail;

	private static class Node {
		Node prev;
		int data;
		Node next;

		public Node(Node prev, int data, Node next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

	}

	public void add(int data) {
		Node newNode = new Node(null, data, null);
		if (head == null && tail == null) {
			head = newNode;
			tail = head;
			size++;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			size++;
		}

	}
	
	public void addFirst(int data) {
		Node newNode=new Node(null,data,null);
		if(head==null && tail==null) {
			head=newNode;
			tail=head;
			size++;
		}
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			size++;
		}
	}
	
	public void addLast(int data) {
		Node newNode=new Node(null,data,null);
		if(head==null && tail==null) {
			tail=newNode;
			head=tail;
			size++;
		}
		else {
			newNode.prev=tail;
			tail.next=newNode;
			tail=newNode;
			size++;
		}
	}
	/*
	 * 1.create a new node
	 * 2.validate index
	 * 3.check the index position
	 * 		a)if index==0 then call addFirst()
	 * 		b)if index==size then call addLast()
	 * 		c)else traverse till given index and then link the new node
	 * 4.increase the size 
	 */
	public void add(int index,int data) {
		Node newNode=new Node(null,data,null);
		if(!(index>=0 && index<=size)) {
			return;
		}
		if(index==0) {
			addFirst(data);
			return;
		}
		if(index==size) {
			addLast(data);
			return;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		newNode.prev=temp;
		newNode.next=temp.next;
		temp.next=newNode;
		newNode.next.prev=newNode;
		size++;
	}
	/*
	 * 1. check head is null or not
	 * 2. if not null then 
	 * 		a)check with the first node data if matched then remove
	 * 		b)check with the last node if matched then remove
	 * 		c)traverse till the given data is matched if matched then remove
	 * 3.decrease the size 
	 */
	public void remove(int data) {
		if(head==null) {
			return;
		}
		if(head.data==data) {
			removeFirst();
			return;
		}
		if(tail.data==data) {
			removeLast();
			return;
		}
		Node temp=head;
		while(temp!=null) {
			if(temp.data==data) {
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
				temp.next=null;
				temp.prev=null;
				size--;
			}
			temp=temp.next;
		}
	}
	public void removeFirst() {
		if(head==null) {
			return;
		}
		else {
			head=head.next;
			head.prev.next=null;
			head.prev=null;
			size--;
		}
	}
	public void removeLast() {
		if(head==null && tail==null) {
			return;
		}
		else {
			tail=tail.prev;
			tail.next.prev=null;
			tail.next=null;
			size--;
		}
	}
	public int get(int index) {
		if(!(index>=0 && index<=size)) {
			return -1;
		}
		if(index==0) {
			return head.data;
		}
		if(index==size) {
			return tail.data;
		}
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp.data;
		
	}
	public boolean contains(int data) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==data) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public int size() {
		return size;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		DLL dll = new DLL();
		dll.addLast(10);
		dll.addLast(20);
		dll.addLast(30);
		dll.addLast(40);
		dll.add(2, 50);
	//	dll.remove(30);
//		dll.removeFirst();
//		dll.removeLast();
//		dll.display();
		System.out.println(dll.get(5));
		System.out.println(dll.contains(90));
	}
}
