import java.util.*;
public class ArmstrongPalindrome {

    public static void palindrome(int num){
         int revNumber=0;
         int number=num;
         while(num!=0){
            int lastDigit = num%10;
            revNumber =revNumber*10+lastDigit;
            num=num/10;
        }
        if(revNumber==number){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
    public static void  armStrong(int num){
        double revNumber=0;
        int number=num;
        while(num!=0){
            double lastDigit = num%10;
            revNumber =revNumber + Math.pow(lastDigit , 3l);
            num=num/10;
        }
        if(number==revNumber){
            System.out.println("Number is Armstrong number");
        }else{
            System.out.println("Number is not an Armstrong number");
        }
        

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        palindrome(num);
        armStrong(num);
        
    }
    
}
