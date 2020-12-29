package linkedlist;

public class CSLL {
	private Node head;
	private int size;
	private Node tail;
	private static class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
		
	}
	public void add(int data) {
		Node newNode=new Node(data,null);
		if(head==null) {
			addFirst(data);
		}
		else {
			addLast(data);
		}
	}
	public void addFirst(int data) {
		Node newNode=new Node(data,null);
		if(head==null) {
			head=newNode;
			tail=newNode;
			newNode.next=newNode;
			size++;
			return;
		}
		newNode.next=head;
		head=newNode;
		tail.next=head;
		size++;
	}
	public void addLast(int data) {
		Node newNode=new Node(data,null);
		if(head==null) {
			addFirst(data);
			return;
		}
		tail.next=newNode;
		tail=tail.next;
		newNode.next=head;
		size++;
	}
	public void add(int index,int data) {
		Node newNode=new Node(data,null);
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
		Node temp=head;
		Node prev=temp;
		for(int i=0;i<size;i++) {
			if(temp.data==data) {
				if(temp.next==head) {
					removeLast();
					return;
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
	public void removeFirst() {
		if(head==null) {
			return;
		}
		if(size==1) {
			head=null;
			size--;
			return;
		}
		tail.next=head.next;
		head.next=null;
		head=tail.next;
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
		Node temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
		}
		tail=temp;
		temp.next=null;
		tail.next=head;
		size--;
	}
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
	public boolean contains(int data) {
		Node temp=head;
		if(head==null) {
			return false;
		}
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
		Node temp=head;
		for(int i=0;i<size;i++) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		CSLL csll=new CSLL();
		csll.add(10);
		csll.add(20);
//		csll.addFirst(30);
//		csll.addFirst(40);
		csll.add(30);
//		csll.addLast(70);
//		csll.addLast(80);
//		csll.add(2, 100);
//		csll.add(2, 200);
//		csll.remove(10);
		csll.remove(30);
//		csll.removeFirst();
//		csll.removeFirst();
//		csll.removeFirst();
//		csll.removeLast();
//		csll.removeLast();
//		System.out.println(csll.get(1));
//		System.out.println(csll.contains(20));
		csll.display();
		System.out.println(csll.size());
	}
}
