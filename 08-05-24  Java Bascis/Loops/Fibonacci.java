//Java program to print Fibonacci series of a given number

import java.util.*;

public class Fibonacci {
public static void fibonacciseries(int n){
    int num1=0;
    int num2=1;

    for(int i=0;i<n;i++){
        System.out.print(num1 + " ");

        int num3= num1+ num2;
        num1=num2;
        num2=num3;

    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        fibonacciseries(num);

    }
    
}
