package Arrays;

public class Kadanes_Max_SubArray {
    public static void main(String[] args) {
        int[] arr = {4,3,-2,6,-12,7,-1,6};
        System.out.print(Max_SubArray(arr));
        
    }
    public static int Max_SubArray(int[] arr) {
        int currentMax=arr[0];
        int maxSoFar=arr[0];
        for(int i = 1; i<arr.length ; i++){
            currentMax += arr[i];
            if(currentMax < arr[i]){
                currentMax = arr[i];
            }
            if(maxSoFar < currentMax){
                maxSoFar = currentMax;
            }}
            return maxSoFar;       
    }

    
}
