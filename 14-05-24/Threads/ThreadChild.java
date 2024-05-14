package Threads;

class ChildThread extends Thread {
    public void run() {
        System.out.println("Child Thread started");
        try {
            Thread.sleep(200); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child Thread completed");
    }
}

   


public class ThreadChild {
    public static void main(String[] args) {
        System.out.println("Parent Thread started");

      
        ChildThread childThread = new ChildThread();

        childThread.start();

        try {
            
            childThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Parent Thread completed");
    }
    
}
