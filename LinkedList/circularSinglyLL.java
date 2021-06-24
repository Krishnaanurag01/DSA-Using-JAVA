import java.util.NoSuchElementException;

public class circularSinglyLL {
	private class node{
		private int data;
		private node next;
		
		public node(int data) {
			this.data=data;
			this.next=null;
		}}
	
	private node last;
	private int length;
	
	public circularSinglyLL() {
		this.last=null;
		this.length=0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int getLength() {
		return length;
	}
	
//	public void createCSLL() {
//		node first = new node(1);
//		node second = new node(2);
//		node third = new node(3);
//		node fourth = new node(4);
//		node fifth = new node(5);
//		
//		first.next=second;
//		second.next=third;
//		third.next=fourth;
//		fourth.next=fifth;
//		fifth.next=first;
//		
//		last=fifth;		
//	}
	
	// Traversing Elements of Linked List.
	
	public void display() {
		if(last==null) {
			System.out.println("Linked List is empty");
		return;
	}
		node temp=last.next;
		while(temp!=last) {
			System.out.print(temp.data+" - > ");
			temp=temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
	}
	
	
	// insertion at beginning.
	
	public void insertFirst(int data) {
		node temp=new node(data);
		if(last==null) {
			last=temp;
		}
		else {
			temp.next=last.next;
		}
		last.next=temp;
		length++;
	}
	
	// insertion at last.
	
	public void insertEnd(int data) {
		node temp=new node(data);
		if(last==null)last=temp;
		else {
			temp.next=last.next;
			last.next=temp;
			last=temp;
		}
		length++;
	}
	
	// deletion from first.
	
	public int deleteFirst() {
		
		if(isEmpty()) {
			throw new NoSuchElementException("Linked List is already empty.");	
		}
		node temp=last.next;
	    if(last.next==last) {
			last=null;
		}
		else {
			last.next=temp.next;
		}
		temp.next=null;
		length--;
		return temp.data;
	}

}
