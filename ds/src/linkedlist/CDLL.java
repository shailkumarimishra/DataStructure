package linkedlist;

public class CDLL {
	private Node head;
	private Node tail;
	private int size;
	private static class Node{
		Node prev;
		int data;
		Node next;
		public Node(Node prev, int data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}
		
	}
	
	public void add(int data) {
		Node newNode=new Node(null,data,null);
		if(head==null) {
			addFirst(data);
			return;
		}
		addLast(data);
	}
	public void addFirst(int data) {
		Node newNode=new Node(null,data,null);
		if(head==null) {
			head=newNode;
			newNode.next=head;
			newNode.prev=head;
			tail=head;
			size++;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=head.prev;
		head.prev=tail;
		tail.next=head;
		size++;
	}
	public void addLast(int data) {
		Node newNode=new Node(null,data,null);
		if(head==null) {
			addFirst(data);
			return;
		}
		tail.next=newNode;
		tail.next.prev=tail;
		tail=tail.next;
		tail.next=head;
		head.prev=tail;
		size++;
	}
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
		newNode.next=temp.next;
		temp.next=newNode;
		newNode.prev=temp;
		newNode.next.prev=newNode;
		size++;
	}
	public void remove(int data) {
		if(head==null) {
			return;
		}
		if(size==1 && head.data==data) {
			removeFirst();
			return;
		}
		if(tail.data==data) {
			removeLast();
			return;
		}
		Node temp=head;
		while(temp!=tail) {
			if(temp.data==data) {
				if(temp.data==head.data) {
					removeFirst();
					return;
				}
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
				temp.next=null;
				temp.prev=null;
				size--;
				return;
			}
			temp=temp.next;
		}
		
	}
	public void removeFirst() {
		if(head==null) {
			return;
		}
		if(size==1) {
			head=null;
			size--;
			return;
		}
		head=head.next;
		tail.next.next=null;
		tail.next.prev=null;
		tail.next=head;
		head.prev=tail;
		size--;
	}
	public void removeLast() {
		if(head==null) {
			return;
		}
		if(size==1) {
			removeFirst();
			return;
		}
		tail.next=null;
		tail=tail.prev;
		tail.next=head;
		head.prev.prev=null;
		head.prev=tail;
		size--;
	}
	public int get(int index) {
		Node temp=head;
		if(!(index>=0 && index<size)) {
			return -1;
		}
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	public boolean contains(int data) {
		if(head==null) {
			return false;
		}
		Node temp=head;
		for(int i=0;i<size;i++) {
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
		if(head==null) {
			return;
		}
		Node temp=head;
		for(int i=0;i<size;i++) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		CDLL cdll=new CDLL();
		cdll.add(10);
		cdll.add(20);
		cdll.add(30);
//		cdll.add(40);
//		cdll.addFirst(50);
//		cdll.addFirst(60);
//		cdll.addFirst(70);
//		cdll.addLast(90);
//		cdll.addLast(100);
//		cdll.add(0, 80);
//		cdll.add(0,20);
//		cdll.add(3,110);
//		cdll.remove(10);
//		cdll.remove(20);
//		cdll.removeFirst();
//		cdll.removeFirst();
//		cdll.removeFirst();
//		cdll.removeLast();
//		cdll.removeLast();
//		cdll.display();
//		System.out.println(cdll.size());
//		System.out.println(cdll.get(1));
		System.out.println(cdll.contains(40));
	}

}
