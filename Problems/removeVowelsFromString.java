package Problems;
import java.util.*;

public class removeVowelsFromString {
    public static void main(String[] args) {
        System.out.print(withoutVowels("my name is khan"));
        
    }
    public static String withoutVowels(String str){
        Set<Character> vowels = Set.of('a','e','i','o','u');
        StringBuilder sb = new StringBuilder();
        char[] charOfWords = str.toCharArray();
        for(char ch : charOfWords){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
}
