package BinaryHeap;

public class MaxHeap {
	private int[] heap;
	private int n;
	public MaxHeap(int size){
		heap=new int[size+1];
		n=0;
	}
	// checks wheather heap is empty or not.
	public boolean isEmpty() {
		return n==0;
	}
	
	// return the size of heap.
	public int getSize() {
		return n;
	}

	//Insertion of Nodes in Max heap.
	public void insert(int data) {
		if(n==heap.length-1){
			resize(2*heap.length);
		}
		n++;
		heap[n]=data;
		heapify(n);		
	}

	// This function is used heapify the nodes.

	private void heapify(int n) {
		while(n>1 && heap[n/2] < heap[n]){
			int temp = heap[n/2];
			heap[n/2]=heap[n];
			heap[n]=temp;
			n=n/2;
		}
		
	}

	// This function is used to resize the size of heap.

	private void resize(int capacity) {
		int[] temp = new int[capacity];
		for(int i =0 ; i<heap.length;i++){
			temp[i]=heap[i];
		}
		heap=temp;
	}

	// This function is used to display the element of Max Heap.

	public void display() {
		for(int i = 1 ; i<heap.length;i++){
			System.out.print(heap[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxHeap mh = new MaxHeap(3);
		mh.insert(10);
		mh.insert(20);
		mh.insert(30);
		mh.insert(40);
		mh.insert(50);
		mh.insert(60);
		System.out.println(mh.getSize());
		mh.display();

	}

}


