import java.util.Scanner;
public class Exception1{

    public static double divisor(int a, int b){
        if(b==0){
            throw new ArithmeticException("A number cannot be divivded by zero");
        }
        return a/b;
            
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        try{
            double result= divisor(a,b);
            System.out.println("Result " + result);
        }catch (ArithmeticException e){
            System.out.println("Using get message");
            System.out.println(e.getMessage());
            System.out.println("Using stack trace method");
            e.printStackTrace();
            System.out.println("Using to string method");
            System.out.println(e.toString());
        }
        
    }
}