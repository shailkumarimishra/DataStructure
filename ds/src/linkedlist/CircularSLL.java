package linkedlist;

public class CircularSLL {
	private Node head;
	private int size;
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
				head=newNode;
				newNode.next=newNode;
				size++;
			}
			else {
				Node temp=head.next;
				while(temp.next!=head) {
					temp=temp.next;
				}
				temp.next=newNode;
				newNode.next=head;
				size++;
			}
		}
		public void dislay() {
			Node temp=head;
			while(temp.next!=head) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		public static void main(String[] args) {
			CircularSLL csll=new CircularSLL();
			csll.add(10);
			csll.dislay();
		}
	}

