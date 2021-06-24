public class SinglyLL {
    // Node class
	
public static class Node{
private int data;
private Node next;
public Node(int data) {
this.data=data;
this.next=null;
}
}
	private Node head ;
	
                  //	Insertion at the end !!!
	
	public void insert(int data) {
		Node newNODE=new Node(data);
		if(head==null) {
			head=newNODE;
			return;
		}
		Node n=head;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=newNODE;
	}
	
                      //	Insertion at beginning
	
	
	
	public void insertFirst(int data) {
		Node newNODE=new Node(data);
		if(head==null) {
			head=newNODE;
			return;
		}
//		Node n=head; dont't use temp node
		newNODE.next=head;
		head=newNODE;
	}
	
                       //	Insertion at specific location
	
	
	
	public void insertSpec(int pos, int data) {
		Node newNODE=new Node(data);
		int num=length()+1;
		if(pos==1) {
			newNODE.next=head;
			head=newNODE;
		}
		else if(pos>=num){
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNODE;			
		}
			else {
			Node previous=head;
			int count=1;
			while(count<pos-1) {
				previous=previous.next;
				count++;
			}
			newNODE.next=previous.next;
			previous.next=newNODE;
		}
	}
	
	
                             //	Deletion at first!!

	public void deleteFIRST() {
		if(head==null) {
			System.out.println("Linked List is empty");
			return;
		}
		else {
			Node temp=head.next;
			head=temp;
		}}
	

                              //	Deletion at end!!
	
	
	public void deleteEND() {
		if(head==null) {
       System.out.println("Linked List is empty");
       return;
       }
      else if(head.next==null) {
    	  head=null;
      }
      else {
    	  Node temp=head;
    	  while(temp.next.next!=null) {
    		  temp=temp.next;
    	  }
    	  temp.next=null;
      }
	}
	
	                            // Deletion at specific location
	
	public void deleteSpec(int pos) {
		int num=length()+1;
		if(pos==1) {
			head=head.next;
		}
		else if(pos>num){
			System.out.println("Position not available");	
		}
		else {
			Node previous=head;
			int count=1;
			while(count<pos-1) {
				previous=previous.next;
				count++;
			}
			Node temp=previous.next.next;
			previous.next=temp;
		}
	}
	
	
//	Checking if specific data is present in LL.
	
	public Boolean search(int d) {
		if(head==null) {
			System.out.println("Linked List is none.");
		}
		Node temp=head;
		while(temp.next!=null) {
			if(temp.data==d)return true;
			temp=temp.next;
		}
		if(temp.data==d)return true;
		 return false;
	}
	
                      //	Traversing/Displaying Data !
	
	public void display() {
		if(head==null) {
			System.out.println("Linked List is empty !");
			return;
		}
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+" -> ");
			n=n.next;
		}
		System.out.println();
	}
	
                           //	Length of linked LIST !
	
	public int length() {
		if(head==null) {
			System.out.println("Linked List is empty !");
			return 0 ;
		}
		int count = 0;
		Node n=head;
		while(n!=null) {
			count++;
			n=n.next;
		}
//		System.out.println("Size is:"+count);
		return count;
	}
	
//                                  Reverse of Linked List.
	public void reverse() {
		if(head==null)return;
		Node temp=head;
		Node neww=null;
		Node h=null;
		while(temp!=null) {
			h=temp.next;
			temp.next=neww;
			neww=temp;
			temp=h;
		}
		displayREVERSE(neww);
	}
	
	
	public void displayREVERSE(Node head) {
		if(head==null)return;
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
	}
	
	// remove duplicate from sorted linked list
	
	public void removeDUPLICATESORTED() {
		if(head==null)System.out.println("Linked list is empty !");
		else {
			Node temp= head;
			while(temp.next!=null) {
				if(temp.data==temp.next.data) {
					temp.next=temp.next.next;
				}
				else temp=temp.next;
					}
		}
	}
	//                       insertion in sorted list.
	
	public void insertSORTED(int data) {
		Node n=new Node(data);
		if(head==null)System.out.println("Linked list is empty !");
		else if(head.data>data) {
			n.next=head;
			head=n;
		}
		else {
			Node temp= head;
			while(temp.next!=null) {
				if(temp.next.data>data) {
					break;
				}
				temp=temp.next;	}
		if(temp.next==null) {
			temp.next=n;}
			else {
				Node k=temp.next;
				temp.next=n;
				n.next=k;
				
			}
		}
		}
	
	//  Removing the given element.
	
	public void removeKey(int data) {
		if(head==null)System.out.println("Linked list is empty !");
		else if(head.data==data) {
			Node temp=head;
			head=temp.next;
			
		}
		else {
			Node temp=head;
			while(temp!=null) {
				if(temp.next.data==data) {
					Node k=temp;
					temp.next=k.next.next;
					break;
				}
				temp=temp.next;
			}
		}
	}
	
	
	/// checking if there's any loop in linked list.
	
	// ********* This algorithm is known as Floyd's Cycle detection algorithm and (hare and tortoise algorithm) ,also this algorithm is import from interview point of view.
	
	
	// checking if there's any loop in linked list.
	
	public boolean ContainsLoop() {
		Node Hare=head;
		Node Tortoise=head;
		while(Hare!=null &&  Hare.next!=null) {
			Hare=Hare.next.next;
			Tortoise=Tortoise.next;
			if(Tortoise==Hare) {
				return true;
			}
		}
		return false;
		}
	
	
	// Creating Loop in linked list.
	 
	public void creatingLoop() {
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=third;	
	}
	
	// getting starting node of loop.
	
	public int getSTARTINGnode() {
		Node Hare=head;
		Node Tortoise=head;
		while(Hare!=null &&  Hare.next!=null) {
			Hare=Hare.next.next;
			Tortoise=Tortoise.next;
			if(Tortoise==Hare) {
				return startingOFloop(Tortoise).data;
			}}
		return 0;
		}
	
	
	public Node startingOFloop(Node n) {
		Node temp=head;
		while(temp!=n) {
			temp=temp.next;
			n=n.next;
		}
		return temp;
		
	}
	
	
	// Removing loop from Linked List.
	
	public void removeLoop() {
		Node Hare=head;
		Node Tortoise=head;
		while(Hare!=null &&  Hare.next!=null) {
			Hare=Hare.next.next;
			Tortoise=Tortoise.next;
			if(Tortoise==Hare) {
				makingNull(Tortoise);				
				return ;
			}}
		return;
		}
	
	public void makingNull(Node n) {
		Node temp=head;
		while(n.next!=temp.next) {
			temp=temp.next;
			n=n.next;
		}
		temp.next=null;
	}
	
}