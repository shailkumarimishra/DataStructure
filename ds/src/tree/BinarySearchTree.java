package tree;
/**
 * For every node,Keys in left side are smaller and Keys in right side are greater than
 * parent node.
 * 
 * Operations on Binary Search Tree:-
 * 1. add
 * 2. contains
 * 3. remove
 * 4. size
 * 5. height
 */
public class BinarySearchTree {
	private Node root;
	
	public void add(int data) {
		 root = insert(root,data);
	}
	private Node insert(Node root,int data) {
		Node newNode=new Node(null,data,null);
		if(root==null) {
			return newNode;
		}
		if(root.key>data) {
			root.left=insert(root.left, data);
		}
		else if(root.key<=data) {
			root.right=insert(root.right, data);
		}
		return root;
	}
	public void printInOrder() {
		printInOrderHelper(root);
	}
	private void printInOrderHelper(Node root) {
		if(root!=null) {
			printInOrderHelper(root.left);
			System.out.print(root.key+" ");
			printInOrderHelper(root.right);
		}
	}
	private static class Node{
		Node left;
		int key;
		Node right;
		public Node(Node left, int key, Node right) {
			this.left = left;
			this.key = key;
			this.right = right;
		}
	}
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.add(10);
		bst.add(20);
		bst.add(30);
		bst.add(4);
		bst.add(2);
		bst.add(80);
		bst.printInOrder();
	}
}
