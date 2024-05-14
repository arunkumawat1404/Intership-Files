package Threads;



class Threadrun implements Runnable{
    public  void run(){
        System.out.println("Implemented runnable interface in thread");

    }
}
public class Thread3 {

    public static void main(String[] args) {
        Threadrun obj = new Threadrun();
        Thread  thread = new Thread(obj);
        thread.start();
    }
    
}
