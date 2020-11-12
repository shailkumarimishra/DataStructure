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
	private int size;

	public void insert(int data) {
		Node newNode = new Node(null, data, null);
		size++;
		if (root == null) {
			root = newNode;
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node currentNode = queue.remove();
			if (currentNode.left == null) {
				currentNode.left = newNode;
				break;
			} else if (currentNode.right == null) {
				currentNode.right = newNode;
				break;
			} else {
				queue.add(currentNode.left);
				queue.add(currentNode.right);
			}
		}
	}
	public void remove(int data) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node currentNode=queue.remove();
			if(currentNode.data==data) {
				//replace currentNode data with deepest Node data
				currentNode.data=getDeepestNode().data;
				//delete deepest node
				deleteDeepestNode();
				return;
			}
			else {
				if(currentNode.left!=null) {
					queue.add(currentNode.left);
				}
				if(currentNode.right!=null) {
					queue.add(currentNode.right);
				}
			}
		}
		System.out.println("Node not Found");
	}
	private void deleteDeepestNode() {
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		Node previousNode,currentNode=null;
		while(!queue.isEmpty()) {
			previousNode=currentNode;
			currentNode=queue.remove();
			if(currentNode.left==null) {
				previousNode.right=null;
				size--;
				return;
			}
			else if(currentNode.right==null) {
				currentNode.left=null;
				size--;
				return;
			}
			queue.add(currentNode.left);
			queue.add(currentNode.right);
		}
	}
	private Node getDeepestNode() {
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		Node currentNode=null;
		while(!queue.isEmpty()) {
			currentNode=queue.remove();
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
		return currentNode;
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

	public boolean contains(int data) {
		return containsHelper(root, data);
	}
	public boolean searchByLevelOrder(int data) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node currentNode = queue.remove();
			if(currentNode.data==data) {
				return true;
			}
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
		return false;
	}

	public boolean containsHelper(Node root, int data) {
		if (root != null) {
			containsHelper(root.left, data);
			if (root.data == data) {
				return true;
			}
			containsHelper(root.right, data);
		}
		return false;
	}

	public boolean containsHelperPreOrder(Node root, int data) {
		if (root != null) {
			if (root.data == data) {
				return true;
			}
			containsHelperPreOrder(root.left, data);
			containsHelperPreOrder(root.right, data);
		}
		return false;
	}

	public void printInOrder() {
		inOrderHelper(root);
	}

	private void inOrderHelper(Node root) {
		if (root != null) {
			inOrderHelper(root.left);
			System.out.print(root.data + " ");
			inOrderHelper(root.right);
		}
	}

	public void printPreOrder() {
		preOrderHelper(root);
	}

	private void preOrderHelper(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrderHelper(root.left);
			preOrderHelper(root.right);
		}
	}

	public boolean containsHelperPostOrder(Node root, int data) {
		if (root != null) {
			containsHelperPostOrder(root.left, data);
			containsHelperPostOrder(root.right, data);
			if (root.data == data) {
				return true;
			}
		}
		return false;
	}

	public void printPostOrder() {
		postOrderHelper(root);
	}

	private void postOrderHelper(Node root) {
		if (root != null) {
			postOrderHelper(root.left);
			postOrderHelper(root.right);
			System.out.print(root.data + " ");
		}
	}

	public int size() {
		return size;
	}

	private static class Node {
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
		BinaryTree tree = new BinaryTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);
		tree.insert(70);
		tree.insert(80);
		tree.printLevelOrder();
		System.out.println();
		System.out.println(tree.getDeepestNode().data);
		tree.remove(10);
		tree.remove(20);
		tree.remove(40);
		tree.remove(80);
		tree.printLevelOrder();
	}
}
