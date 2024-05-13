import java.util.*;

public class Reverse{

    public static String reverseString(String str){

        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        return reverse;

    }
    public static String StringBuilderMethod(String str){
        StringBuilder str1= new StringBuilder(str);
        str1.reverse();
    return str1.toString();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter string");
        String str = sc.next();
        String res=reverseString(str);
        System.out.println(" Method1");
        System.out.println(res);
        System.out.println("Method 2");
        System.out.println(StringBuilderMethod(str));
        
    }
}
