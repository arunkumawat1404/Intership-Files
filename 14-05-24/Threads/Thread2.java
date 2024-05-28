package Threads;
class Runthread extends Thread {

    public void run() {
      for(int i=1;i<=5;i++){

          System.out.println("This code is running in a thread " + i);
         
          
      }
    }
    
  }
public class Thread2 {
    public static void main(String[] args) {
        Runthread thread =new Runthread();
        Runthread thread2 =new Runthread();
      //thread.run();
     //thread2.run();
        thread.start();
      thread2.start();
    }

}
