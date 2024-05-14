package Threads;
class Pair<T, U> {
    private T first;
    private U second;


    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

   
    public U getSecond() {
        return second;
    }

   
    public void printPair() {
        System.out.println("(" + first + ", " + second + ")");
    }
}

public class Gericsclass {
    public static void main(String[] args) {
      
        Pair<Integer, String> pair1 = new Pair<>(10, "Hello");
        System.out.println("First element: " + pair1.getFirst());
        System.out.println("Second element: " + pair1.getSecond());
        pair1.printPair(); 
        Pair<Double, Boolean> pair2 = new Pair<>(3.14, true);
        System.out.println("First element: " + pair2.getFirst());
        System.out.println("Second element: " + pair2.getSecond());
        pair2.printPair(); 
    }
}


    

