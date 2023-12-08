/*
 * 
 * 3. Write a program to create a class called MyStack that includes functions to perform all
operations on a stack as well as raises an exception whenever overflow/underflow error
occurs.
 */


package Pdf7_Exception;
import java.util.*;
class OverFlow extends Exception{
	private String msg ;
	OverFlow(){
		super();
		this.msg = "Stack is Overflow";
	}
	public String getMessage() {
		return msg;
	}
}

class UnderFlow extends Exception{
	private String msg ;
	UnderFlow(){
		super();
		this.msg = "Stack is Underflow";
	}
	public String getMessage() {
		return msg;
	}
}
class MyStack{
	private int top;
	private int maxsize;
	private int s[];
	MyStack(int n){
		this.top = -1;
		this.maxsize = n;
		this.s = new int[n];
	}
	
	public void push(int e) {
		try {
			if(this.top == this.maxsize-1) {
				throw new OverFlow();
			}else {
				this.top++;
				this.s[top] = e;
				System.out.println(e+" is inserted successfully....");
				
			}
		}catch(OverFlow o) {
			System.out.println(o.getMessage());
		}
	}
	
	public void pop() {
		try {
			if(this.top == -1) {
				throw new UnderFlow();
			}else {
				int ele = this.s[this.top];
				this.top--;
				System.out.println("Popped element is : "+ele);
			}
		}catch(UnderFlow u) {
			System.out.println(u.getMessage());
		}
	}
	
	public void display() {
		
		if(this.top==-1) {
			System.out.println("The stack is empty....");
		}else {
			System.out.println("The stack is : ");
			for(int i=0;i<=this.top;i++) {
				System.out.print(this.s[i]+" ");
			}
			System.out.println();
		}
	}
}
public class Pdf7_qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the capacity of the stack : ");
		int n = sc.nextInt();
		MyStack st = new MyStack(n);
		while(true) {
			System.out.println("****MENU****");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.println("Please enter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter the element which you want to insert into the stack : ");
			        int ele = sc.nextInt();
			        st.push(ele);
			        break;
			case 2: st.pop();
					break;
			case 3: st.display();
					break;
			case 4: System.out.println("Thank you for using this program........");
					System.exit(0);
			default: System.out.println("Invalid choice!!!!! Please enter valid choice from next time......");
			        
			}
		}
	}

}

/* Output :
 * 		enter the capacity of the stack : 5
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		3
		The stack is empty....
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert into the stack : 
		2
		2 is inserted successfully....
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert into the stack : 
		3
		3 is inserted successfully....
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert into the stack : 
		4
		4 is inserted successfully....
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		3
		The stack is : 
		2 3 4 
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert into the stack : 
		6
		6 is inserted successfully....
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert into the stack : 
		7
		7 is inserted successfully....
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert into the stack : 
		8
		Stack is Overflow
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		3
		The stack is : 
		2 3 4 6 7 
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		2
		Popped element is : 7
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		2
		Popped element is : 6
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		3
		The stack is : 
		2 3 4 
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		2
		Popped element is : 4
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		2
		Popped element is : 3
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		2
		Popped element is : 2
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		3
		The stack is empty....
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		2
		Stack is Underflow
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		3
		The stack is empty....
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		7
		Invalid choice!!!!! Please enter valid choice from next time......
		****MENU****
		1. Push
		2. Pop
		3. Display
		4. Exit
		Please enter your choice : 
		4
		Thank you for using this program........

 * 
 * 
 * 
 */
