import java.util.*;
public class ArrayList1  {
    public static void main(String[] args) {

         List <Integer> arr= new ArrayList<>();
         arr.add(6);
         arr.add(16);
         arr.add(96);
         arr.add(46);
         arr.add(2);
         arr.add(1,10);
         arr.set(3,55);
         arr.remove(5);
         arr.remove(2);
         arr.contains(96);
         Collections.sort(arr);
         Iterator it =arr.iterator();
         while(it.hasNext()){
            System.out.println(it.next());
         }
         Integer[] arr2= new Integer[arr.size()];
         arr2=arr.toArray(arr2);
         for(int i:arr2){
             System.out.println(i);
         }
    }
}