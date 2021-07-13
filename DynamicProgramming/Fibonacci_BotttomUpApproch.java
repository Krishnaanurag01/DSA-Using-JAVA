package DynamicProgramming;
import java.util.*;

public class Fibonacci_BotttomUpApproch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to get fibonacci of that number : ");
        int n = sc.nextInt();
        System.out.print(fib(n));
        
    }
    
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        int[] Table = new int[n+1];
        Table[0]=0;
        Table[1]=1;
        for(int i = 2; i<=n ; i++){
            Table[i] = Table[i-1]+Table[i-2];
        }
        return Table[n];
    }
}
