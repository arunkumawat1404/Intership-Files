package Threads;

public class Thread1  extends Thread {
    public static int amount = 0;
  
    public static void main(String[] args) {
      Thread1 thread = new  Thread1();
      thread.start();
      System.out.println(amount);
      amount++;
      ++amount;
      System.out.println(amount);
    }
  
    public void run() {
      amount++;
    }
  }
