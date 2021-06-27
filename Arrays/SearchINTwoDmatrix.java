// Search element in sorted 2D matrix where data is sorted in row and column wise.
package Arrays;

public class SearchINTwoDmatrix{
    public static void main(String[] args) {
        int[][] arr = {
            {2,3,4},
            {7,8,9},
            {10,11,12}
        };
        search(arr,3,8);
        
    }

    public static void search(int[][] arr ,int x,int value) {

        int i=0;
        int j=x-1;
        while(i<x && j>=0){
            if(arr[i][j]==value){
                System.out.println("Value is Present at "+i+ "th row "+j+"th column");
                return;
            }
            if(arr[i][j]>value){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not present!");
        
    }

}