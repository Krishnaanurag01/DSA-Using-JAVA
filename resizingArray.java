public class resizingArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr = resize(arr,20);
		System.out.println(arr.length);
        
    }
    public static int[] resize(int[] arr , int capacity) {
		int[] temp = new int[capacity];
		for (int i = 0; i < arr.length; i++) {
			temp[i]=arr[i];
		}
		return temp;
	
}
}
