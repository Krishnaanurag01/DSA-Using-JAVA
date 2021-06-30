package Algorithms;

public class SelectionSort {
    public static void main(String args[]){
        int[] arr = {3,1,5,10,15,11};
        selectionSORT(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    public static void selectionSORT(int[] arr){
        for(int i=0;i < arr.length-1 ; i++){
            int min = i;
            for(int j = i+1 ; j < arr.length ;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
}
