//Write a program in Java to count occurrence of a given character in a String.
//Java Program to count the occurrence of duplicate characters in String.
//Java Program to count the duplicate characters in String.

import java.util.Scanner;

public class Occurances {

    public static int CharacterOccurances(String str ,char ch){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }

        }
        return count;
    }
    public static void duplicatecount(String str){
        int count;
        char[] strarr = str.toCharArray();
        for(int i=0;i<strarr.length;i++){
             count=1;
            for(int j=i+1;j<strarr.length;j++){
                if(strarr[i]==strarr[j]){
                    count++;
                    //strarr[j] ='0';
                }
            
            }
        System.out.println(strarr[i] + "  " + count);
            
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(str);

         int count =  CharacterOccurances("olive oil", 'o');
        System.out.println(count);
        System.out.println("duplicate count");
        duplicatecount(str);
        
    }
    
}
