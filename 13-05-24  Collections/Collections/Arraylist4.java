import java.util.ArrayList;
import java.util.Collections;

public class Arraylist4 {

    public static void main(String[] args) {
   ArrayList<String> arr= new ArrayList<String>();
          arr.add("Red");
          arr.add("Green");
          arr.add("Black");
          arr.add("White");
          arr.add("Pink");

          System.out.println("Array list before Swap:");
          for(String a: arr){
          System.out.println(a);
        }
         Collections.swap(arr, 0, 2);
          System.out.println("Array list after swap:");
          for(String b: arr){
          System.out.println(b);
         }
     }
    
}
