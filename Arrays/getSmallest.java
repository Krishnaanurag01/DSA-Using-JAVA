package Arrays;

public class getSmallest {
    public static void main(String[] args) {
        int[] n ={1,2,3,9,4,-5};
        try {
            System.out.println(getSmallestValue(n));
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }


    public static int getSmallestValue(int[] arr) throws Exception {
		if(arr==null || arr.length==0) {
			throw new Exception("Invalid Input");
		}
		int n=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<n) {
				n=arr[i];
			}
		}
		return n;
	}
}
