import java.util.*;

public class Treeset {
    public static void main(String[] args) {
        Set<Character> set = new TreeSet<>();
            
    String str= "Argentina";

    for(int i=0;i<str.length();i++){
        set.add(str.charAt(i));
    }
    System.out.println(set);
    }
    
}
