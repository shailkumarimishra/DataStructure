package tree;

import java.util.LinkedList;
import java.util.Queue;

/*
 * BinaryTree:- 
 * ->Every Node at most 2 children(0,1,2)
 * 
 * Operations on BinaryTree:- 
 * 1. insert/add
 * 2. delete/remove
 * 3. search/contains
 * 4. traversal
 * 5. size
 * 
 * Tree traversal:-
 * 1. Depth First (recursive):-
 * 		a) InOrder(left->root->right)
 * 		b) PreOrder(root->left->right)
 * 		c) PostOrder(left->right->root)
 * 2. Breadth First /Level Order (non-recursive) :- 
 * 
 * 		
 * 
 */
public class BinaryTree {
	private Node root;
public void  insert(int data) {
	Node newNode=new Node(null,data,null);
	if(root==null) {
		root=newNode;
		return;
	}
	Queue<Node> queue=new LinkedList<>();
	queue.add(root);
	while(!queue.isEmpty()) {
		Node currentNode = queue.remove();
		if(currentNode.left==null) {
			currentNode.left=newNode;
			break;
		}else if(currentNode.right==null){
			currentNode.right=newNode;
			break;
		}
		else {
			queue.add(currentNode.left);
			queue.add(currentNode.right);
		}
	}
}
public void printInOrder() {
	inOrderHelper(root);
}
private void inOrderHelper(Node root) {
	if(root!=null) {
		inOrderHelper(root.left);
		System.out.print(root.data+" ");
		inOrderHelper(root.right);
	}
}
public void printPreOrder() {
	preOrderHelper(root);
}
private void preOrderHelper(Node root) {
	if(root!=null) {
		System.out.print(root.data+" ");
		preOrderHelper(root.left);
		preOrderHelper(root.right);
	}
}
public void printPostOrder() {
	postOrderHelper(root);
}
private void postOrderHelper(Node root) {
	if(root!=null) {
		postOrderHelper(root.left);
		postOrderHelper(root.right);
		System.out.print(root.data+" ");
	}
}
private static class Node{
	Node left;
	int data;
	Node right;
	public Node(Node left, int data, Node right) {
		this.left = left;
		this.data = data;
		this.right = right;
	}
}
public static void main(String[] args) {
	BinaryTree tree=new BinaryTree();
	tree.insert(10);
	tree.insert(20);
	tree.insert(30);
	tree.insert(40);
	tree.insert(50);
	tree.insert(60);
	tree.insert(70);
	tree.insert(80);
	tree.printInOrder();
	System.out.println();
	tree.printPreOrder();
	System.out.println();
	tree.printPostOrder();
}
}
