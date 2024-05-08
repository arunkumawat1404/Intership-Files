
//Java program to print all even numbers between 1 to 100 using for loop.
//Java program to print sum of all odd numbers between 1 to n using for loop.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersPrint {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        System.out.println("Enter number");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Print Even number beteen 1 to n");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum +=i;
            }
        }
        System.out.println("Sum of odd number from between 1 to n");
        System.out.println(sum);


            
        
    }
    
}
