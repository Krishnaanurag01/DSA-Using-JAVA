package Algorithms;

public class TwoSumUsing_WhileLoop {
    public static void main(String[] args){
        int[] numbers = {2,3,1,7,6,9};
        int target = 9;
        int[] result= twoSum(numbers,target);
        System.out.print(result[0] +" + "+result[1] +" = "+ target);

    }
    public static int[] twoSum(int[] arr , int target){
        int left = 0 ; 
        int right = arr.length-1;
        int[] result = new int[2];
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            }
            if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        throw new IllegalArgumentException("Not found any.");
    }
}
