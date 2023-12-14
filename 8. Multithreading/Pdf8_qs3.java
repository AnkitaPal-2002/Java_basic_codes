/*
 * 3. Write a program to sort a list of strings using multithreading. Create one of the threads
	that take a string as input from the user, another thread that sorts the strings and finally
	another thread that displays the sorted list of strings. Each of the input, sort, and display
	methods is to be synchronized.
 * 
 */


package Pdf8;
import java.util.*;
class Stringsorter{
	private String[] stringList;
	private int n;
	
	public synchronized void takeinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of the strings :");
		n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the strings : ");
		stringList = new String[n];
		for(int i=0;i<n;i++) {
			String input = sc.nextLine();
			stringList[i] = input;
		}
		
		System.out.println("strings are inputed successfully....");
	}
	
	public synchronized void sortString() {
		Arrays.sort(stringList);
		//this.stringList = Arrays.toString(stringList);
	}
	
	public synchronized void displaysortedstring() {
		System.out.println("Sorted strings : ");
		for(String str: stringList) {
			System.out.println(str);
		}
	}
	
}
public class Pdf8_qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringsorter sorter = new Stringsorter();
		Thread input_thread = new Thread(()-> sorter.takeinput());
		Thread sort_thread = new Thread(()-> sorter.sortString());
		Thread display_thread = new Thread(()-> sorter.displaysortedstring());
		
		input_thread.start();
		try {
			input_thread.join(); //wait for input thread to finish before sorting
		}catch(Exception e) {
			System.out.println("Input thread interrupted....");
		}
		
		sort_thread.start();
		try {
			sort_thread.join(); //wait for sort thread to finish before sorting
		}catch(Exception e) {
			System.out.println("Sort thread interrupted....");
		}
		
		display_thread.start();
	}

}


/*
 * Output:
 * Enter the no of the strings :
5
Enter the strings : 
hi
ankita
uma
hello
jadu
strings are inputed successfully....
Sorted strings : 
ankita
hello
hi
jadu
uma

 * 
 */
