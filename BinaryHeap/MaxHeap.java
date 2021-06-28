package BinaryHeap;

public class MaxHeap {
	private int[] heap;
	private int n;
	public MaxHeap(int size){
		heap=new int[size+1];
		n=0;
	}
	
	public boolean isEmpty() {
		return n==0;
	}
	
	public int getSize() {
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


