import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();      

        map.put(1, "Red");
        map.put(6, "Green");
        map.put(3, "Black");
        map.put(10, "White");
        map.put(5, "Blue");
    
   for (Map.Entry<Integer,String> entry : map.entrySet())
   {
    System.out.println(entry.getKey() + " " + entry.getValue());
   }
    }

    
}
