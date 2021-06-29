package Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,9,6,032,11,53};
        System.out.print(LSearch(arr,arr.length,53));

    }
    public static int LSearch(int[] arr , int length , int num) {
        for(int i =0 ; i<length ; i++){
            if(arr[i] == num){
                return i+1;
            }
        }
        return -1;
    }
}
