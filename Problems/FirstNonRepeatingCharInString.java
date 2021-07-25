package Problems;
import java.util.*;

public class FirstNonRepeatingCharInString {
    public static void main(String args[]){
        String word = "racecar";
        System.out.print(firstNonRepeatingCharIs(word));

    }

    public static int firstNonRepeatingCharIs(String str){
        Map<Character , Integer> map = new HashMap<>();
        char[] charOfWords = str.toCharArray();
        for(char c : charOfWords){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<charOfWords.length;i++){
            char ch = charOfWords[i];
            if(map.get(ch)==1){
                return i+1 ;
            }
        }
        return -1;
    }
}
