package Threads;

 class Multithread1  implements Runnable {
	public void run()
	{
		try {
		
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}
		catch (Exception e) {
		
			System.out.println("Exception is caught");
		}
	}
}

public class Multithread {
	public static void main(String[] args)
	{
		int n = 2; 
		for (int i = 0; i < n; i++) {
			Thread object= new Thread(new Multithread1());
			object.start();
		}
	}
}

