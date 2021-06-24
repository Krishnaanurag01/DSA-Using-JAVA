import java.util.NoSuchElementException;

public class doublyLL {
	private node head;
	private node tail;
	private int length;

	private class node{
		private int data;
		private node next;
		private node prev;
		public node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}}
	
	
	// constructor.
	
	public doublyLL() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	// check if LL is empty.
	
	public boolean isEmpty() {
		return length==0;
	}
	
	// return size of Doubly LL.
	public int length() {
		return length;
	}

	//                    Display elements of Linked List .
	
	// for forward direction.
	public void displayForward() {
		if(head==null) {
			System.out.println("Linked list is empty");
			return;
		}
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data +" -> ");
			temp=temp.next;
		}
		System.out.println();
		}
	
	// for Backward direction.
		public void displayBackward() {
			if(tail==null) {
				System.out.println("Linked list is empty");
				return;
			}
			node temp=tail;
			while(temp!=null) {
				System.out.print(temp.data +" <- ");
				temp=temp.prev;
			}
			System.out.println();
			}

	//                                  insertion of node at beginning.
		
		public void insertStart(int data) {
			node newNode= new node(data);
			if(isEmpty()) {
				tail=newNode;
			}
			else {
				head.prev=newNode;
			}
			newNode.next=head;
			head=newNode;
			length++;
		}
		
	//                                   insertion of node at the ending.
		
		
		public void insertEnd(int data) {
			node newNode= new node(data);
			if(isEmpty()) {
				head=newNode;
			}
			else {
				tail.next=newNode;
				newNode.prev=tail;
			}
			tail=newNode;
			length++;
}
		
		
		// deletion from first.
		
		public int deleteFirst() {
			if(isEmpty()) {
				throw new NoSuchElementException();
			}
			node temp=head;
			if(head==tail) {
				tail=null;
			}
			else {
				head.next.prev=null;
			}
			head=head.next;
			temp.next=null;
			length--;
			return temp.data;
			
		}
		
		// deletion from last.
		
		public int deleteLast() {
			if(isEmpty()) {
				throw new NoSuchElementException();
			}
			node temp=tail;
			if(head==tail) {
				head=null;
			}
			else {
				tail.prev.next=null;
			}
			tail=tail.prev;
			temp.prev=null;
			length--;
			return temp.data;		
				}		
}
