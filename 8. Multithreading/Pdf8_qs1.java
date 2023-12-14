/*
 * 1. Write a Java program that illustrates the use of the yield( ), start( ),stop( ),run ( ), sleep( ),
	wait( ) and isAlive( ) methods.
 * 
 */


package Pdf8;
class MyThread extends Thread{
	private boolean running = true;
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running ......");
		while(running) {
			//Perform some tasks here
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				Thread.currentThread().interrupt();
				System.out.println(Thread.currentThread().getName()+" interrupted....");
			}
		}
		System.out.println(Thread.currentThread().getName()+" stopped....");
	}
	public void stopThread() {
		running = false;
	}
}
public class Pdf8_qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();

        // Start the thread
        thread.start();

        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // Yield the main thread
        Thread.yield();
        System.out.println("Main thread yielding...");

        // Check if the thread is alive
        if (thread.isAlive()) {
            System.out.println("Thread is still alive.");
        }

        // Stop the thread
        thread.stopThread();

        try {
            thread.join(); // Wait for the thread to finish
        } catch (Exception e) {
            System.out.println("Main thread interrupted while waiting for MyThread to finish");
        }

        System.out.println("Main thread exiting...");
    }

}

/*
Output:

Thread-0 is running ......
Main thread yielding...
Thread is still alive.
Thread-0 stopped....
Main thread exiting...

*/