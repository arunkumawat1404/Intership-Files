
//Java Program to check whether a given input  is a Digit or Alphabets or Special Character using if-else.
import java.util.Scanner;

public class CharacterCheck
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char c =sc.next().charAt(0);
        if(Character.isDigit(c)) {
            System.out.println("Digit");
            
        }
        else if(Character.isLetter(c)){
            System.out.println("Alphabet");

        }
        else{
            System.out.println("Special character");
        }




        
    }
}