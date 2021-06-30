package Algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {5,2,1,45,9,0};
        BubbleSORT(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
        
    }
    public static void BubbleSORT(int[] arr) {
        for(int i=0 ; i<arr.length-1 ; i++){
            boolean isSwapped =false;
            for(int j=0 ; j<arr.length-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                break;
            }
        }
    }
    


}
