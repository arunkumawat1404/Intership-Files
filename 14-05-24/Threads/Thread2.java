package Threads;
class Runthread extends Thread {
    public void run() {
      System.out.println("This code is running in a thread");
    }
    
  }
public class Thread2 {
    public static void main(String[] args) {
        Runthread thread =new Runthread();
        thread.start();
    }

}
