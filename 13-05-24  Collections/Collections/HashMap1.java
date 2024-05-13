import java.util.*;

public class HashMap1 {

    public static void main(String[] args) {
        Map <Character , Integer> map = new HashMap<>();
        String str= "Argentina";
        for(int i=0;i<str.length();i++){
            int n=1;
            if(map.containsKey(str.charAt(i))){
                n=map.get(str.charAt(i));
                map.put(str.charAt(i), n+1);

            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> m :map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(map);
    }
    
}
