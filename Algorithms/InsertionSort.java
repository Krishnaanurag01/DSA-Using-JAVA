package Algorithms;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr={2,3,9,0,45,12,39};
        insertionSORT(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void insertionSORT(int[] arr){
        for(int i = 1 ; i< arr.length - 1 ; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
    
}
