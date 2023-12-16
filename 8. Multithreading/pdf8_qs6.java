/*
	6. Suppose that two threads “t1” and “t2” access a shared integer “x”. Thread “t1”
	indefinitely increases “x” and “t2” indefinitely prints the value of “x”. That is the threads
	run in an infinite loop. However, thread “t1” must not increase “x” till that value of “x” is
	printed by “t2” and “t2” must not print the same value of “x” more than once.
 * 
 */

package Pdf8;
class Shared{
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

class MyThread1 extends Thread{
	Shared s;
	int i=0;
	public MyThread1(Shared s) {
		this.s = s;
	}
	public void run() {
		while(true) {
			s.increase(i++);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

class MyThread2 extends Thread{
	Shared s;
	public MyThread2(Shared s) {
		this.s = s;
	}
	public void run() {
		while(true) {
			s.print();
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
public class pdf8_qs6 {
	public static void main(String[] args) {
		Shared s= new Shared();
		MyThread1 t1 =  new MyThread1(s);
		MyThread2 t2 =  new MyThread2(s);
		
		t1.start();
		t2.start();
	}

}


/*Output:
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
(By t1)the value of x is increased....
(By t2)X is : 23
(By t1)the value of x is increased....
(By t2)X is : 24
(By t1)the value of x is increased....
(By t2)X is : 25
(By t1)the value of x is increased....
(By t2)X is : 26
(By t1)the value of x is increased....
(By t2)X is : 27
(By t1)the value of x is increased....
(By t2)X is : 28
(By t1)the value of x is increased....
(By t2)X is : 29
(By t1)the value of x is increased....
(By t2)X is : 30
(By t1)the value of x is increased....
(By t2)X is : 31
(By t1)the value of x is increased....
(By t2)X is : 32
(By t1)the value of x is increased....
(By t2)X is : 33
(By t1)the value of x is increased....
(By t2)X is : 34
(By t1)the value of x is increased....
(By t2)X is : 35
(By t1)the value of x is increased....
(By t2)X is : 36
(By t1)the value of x is increased....
(By t2)X is : 37
(By t1)the value of x is increased....
(By t2)X is : 38
(By t1)the value of x is increased....
(By t2)X is : 39
(By t1)the value of x is increased....
(By t2)X is : 40
(By t1)the value of x is increased....
(By t2)X is : 41
(By t1)the value of x is increased....
(By t2)X is : 42
(By t1)the value of x is increased....
(By t2)X is : 43
(By t1)the value of x is increased....
(By t2)X is : 44
(By t1)the value of x is increased....
(By t2)X is : 45
(By t1)the value of x is increased....
(By t2)X is : 46
(By t1)the value of x is increased....
(By t2)X is : 47
(By t1)the value of x is increased....
(By t2)X is : 48
(By t1)the value of x is increased....
(By t2)X is : 49
(By t1)the value of x is increased....
(By t2)X is : 50



Continue.....
 * 
 * */
 