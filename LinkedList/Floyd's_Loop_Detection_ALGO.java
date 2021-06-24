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