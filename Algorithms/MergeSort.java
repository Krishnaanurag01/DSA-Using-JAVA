package Algorithms;

public class MergeSort {

    public static void main(String[] args) {
        int[] a= {2,5,0,4,-2,7};
        MergeSort ms = new MergeSort();
        ms.sort(a,new int[a.length],0,a.length-1);
        ms.printAll(a);
    }

    // Merge Sort Function!

    public void sort(int[] arr , int[] temp , int low , int high){
        if(low<high){
            int mid = low + (high - low)/2;
            sort(arr,temp , low , mid);
            sort(arr,temp,mid+1,high);
            merge(arr,temp,low,mid,high);
        }
    }

    public void merge(int[] arr , int[] temp , int low , int mid , int high){
        for(int i = low ; i<=high ; i++){
            temp[i] = arr[i];
        }
        int i = low;
        int j = mid+1;
        int k = low;

        while(i<=mid && j<=high){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k]=temp[i];
            i++;
            k++;
        }
    }




    public void printAll(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
