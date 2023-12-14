/*
 * 4. Inherit a class from Thread and override the run( ) method. Inside run( ), print a message,
and then call sleep( ). Repeat this three times, then return from run( ). Put a start-up
message in the constructor and override finalize( ) to print a shut-down message. Make a
separate thread class that calls System.gc( ) and System.runFinalization( ) inside run( ),
printing a message as it does so. Make several thread objects of both types and run them
to see what happens.
 */


package Pdf8;
class Customthread extends Thread{
	private String name;
	Customthread(String s){
		this.name = s;
		System.out.println("Startup message from "+name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Message from "+this.name);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Thread interrupted....");
			}
		}
	}
	
	protected void finalize() {
		System.out.println("Shutdown message from "+this.name);
	}
}

class GarbageCollectionThread extends Thread{
	public void run() {
		System.out.println("triggering garbage collection....");
		System.gc(); //Request garbage collection
		System.out.println("Garbage collection executed....");
		System.runFinalization(); //run finalize
		System.out.println("Finalize executed....");
		
	}
}
public class Pdf3_qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customthread cs1 = new Customthread("Customthread1");
		Customthread cs2 = new Customthread("Customthread2");
		GarbageCollectionThread gc1 = new GarbageCollectionThread();
		
		cs1.start();
		cs2.start();
		gc1.start();

	}

}


/*Output :
 * 	Startup message from Customthread1
	Startup message from Customthread2
	Message from Customthread2
	triggering garbage collection....
	Message from Customthread1
	Garbage collection executed....
	Finalize executed....
	Message from Customthread2
	Message from Customthread1
	Message from Customthread2
	Message from Customthread1

 * 
 */
