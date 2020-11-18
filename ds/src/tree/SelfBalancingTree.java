package tree;
/**
 * If we know the keys in advance, we can make a perfectly balanced Binary Search Tree (BST).
 * Main idea is to keep the height as O(logn) for which rotation need to be done.
 * Q. How to keep it balanced when random insertion/deletion happening ?
 * for e.g; 10,20,30
 * 
 * Note:- left rotation means anti-clockwise
 *        right rotation means clockwise.
 *        
 * Types of self balancing BST:-
 * 1. AVL Tree
 * 2. Red-Black Tree
 * 
 * AVL Tree:-
 * 1. It is a BST(for every node, left subtree is smaller and right subtree is greater).
 * 2. It is balanced(for every node, difference b/w left and right heights does not exceeded 1).
 * Inorder Operation:- 
 * 1. Perform normal BST insert.
 * 2. Traverse all ancestors of the nearly inserted node from the node to root.
 * 3. If we find an unbalanced node check for any of the below cases:-
 * 		a) left left (LL) rotation
 * 		b) right right (RR) rotation
 * 		c) left right(LR) rotation
 * 		d) right left(RL) rotation
 * Note:- In a) and b) single rotation is required and in c) and d) double rotation is required.
 * 
 * Red Black Tree:-
 * 1. Every node is either red or black.
 * 2. Root is always black.
 * 3. No 2 consecutive reds are allowed.
 * 4. Number of black nodes from every node to all of it's descendants leaves should be same.
 * Note:- Red Black Tree is more flexible compare to AVL Tree.
 */
public class SelfBalancingTree {

}
