package Arrays;

public class reverseArray {
    public static int[] reverse(int[] arr, int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
    public static void main(String[] args) {
        int[] n ={1,2,3,9,4,-5};
        reverse(n,0,n.length-1);
        for(int i : n){
            System.out.print(i + " " );
        }

    }
}
