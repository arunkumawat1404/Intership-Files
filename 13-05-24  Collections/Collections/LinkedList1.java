import java.util.*;

public class LinkedList1 {

    public static void main(String[] args) {
    LinkedList<String> list=new LinkedList<String>();
    list.add("Arun");
    list.add("Kiaan");
    list.add("Dikshika");
    list.add("Vaibhav");
    list.add("Shivam");
    list.add("Reena");
    System.out.println(list);
    list.addFirst("First");
    System.out.println(list);
    list.addLast("Last");
    System.out.println(list);
    list.remove(2);
    System.out.println(list);
    
    System.out.println(list.getFirst());
    }
    
}
