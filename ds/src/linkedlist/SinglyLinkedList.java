package linkedlist;

public class SinglyLinkedList {
	private Node head;
	private int size;
	private Node tail;
	/*
	 * 1. Create a new node
	 * 2. check head is null or not if null means there is no element in the list
	 * 3. if head is null then link newNode to head and increase the size
	 * 4. else traverse till last node then link newNode to last node and increase the size 
	 */
	public void add(int data) {
		Node newNode=new Node(data,null);
		if(head==null) {
//			head=newNode;
//			size++;
			addFirst(data);
			tail=head;
		}
		else {
			/*Node temp=head;
			while(temp!=null && temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			size++;*/
			addLast(data);
		}
		
	}
	/*
	 * 1. Create a new node
	 * 2. link head to newNode.next
	 * 3. assign newNode to head and increase the size
	 */
	public void addFirst(int data) {
		Node newNode=new Node(data,null);
		newNode.next=head;
		head=newNode;
		size++;
	}
	/*
	 * 1.Create a new node
	 * 2.traverse till last node
	 * 3.link newNode to temp.next
	 * 4.increase the size
	 */
	public void addLast(int data) {
		Node newNode=new Node(data,null);
		if(tail==null) {
			add(data);
			return;
		}
		tail.next=newNode;
		tail=tail.next;
		size++;
	}
	/*
	 * 1. Create a new node
	 * 2. validate the index range if not valid then print "invalid index"
	 * 3. else check 
	 * 		a) It is at first position
	 * 		b) It is at last position
	 * 		c) It is at specific position (b/w first & last)
	 * 4. link the new node at appropriate position
	 * 5. increase the size
	 */
	public void add(int index,int data) {
		Node newNode=new Node(data,null);
		if(!(index>=0 && index<=size)) {
			System.out.println("invalid index");
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
//		add at specific position
		Node temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		size++;
	}
	/*
	 * 1. check head is null or not.
	 * 2. if not null then move head pointer to 2nd node
	 * 3. decrease size;
	 */
	public void removeFirst() {
		if(head==null) {
			return;
		}
		head=head.next;
		size--;
	}
	/*
	 * 1. check head is null or not
	 * 2. traverse till previous node of the last node (size-2)
	 * 3. remove last node
	 * 4. decrease the size
	 */
	public void removeLast() {
		if(head==null) {
			return;
		}
		if(head.next==null) {
			head=null;
			size--;
			return;
		}
		Node temp=head;
		for(int i=0;i<size-2;i++) {
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
		size--;
	}
	
	/*
	 * 1. validate head
	 * 2. check the given data is first element or not
	 * 3. if it is first element then remove the node
	 * 4. otherwise, traverse till given data and then remove the node
	 * 5. decrease the size;
	 */
	public void remove(int data) {
		if(head==null) {
			return;
		}
		if(size==1 && head.data==data) {
			head=null;
			size--;
			return;
		}
		Node temp=head; 
		Node prev=temp; 
//		Node prev=null;
		while(temp!=null) {
			if(temp.data==data) {
				if(temp.next==null) {
					tail=prev;
				}
				prev.next=temp.next;
				temp.next=null;
				size--;
				return;
			}
			prev=temp;
			temp=temp.next;
		}
		
	}
	/*
	 * 1.check given index is valid or not
	 * 2. if not not valid then return -1
	 * 3. else traverse till index
	 * 4. return data 
	 */
	public int get(int index) {
		if(!(index>=0 && index<size)) {
			return-1;
		}
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	/*
	 * 1. traverse till given node
	 * 2. if data found return true
	 * 3. else return false
	 */
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

	private static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
public static void main(String[] args) {
	SinglyLinkedList sll=new SinglyLinkedList();
	sll.add(10);
//	sll.add(20);
//	sll.add(0, 90);
//	sll.add(2, 70);
//	sll.addFirst(50);
//	sll.addLast(80);
//	sll.addLast(20);
//	sll.addLast(40);
//	sll.removeFirst();
//	sll.removeLast();
	sll.remove(10);
//	System.out.println(sll.size());
//	System.out.println(sll.get(0));
//	System.out.println(sll.contains(20));
	sll.display();
	System.out.println(sll.size());
	
	
	
}
}
