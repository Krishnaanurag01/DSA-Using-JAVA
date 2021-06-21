public class mergingTwoSortedArrays {
    public static void main(String[] args) {
        int[] a={2,5,6,9};
        int[] b={1,3,5,7,8};
        int[] result=mergeArrays(a,b,a.length,b.length);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" - > ");
        }

    }

    public static int[] mergeArrays(int[] a,int[] b, int  x , int y) {
        int[] result=new int[x+y];
        int i=0;
        int j=0;
        int k=0;

        while(i < x && j < y){
            if(a[i] < b[j]){
                result[k]=a[i];
                i++;
            }
            else {
                result[k]=b[j];
                j++;
            }
            k++;
        }

        while(i < x ){
            result[k]=a[i];
                i++;
                k++;
        }
        while(j < y){
            result[k]=b[j];
                j++;
                k++;
        }
        return result;
        
    }
    
}
