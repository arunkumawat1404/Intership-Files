import java.util.Scanner;

public class Largest{
    
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter num1");
        int num1 = input.nextInt();
        System.out.println("Enter num2");
        int num2 = input.nextInt();
         System.out.println("Enter num3");
        int num3 = input.nextInt ();

   if(num1>num2 && num1 >num3)
{
     System.out.println("Greatest number " + num1);
}
else if(num2> num3)
{
    System.out.println("Greatest number " + num2);
}
else
{
    System.out.println("Greatest number "+ num3);
}

  }
}


    
