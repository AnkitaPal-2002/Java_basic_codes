/*
 * 
 * 5. Create two Thread subclasses, one with a run( ) that starts up, captures the reference of
the second Thread object and then calls wait( ). The other class’ run( ) should call
notifyAll( ) for the first thread after some number of seconds have passed, so the first
thread can print a message.


 */


package Pdf8;
class FirstThread extends Thread{
	SecondThread secondthread;
	public void setSecondThread(SecondThread secondthread) {
		this.secondthread = secondthread;
	}
	
	public void run() {
		synchronized(this) {
			try {
				System.out.println("First thread is starting....");
				//Waiting for notification from the SecondThread
				wait();
				System.out.println("First thread received notification from the second thread and resumed....");
				System.out.println("Message from first thread....");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
class SecondThread extends Thread{
	FirstThread firstthread;
	public void setFirstThread(FirstThread firstthread) {
		this.firstthread = firstthread;
	}
	
	public void run() {
		synchronized(firstthread) {
			
			try {
				Thread.sleep(3000);
				System.out.println("Second thread is starting and waiing for 3 seconds....");
				firstthread.notifyAll(); //Notifying first thread
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class Pdf8_qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread firstthread = new FirstThread();
		SecondThread secondthread = new SecondThread();
		firstthread.setSecondThread(secondthread);
		secondthread.setFirstThread(firstthread);
		
		firstthread.start();
		secondthread.start();
		
		

	}

}


/*Output: 
 * 
		First thread is starting....
		Second thread is starting and waiing for 3 seconds....
		First thread received notification from the second thread and resumed....
		Message from first thread....

 * 
 * */
 