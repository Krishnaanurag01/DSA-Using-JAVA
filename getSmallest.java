public class getSmallest {
    public static void main(String[] args) {
        
        int[] arr ={2,8,1,3,7,5};
        try {
            System.out.print(getSmallestElement(arr));
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    public static int getSmallestElement(int[] arr) throws Exception {
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
