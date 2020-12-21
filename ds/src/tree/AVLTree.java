package tree;

import java.util.LinkedList;
import java.util.Queue;


/*
 * Operations on AVL Tree:-
 * 1. insert
 * 2. contains
 * 3. traversal
 * 4. delete
 * 5. size
 * 6. height
 * for example:- 
 * a) 30,20,40,10,5,3,4,50,60,70,65
 * b) 80,90,40,35,85,10,6,8,95,100
 * c) 8,7,3,2,1,9,6,4
 * d) 35,50,40,25,30,60,78,20,28
 * e) 50,20,60,10,8,15,32,46,11,48
 * f) 14,17,11,7,53,4,13
 * g) 50,20,60,10,8,15,32,46,11,48
 * h) 60,90,55,40,11,17,29,37,91,32
 * i) 20,25,30,40,45,60,55,57
 * 
 * Conclusion:-
 * 1. While inserting apply BST concept
 * 2. Always make sure tree is balanced if not apply below rules to make it balance
 * 	case1 (LL):- Rotate right
 *  case2 (RR):- Rotate left
 *  case3 (LR):- first apply RR and then apply LL.
 *  case4 (RL):- first apply LL and then apply RR.
 *  
 *  Note:- For case1 & case2 apply Grapes Demo and for case3 & case4 apply Wall Demo.
 *  
 *  Q1. Check given tree is balanced or not?
 *  Q2. Write code for RR condition?(In another word,Write code for left rotation?).
 *  Q3. Write code for LL condition, LR condition, RL condition?
 *  Q4. Find height of a given tree?
 */
public class AVLTree {
	private Node root;
	public void insert(int data) {
		 root = insertHelper(root, data);
	}
	private Node insertHelper(Node currentNode,int data) {
		// This else if block is for BST condition
		if(currentNode==null) {
			return new Node(data,0,null,null);
		}
		else if(data<=currentNode.data) {
			currentNode.left=insertHelper(currentNode.left, data);
		}
		else {
			currentNode.right=insertHelper(currentNode.right, data);
		}
		return doBalance(currentNode);
	}
	private Node leftRotate(Node currentNode) {
		Node newRoot = currentNode.right;
		currentNode.right=currentNode.right.left;
		newRoot.left=currentNode;
		currentNode.height=calculateHeight(currentNode);
		newRoot.height=calculateHeight(newRoot);
		return newRoot;
	}
	/**
	 * 1. make a new node e.g; Node newRoot = currentNode.left;
	 * 2. separate the current node e.g; currentNode.left=currentNode.left.right;
	 * 3. add current node to the right of new node
	 * 4. update current node's height
	 * 5. update new node's height
	 * @param currentNode
	 * @return new node
	 */
	private Node rightRotate(Node currentNode) {
		Node newRoot = currentNode.left;
		currentNode.left=currentNode.left.right;
		newRoot.right=currentNode;
		currentNode.height=calculateHeight(currentNode);
		newRoot.height=calculateHeight(newRoot);
		return newRoot;
	}
	private int calculateHeight(Node currentNode) {
		if(currentNode==null) {
			return 0;
		}
		return 1+Math.max(currentNode.left!=null?currentNode.left.height:-1,currentNode.right!=null?currentNode.right.height:-1);
	}
	private int checkBalance(Node rootLeft, Node rootRight) {
		//if current node is a leaf node then no need to check balance of it's children.
		if(rootLeft==null && rootRight==null) {
			return 0;
		}
		/*if right node is not present then simply return (left node's height+1)
		 * (we need to make it -1 because blank height is considered as -1)
		 * and if left node is not present then return -(right node's height+1).  
		*/
		else if(rootLeft==null) {
			return -(rootRight.height+1);
		}
		else if(rootRight==null) {
			return rootLeft.height+1;
		}
		else {
			return rootLeft.height-rootRight.height;
		}
	}
	public void printLevelOrder() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node currentNode = queue.remove();
			System.out.print(currentNode.data + " ");
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
	}
	public void remove(int data) {
		root=removeHelper(root,data);
	}
	private Node removeHelper(Node currentNode,int data) {
		if(currentNode==null) {
			return null;
		}
		if(data<currentNode.data) {
			currentNode.left=removeHelper(currentNode.left, data);
		}
		else if(data>currentNode.data) {
			currentNode.right=removeHelper(currentNode.right, data);
		}
		//if current node is the node to be deleted
		else {
//			System.out.println(currentNode.data+".......");
			//node to be deleted have both children present
			if(currentNode.left!=null && currentNode.right!=null) {
				Node temp=currentNode;
				//find minimum node from right subtree
				Node minimumNode = getMinimumElement(temp.right);
				//replace current node with minimum node from right subtree
				currentNode.data=minimumNode.data;
				//delete minimum node from right.
				removeHelper(currentNode.right,minimumNode.data);
			}
			//if node to be deleted has only right child
			else if(currentNode.right!=null) {
				currentNode=currentNode.right;
			}
			//if node to be deleted has only left child
			else if(currentNode.left!=null) {
				currentNode=currentNode.left;
			}
			//if node to be deleted do not have child(leaf Node)
			else {
				currentNode=null;
			}
			return currentNode;
		}
		return doBalance(currentNode);
	}
	private Node doBalance(Node currentNode) {
		int balance = checkBalance(currentNode.left,currentNode.right);
		if(balance>1) {
			if(checkBalance(currentNode.left.left, currentNode.left.right)>0) {
				//LL 
				currentNode = rightRotate(currentNode);
			}
			else {
				//LR 
				currentNode.left=leftRotate(currentNode.left);
				currentNode=rightRotate(currentNode);
			}
		}
		else if(balance<-1) {
			if(checkBalance(currentNode.right.right, currentNode.right.left)>0) {
				//RR 
				currentNode = leftRotate(currentNode);
			}
			else {
				//RL
				currentNode.right=rightRotate(currentNode.right);
				currentNode=leftRotate(currentNode);
			}
		}
		if(currentNode.left!=null) {
			currentNode.left.height=calculateHeight(currentNode.left);
		}
		if(currentNode.right!=null) {
			currentNode.right.height=calculateHeight(currentNode.right);
		}
		currentNode.height=calculateHeight(currentNode);
		return currentNode;
	}
	private Node getMinimumElement(Node root) {
		if(root.left==null) {
			return root;
		}
		else {
			return getMinimumElement(root.left);
		}
	}
private static class Node{
	int data;
	int height;
	Node left;
	Node right;
	public Node(int data, int height, Node left, Node right) {
		this.data = data;
		this.height = height;
		this.left = left;
		this.right = right;
	}	
}
public static void main(String[] args) {
	AVLTree tree=new AVLTree();//30,20,40,10,5,3,4,50,60,70,65
	tree.insert(30);
	tree.insert(20);
	tree.insert(40);
	tree.insert(10);
	tree.insert(5);
	tree.insert(3);
	tree.insert(4);
	tree.insert(50);
	tree.insert(60);
	tree.insert(70);
	tree.insert(65);
	tree.printLevelOrder();
	int height = tree.calculateHeight(tree.root);
	System.out.println();
	System.out.println(height);
	tree.remove(40);
	System.out.println();
	tree.printLevelOrder();
	tree.remove(60);
	System.out.println();
	tree.printLevelOrder();
	tree.remove(65);
	System.out.println();
	tree.printLevelOrder();
	tree.remove(30);
	System.out.println();
	tree.printLevelOrder();
	tree.remove(50);
	System.out.println();
	tree.printLevelOrder();
}
}
