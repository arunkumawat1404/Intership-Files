package Threads;

class Method1 {
    
    public <T extends Comparable<T>> T getMax(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}

public class Genericsmethod {
    public static void main(String[] args) {
        Method1 util = new Method1();

     
        Integer maxInteger = util.getMax(10, 5);
        System.out.println("Max Integer: " + maxInteger);

        
        String maxString = util.getMax("apple", "orange");
        System.out.println("Max String: " + maxString); 
    }
}


    

