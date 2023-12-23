/*]
 * 8. Write a program to create a thread using a lambda expression.
 * 
 */

package Pdf9;

public class Pdf9_qs8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable t1 = ()->{
			System.out.println(Thread.currentThread().getName()+" is running.....");
			for(int i=1;i<=10;i++) {
				System.out.println("The value of i is : "+i);
				try {
					Thread.sleep(3000);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		};
		
		Thread thread1  = new Thread(t1);
		thread1.setName("Thread 1");
		thread1.start();
	}

}

/*Output:
 * 
 * 	Thread 1 is running.....
	The value of i is : 1
	The value of i is : 2
	The value of i is : 3
	The value of i is : 4
	The value of i is : 5
	The value of i is : 6
	The value of i is : 7
	The value of i is : 8
	The value of i is : 9
	The value of i is : 10

 * 
 */
