package Algorithms;

public class MergingSortedArrays {
    
    public static void main(String[] args) {
    int[] arr1 = {2,4,7,8,9};
    int[] arr2= {0,1,3,6};    
    int[] answer= mergeArrays(arr1,arr2,arr1.length,arr2.length);
    for(int i : answer){
        System.out.print(i+"");
    }
    }

    public static int[] mergeArrays(int[] a , int[] b , int x, int y){
        int[] result = new int[x+y];
        int i =0;
        int j= 0;
        int k=0;
        while(i < x && j < y){
            if(a[i]<b[j]){
                result[k]=a[i];
                i++;
            }
            else{
                result[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<x){
            result[k]=a[i];
            i++;
            k++;
        }
        while(j<y){
            result[k]=b[j];
            j++;
            k++;
        }
        
        return result;
    }
    
}
