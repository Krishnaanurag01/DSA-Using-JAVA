package Problems;

public class Subsequence_Problem {
    public static void main(String args[]){
        System.out.print(subSequence("ABCDE","ACE"));

    }
    public static boolean subSequence(String word , String sequence){
        int i=0;
        int j=0;
        while(i< word.length() && j< sequence.length()){
            if(word.charAt(i) == sequence.charAt(j)){
                j++;
            }
            i++;
        }
        return j == sequence.length();
    }
    
}
