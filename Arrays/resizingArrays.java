package Arrays;

public class resizingArrays {
    public static void main(String[] args) {
     int[] n = new int[10];
     n=resize(n,n.length*2);
     System.out.print(n.length);   
    }
    public static int[] resize(int[] arr , int capacity) {
		int[] temp = new int[capacity];
		for (int i = 0; i < arr.length; i++) {
			temp[i]=arr[i];
		}
		return temp;
	}
    
}
