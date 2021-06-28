package BinarySearchTree;

public class Bst {
	
	// Node class.
	
	private class node{
		private int data;
		private node left;
		private node right;
		
		public node(int data) {
			this.data=data;
		}
	}
	
	private node root;
	private int length;
	
	
	// checks wheather tree is empty or not.
	public boolean isEmpty() {
		return length==0;
	}
	
	
	public int getLength() {
		return length;
	}
	
	
	
	
	// Insertion Operation in BST.
	
	
	public void insert(int value) {
		root = insert(root,value);
	}
	
	public node insert(node root, int value) {
		if(root==null) {
			root= new node(value);
			return root;
		}
		if(value < root.data) {
			root.left=insert(root.left,value);
		}
		if(value> root.data) {
			root.right=insert(root.right, value);
		}
		return root;
	}
	
	
	
	
	// In-order Traversal .
	
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	
	public void inOrder(node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	
	
	
	//Searching A value in BST.
	
	public void search(int value) {
//		node temp =search(root , value);
		if(null != search(root , value)) {
			System.out.println("Value is present!");
		}
		else {
			System.out.println("Value is not present");
		}
	}
	
	public node search(node root , int value) {
		if(root==null || root.data == value) {
			return root;
		}
		if(value<root.data) {
			return search(root.left,value);
		}
		else {
			return search(root.right,value);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bst bst = new Bst();
		
		bst.insert(6);
		bst.insert(5);
		bst.insert(4);
		bst.insert(8);
		bst.inOrder();
		bst.search(8);
		bst.search(55);



		

	}

}

    