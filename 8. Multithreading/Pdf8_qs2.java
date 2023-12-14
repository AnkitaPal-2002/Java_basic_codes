/*
 * 2. Write multithreaded program that continuously prints the strings “ping” and “PONG” in
the console at random distances at intervals of one second. Use two threads one for
“ping” and another for “PONG”.
 */

package Pdf8;
import java.util.*;
class Printstringthread extends Thread{
	private String st;
	Printstringthread(String st){
		this.st = st;
	}
	
	public void run() {
		for(int i=1;i<=6;i++) {
			try {
				System.out.println(this.st);
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}

public class Pdf8_qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printstringthread pingthread = new Printstringthread("Ping");
		Printstringthread pongthread = new Printstringthread("Pong");
		
		pingthread.start();
		pongthread.start();

	}

}

/*
 * Output:
 * 
 * 	Ping
	Pong
	Ping
	Pong
	Ping
	Pong
	Ping
	Pong
	Pong
	Ping
	Pong
	Ping

 */
