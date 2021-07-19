package Problems;
import java.util.*;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] number ={-5,-4,-1,0,2,4,6,7};
        int[] result = sortedArray(number);
        for(int i : result){
            System.out.print(i+" ");
        }
        
    }
    public static int[] sortedArray(int[] arr){
        int n = arr.length;
        int[] result=new int[arr.length];
        int i = 0 ; int j = n-1;
        for(int k = n-1 ; k>=0 ; k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i]*arr[i];
                i++;
            }
            else{
                result[k] = arr[j]*arr[j];
                j--;
            }
        }
        return result;
    }
    
}
