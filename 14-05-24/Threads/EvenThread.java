package Threads;
class EvenNumberPrinter implements Runnable {
    private int limit;

    public EvenNumberPrinter(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class EvenThread {
    public static void main(String[] args) {
        int maxLimit = 20; 

        EvenNumberPrinter evenPrinter = new EvenNumberPrinter(maxLimit);

        Thread evenThread = new Thread(evenPrinter, "EvenNumberThread");

        evenThread.start();
    }

    
}
