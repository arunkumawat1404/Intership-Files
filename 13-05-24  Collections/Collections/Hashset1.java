import java.util.*;
public class Hashset1 {

    public static void main(String[] args) {
        Set <Character> set = new HashSet<>();
        String str= "Argentina";
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.println(set);
        Iterator<Character> i=set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    
}
