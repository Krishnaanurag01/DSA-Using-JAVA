package Hashing;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        int target = 9;
        int[] numbers= {2,1,3,4,7};
        int[] result = sum.TwoSumProb(numbers,target);
        System.out.print(result[0]+"th + "+result[1]+"th position = "+ target);

        
    }
    public  int[] TwoSumProb(int[] number , int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < number.length ; i++){
            if(!map.containsKey(target - number[i])){
                map.put(number[i],i);
            }
            else{
                result[1] = i;
                result[0] = map.get(target - number[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("Not found.");
    }
}
