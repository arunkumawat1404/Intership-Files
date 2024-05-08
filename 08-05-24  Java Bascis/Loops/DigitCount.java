//Java program to count the digits of a given number .
//Java program to print the sum of digits of a given number .
//Java program to reverse a digit  .
import java.util.*;
public class DigitCount {

    public static int sumDigit(int num)
    {

        int sum=0;
        while(num!=0)
        {
            sum = sum + num%10;
            num =num/10;
    
        }
        return sum;

    }
    public static int reverseDigit(int num){
        int revNumber =0;
        while(num!=0){
            int lastDigit = num%10;
            revNumber =revNumber*10+lastDigit;
            num=num/10;

        }
        return revNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
         int count=0;
         int sum =sumDigit(num);
         int reverse =reverseDigit(num);
         while(num!=0){
            num=num/10;
           
            count++;
         }
         System.out.println("Count digit");
        System.out.println(count);
        System.out.println("Sum of the digit");
        System.out.println(sum);
        System.out.println("Reversed number");
        System.out.println(reverse);


    }
    
}
