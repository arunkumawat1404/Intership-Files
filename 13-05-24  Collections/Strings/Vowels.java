//Java program to delete vowels in a given string.
//Java program to count Occurrence Of Vowels & Consonants in a String.

public class Vowels {

    public static String deleteVowel(String str){
        String str2="";
        for(int i=0;i<str.length();i++){
            if(!checkVowel(str.charAt(i))){
                str2 += str.charAt(i);

            }
        }
        return str2;


    }

    public static boolean checkVowel(char str){
        String str2 ="aeiouAEIOU";
        

        if(str2.indexOf(str)!=-1){
                
                return true;

            }
        return false;
        
    }
    public static String deleteVowel2(String str){

        String newstr= str.replaceAll("[aeiouAEIOU]" ,"");
        return newstr;

    }
    public static void main(String[] args) {

        String str= "arun";
        for(int i=0;i<str.length();i++){
            boolean check= checkVowel(str.charAt(i));
            if (check) {
                System.out.println("vowel");
                
               }
            else{
                System.out.println("Consonant");
            }


        }
      String str3 = deleteVowel(str) ;
      System.out.println(str3);
      System.out.println("replace method");
      String str4 = deleteVowel2(str) ;
      System.out.println(str4);

       
    }
    
}
