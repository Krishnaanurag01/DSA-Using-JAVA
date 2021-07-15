package Problems;

public class Finding_MissingNum {
    public static void main(String[] args) {
        int[] numbers={1,2,6,3,4};
        System.out.print(getMissingNum(numbers));
    }
    public static int getMissingNum(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for(int i : arr){
            sum -= i;
        }
        return sum;
    }
}
