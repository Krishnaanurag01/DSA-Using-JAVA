package Recurssion;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(fibo(sc.nextInt()));
    }

    public static int fibo(int num ){
        if(num==0)return 0;
        if(num==1) return 1;
        return fibo(num-1)+fibo(num-2);
    }
    
}
