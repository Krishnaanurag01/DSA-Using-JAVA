package Strings;

public class isPalindrome {
    
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            String Madam = "navivan" ;
            System.out.println(isPalind(Madam));
            
    //		 2nd method 
            
    //		System.out.println(Madam.equals(new StringBuilder("madamt").reverse().toString()));
    
        }
        public static boolean isPalind(String s) {
            char[] str = s.toCharArray();
            int start=0;
            int end=s.length()-1;
            while(start < end) {
                if(str[start] != str[end])return false;
                start++;
                end--;
            }
            return true;
        }
    
    }
