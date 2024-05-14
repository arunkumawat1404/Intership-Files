package Threads;
class Threadrun1 {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Thread from class 1");
        }
    }
}
class Threadrun2 {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Thread from class 2");
        }
    }
}


public class Thread4 {
    
    public static void main(String[] args) {
        Threadrun1 t1 = new Threadrun1();
        Threadrun2 t2 = new Threadrun2();
        t1.run();
        t2.run();
    }
    
}
