package Arrays;

public class movingZerosATend {
    public static void moveZeros(int[] arr) {
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0  && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0)j++;
		}
	}
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,8,0,-4,4};
        moveZeros(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    
}
