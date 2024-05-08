//Java Program to check whether a given number is divisible by 3 , 5 ,7 or not  using if-else.
import java.util.Scanner;
public class DivisiblityCheck 
{
    public static void main(String args[])
    {
         Scanner input= new Scanner(System.in);
         System.out.println("Enter number");
         int n=input.nextInt();
        if(n%3==0 && n%5==0 && n%7==0)
        {
            System.out.println("Divisible by 3 , 5 ,7");
        }
        else if(n%3==0 && n%5==0 )
        {
            System.out.println("Divisible by 3 , 5");
        }
        else if(n%3==0 && n%7==0 )
        {
            System.out.println("Divisible by 3  ,7");  
        }
        else if(n%5==0 && n%7==0 )
        {
            System.out.println("Divisible by 5 ,7");
        }
         else if(n%3==0)
         {
            System.out.println("Divisible by 3");
         }
         else if(n%5==0)
         {
           System.out.println("Divisible by 5");
         }
         else if(n%7==0)
         {
            System.out.println("Divisible by 7");
         }
         else
         {
            System.out.println("Number is not didvivble  3 , 5 and 7");
         }

    }
    
}
