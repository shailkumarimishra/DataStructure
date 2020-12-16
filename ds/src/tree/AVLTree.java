package tree;
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
		// This is where we will do AVL balancing
		int balance = checkBalance(currentNode.left,currentNode.right);
		if(balance>1) {
			if(checkBalance(currentNode.left.left, currentNode.left.right)>0) {
				//LL 
				
			}
			else {
				//LR 
			}
		}
		else if(balance<-1) {
			if(checkBalance(currentNode.right.right, currentNode.right.left)>0) {
				//RR 
				currentNode = leftRotate(currentNode);
			}
			else {
				//RL
				
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
	private Node leftRotate(Node currentNode) {
		Node newRoot = currentNode.right;
		currentNode.right=currentNode.right.left;
		newRoot.left=currentNode;
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
		/*if left node is not present then simply return right node's height+1
		 * we need to make it -1 because blank height is considered as -1.
		*/
		else if(rootLeft==null) {
			return -1*(rootRight.height);
		}
		else if(rootRight==null) {
			return rootLeft.height+1;
		}
		else {
			return rootLeft.height-rootRight.height;
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
}
