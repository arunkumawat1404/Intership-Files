//Java program to print all factors of a number using for loop.
//Java program to print HCF (GCD) of two numbers using for loop.
//Java program to print LCM of two numbers using for loop.
//Write a Java program to find all prime factors of a number using for loop.

import java.util.*;

public class NumberFactors {
    public static void factors(int num){

        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }

    }
    public static void primeFactors(int num){
        while(num%2==0){
            System.out.println(2 + " ");
            num=num/2;
            
        }
        for(int i=3;i<Math.sqrt(num);i+=2){
            while(num%i==0){
                System.out.println(i + " ");
                num = num / i;
                
            }
           
        }
        if(num>2){
            System.out.println(num);
        }

    }
    public static void hcf(int num1 , int num2){

        int hcf=1;
        for(int i=1;i< num1 && i< num2 ;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);



    }
    public static void lcm(int num1 ,int num2){

        int n= (num1>num2)?num1:num2;
        while(true){
            if(n%num1==0 && n%num2==0){
                break;
            }
            n++;
        }
        System.out.println(n);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        System.out.println("Prime Factors");
        primeFactors(num);
        System.out.println("Factors");
        factors(num);
        System.out.println("HCF");
        hcf(5,10);
        System.out.println("LCM");
        lcm(5,8);
        
    }

    
}
