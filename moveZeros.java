public class moveZeros {
    public static void main(String[] args) {
        // moving zeros at the end.
        int[] arr2 = {1,0,2,3,4,0,5,6,2,-1};
		moveZerosAtEnd(arr2);
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] +" - > ");
            }
    }
    public static void moveZerosAtEnd(int[] arr) {
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0  && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0)j++;
		}}

}
