package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class binaryTree {
	
	private treeNode root;
	
	// Tree node class.
	private class treeNode{
		private int data;
		private treeNode left;
		private treeNode right;
		
		public treeNode(int data) {
			this.data=data;
		}
	}
	
		// Insertion in Binary Tree.
	
		public void insert(treeNode node , int data ) {
			if(node== null) {
				root = new treeNode(data);
			}
			Queue<treeNode> q = new LinkedList<>();
			q.add(node);
			while(!q.isEmpty()) {
				treeNode temp = q.poll();
				if(temp.left == null) {
					temp.left=new treeNode(data);
					break;
				}
				else {
					q.add(temp.left);
				}
				if(temp.right == null) {
					temp.right=new treeNode(data);
					break;
				}
				else {
					q.add(temp.right);
				}
			}
		}
		
	  // **************************************   Traversing   *********************************************************//
	
	

	// Pre-Order Traversal(Recursive method).
	
	public void preOrder(treeNode root) {
		if(root==null)return;
		System.out.print(" - > " + root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	
	// Pre-order Traversal (Iterative method).
	
	public void preOrderIT(treeNode root) {
		if(root==null)return;
		Stack<treeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			treeNode temp = stack.pop();
			System.out.print(" -> "+temp.data);
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null ) {
				stack.push(temp.left);
			}
		}
	}
	
	// In-order Traversal (Recursive Method).
	
	public void inOrder(treeNode root) {
		if(root==null)return;

		inOrder(root.left);
		System.out.print(" - > " + root.data);
		inOrder(root.right);
		}
	
	
	// In-order Traversal (Iterative method).
	
	public void inOrderIT(treeNode root) {
		if(root==null)return;
		treeNode temp = root;
		Stack<treeNode> stack = new Stack<>();
		while(!stack.isEmpty() || temp!=null) {
			if(temp!=null) {
				stack.push(temp);
				temp=temp.left;
			}
			else {
				temp = stack.pop();
				System.out.print(temp.data + " - > ");
				temp=temp.right;
			
			}
		}
	}
	
	
	// Post-Order Traversal(Recursive method).
	
	public void postOrder(treeNode root) {
		if(root==null)return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(" - > " + root.data);
		}
	
	// Post-Order Traversal(Iterative method).
	
	public void postOrderIT(treeNode root) {
		treeNode current = root;
		Stack<treeNode> stack = new Stack<>();
		while(current!=null || !stack.isEmpty()) {
			if(current!=null) {
				stack.push(current);
				current=current.left;
			}
			else {
				treeNode temp = stack.peek().right;
				if(temp== null) {
					temp=stack.pop();
					System.out.print(temp.data +" ");
					while(!stack.isEmpty() && temp == stack.peek().right) {
						temp=stack.pop();
						System.out.print(temp.data+" ");
					}
				}
				else {
					current=temp;
				}
			}
		}
	}
	
	// Level order traversal (Using Queue).
	
	public void levelOrder(treeNode root) {
		Queue<treeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			treeNode temp = queue.poll();
			System.out.print(temp.data+ " -> ");
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
		
		}
	}
	
	// Return max value of Binary Tree.
	
	public int findMax(treeNode root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);
		if(left>result) {
			result=left;
		}
		if(right>result) {
			result=right;
		}
		return result;

	}
	
	
	public void createBTree() {
		treeNode first = new treeNode(1);
		treeNode second = new treeNode(2);
		treeNode third = new treeNode(3);
		treeNode fourth = new treeNode(4);
		treeNode fifth = new treeNode(5);
		treeNode sixth = new treeNode(6);
		
		root = first;
		first.left=second;
		first.right=third;
		
		second.left=fourth;
		second.right=fifth;
		
		third.left=sixth;
	}

	public static void main(String[] args) {
		binaryTree bt = new binaryTree();
		bt.createBTree();
		bt.insert(bt.root, 20);
		bt.preOrder(bt.root);
//		bt.preOrder(bt.root);
//		bt.preOrder(bt.root);
//		bt.preOrderIT(bt.root);
		System.out.println();
//		bt.inOrderIT(bt.root);
//		bt.postOrderIT(bt.root);
//		bt.levelOrder(bt.root);
//		System.out.println(bt.findMax(bt.root));
	}

}
