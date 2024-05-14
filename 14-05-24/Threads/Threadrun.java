package Threads;
class PrintNumbers {
    private int limit;
    private volatile int number = 1; 
    private boolean isEven = true; 

    public PrintNumbers(int limit) {
        this.limit = limit;
    }

    public void printEven() {
        while (number <= limit) {
            synchronized (this) {
                while (!isEven || (number % 2 != 0)) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + number);
                number++;
                isEven = false;
                notify();
            }
        }
    }

    public void printOdd() {
        while (number <= limit) {
            synchronized (this) {
                while (isEven || (number % 2 == 0)) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + number);
                number++;
                isEven = true;
                notify();
            }
        }
    }
}

public class Threadrun {
    public static void main(String[] args) {
        int limit = 20;
        PrintNumbers printer = new PrintNumbers(limit);

        Thread evenThread = new Thread(() -> printer.printEven(), "EvenThread");
        Thread oddThread = new Thread(() -> printer.printOdd(), "OddThread");

        evenThread.start();
        oddThread.start();
    }
    
    
    
}
