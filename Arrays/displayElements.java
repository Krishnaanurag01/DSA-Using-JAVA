package Arrays;

public class displayElements {
    public static void display(int[] arr) {
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,-4,4};
        display(arr);
    }
    
}
