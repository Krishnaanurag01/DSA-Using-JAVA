public class reveringArray {
    public static void main(String[] args) {
        int[] arr ={2,8,1,3,7,5};
        reverse(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" - > ");
        }
        
    }

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
    
}
