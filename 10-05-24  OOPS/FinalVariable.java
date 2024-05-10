/*
 * If we are declaring a varible as final then its value can't be changed 
 */

public class FinalVariable {

    public static void main(String[] args) {

        int num=5;
        System.out.println(num);
        num=10;
        System.out.println(num);

        final int num2=15;
        System.out.println(num2);
        //num2=20;   we  cannot change the value



       

        
    }
    
}
