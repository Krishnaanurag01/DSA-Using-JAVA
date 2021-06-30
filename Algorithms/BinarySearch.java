package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,9,12,15};
        // Bsearch(arr,16);
        name(arr,0,arr.length-1,1);
    }

    // Iterative method.
    public static void Bsearch(int[] arr,int key) {
        int low =0 ;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                System.out.print("present");
                return;
            }
            if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.print("Not present !");
    }

    // Recursive Method !

    public static void name(int[] arr , int low , int high, int key) {
        if(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                System.out.print("present");
                return ;
            }
            else if(arr[mid] < key){
                name(arr,mid+1,high,key);
                return;
            }
            else{
                name(arr,low,mid-1,key);
                return;
            }
        }
        System.out.print("not present");
        


    }
}