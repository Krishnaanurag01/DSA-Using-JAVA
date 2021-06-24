package Queue;

public class queue {	
	private class node{
		private int data;
		private node next;
		
		public node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	private node front;
	private node rear;
	private int length;
	
	
	// checks whether queue is empty or not.
	
	public boolean isEmpty() {
		return length==0;
	}
	
	
	// return length of queue.
	
	public int len() {
		return length;
	}
	
	// for insertion !
	
	public void enQueue(int data) {
		node temp = new node(data);
		if(isEmpty()) {
			front = rear = temp;
		}else {
			rear.next=temp;
			rear=temp;
		}
		length++;
	}
	
	// displaying elements of queue.
	
	public void traverse() {
		if(isEmpty()) {
			System.out.println("Queue is empty !");
			return;		
		}
		else {
			node temp = front;
			while(temp!=null) {
				System.out.print("- > " + temp.data);
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
	// for deletion !
	
	public int deQueue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue Underflow");
		}
		int deletedItem  = front.data;
		front=front.next;
		if(front==null) {
			rear=null;
		}
		length--;
		return deletedItem;
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue Que = new queue();
		Que.enQueue(20);
		Que.enQueue(40);
		Que.traverse();
		try {
			Que.deQueue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Que.deQueue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Que.deQueue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Que.traverse();

	}

}
