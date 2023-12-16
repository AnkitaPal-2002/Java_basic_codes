
/*
7. Define the classes for implementing “t1” and “t2”. Write appropriate methods for
accomplishing the above.
* 
*/

package Pdf8;
class SharedResource{
int x = 0;
boolean valueset = false;
public synchronized void increase(int x) {
	while(valueset) {
		try {wait();}catch(Exception e) {}
	}
	this.x = x;
	System.out.println("(By t1)the value of x is increased....");
	valueset = true;
	notify();
	
}

public synchronized void print() {
	while(!valueset) {
		try {wait();}catch(Exception e) {}
	}
	System.out.println("(By t2)X is : "+x);
	valueset = false;
	notify();
}
}

class MyThread1Runnable implements Runnable{
SharedResource s;
int i=0;
public MyThread1Runnable(SharedResource s) {
	this.s = s;
}
public void run() {
	while(true) {
		s.increase(i++);
		try {Thread.sleep(1000);}catch(Exception e) {}
	}
}
}

class MyThread2runnable implements Runnable{
	SharedResource s;
	public MyThread2runnable(SharedResource s) {
		this.s = s;
	}
	public void run() {
		while(true) {
			s.print();
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
public class Pdf8_qs7 {
public static void main(String[] args) {
	SharedResource s= new SharedResource();
	Thread t1 = new Thread(new MyThread1Runnable(s));
	Thread t2 = new Thread(new MyThread2runnable(s));
	
	t1.start();
	t2.start();
}

}


/*Output
 * 
 * 
 * (By t1)the value of x is increased....
(By t2)X is : 0
(By t1)the value of x is increased....
(By t2)X is : 1
(By t1)the value of x is increased....
(By t2)X is : 2
(By t1)the value of x is increased....
(By t2)X is : 3
(By t1)the value of x is increased....
(By t2)X is : 4
(By t1)the value of x is increased....
(By t2)X is : 5
(By t1)the value of x is increased....
(By t2)X is : 6
(By t1)the value of x is increased....
(By t2)X is : 7
(By t1)the value of x is increased....
(By t2)X is : 8
(By t1)the value of x is increased....
(By t2)X is : 9
(By t1)the value of x is increased....
(By t2)X is : 10
(By t1)the value of x is increased....
(By t2)X is : 11
(By t1)the value of x is increased....
(By t2)X is : 12
(By t1)the value of x is increased....
(By t2)X is : 13
(By t1)the value of x is increased....
(By t2)X is : 14
(By t1)the value of x is increased....
(By t2)X is : 15
(By t1)the value of x is increased....
(By t2)X is : 16
(By t1)the value of x is increased....
(By t2)X is : 17
(By t1)the value of x is increased....
(By t2)X is : 18
(By t1)the value of x is increased....
(By t2)X is : 19
(By t1)the value of x is increased....
(By t2)X is : 20
(By t1)the value of x is increased....
(By t2)X is : 21
(By t1)the value of x is increased....
(By t2)X is : 22


Continue
 * 
 */
 

