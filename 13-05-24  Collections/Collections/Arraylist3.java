import java.util.*;

import java.util.ArrayList;

public class Arraylist3 {

    public static void main(String[] args) {
          ArrayList<String> arr= new ArrayList<String>();
          arr.add("Red");
          arr.add("Green");
          arr.add("Black");
          arr.add("White");
          arr.add("Pink");
          System.out.println("Original array list: " + arr);
          ArrayList<String> newarr = (ArrayList<String>)arr.clone();
          System.out.println("Cloned array list: " + newarr);       
}
    
}
