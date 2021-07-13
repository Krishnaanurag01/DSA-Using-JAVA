package DynamicProgramming;
import java.util.*;

public class Fibonacci_TopDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to get fibonacci of that number : ");
        int n = sc.nextInt();
        System.out.print(TopDown(new int[n+1],n));
        
    }
    public static int TopDown(int[] table , int number){
        if(table[number]==0){
            if(number<2){
                table[number]=number;
            }else{
                table[number] = TopDown(table,number-1) + TopDown(table,number-2);
            }
        }
        return table[number];
    }

}
