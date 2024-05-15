//Write a Java program to create a method that takes an integer 
//as a parameter and throws an exception if the number is odd.

import java.util.Scanner;

public class Exception2 {

    public static int evenNumber(int num){
        if(num%2!=0){
            throw new IllegalArgumentException("Please enter an even number");
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        try{

            int result= evenNumber(num);
            System.out.println("Number entered is even");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
}
