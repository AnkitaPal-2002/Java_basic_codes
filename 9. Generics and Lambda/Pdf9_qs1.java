/*
 * 1. Design the Stack Using Generic Class that can contain any type of data. Implement the insertion,
deletion, peek function.
 * 
 */


package Pdf9;
import java.util.*;
class Stack<T>{
	int size;
	T[] st;
	int top ;
	@SuppressWarnings("unchecked")
	Stack(int n){
		this.size = n;
		this.st = (T[])new Object[n];
		this.top=-1;
		System.out.println("Stack created successfully");
	}
	
	void push(T e) {
		if(top==size-1) {
			System.out.println("Stack is overflow.....");
		}else {
			st[++top]=e;
			System.out.println(e+" inserted successfully.....");
		}
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("stack is underflow....");
		}else {
			T z = st[top--];
			System.out.println(z+" deleted successfully.....");
		}
	}
	
	void display() {
		if(top==-1) {
			System.out.println("Stack is empty....");
		}else {
			System.out.println("The stack is:");
			for(int i=0;i<=top;i++) {
				System.out.print(st[i]+" ");
			}
			System.out.println();
		}
	}
	
	void peek() {
		if(top==-1) {
			System.out.println("Stack is empty....");
		}else {
			System.out.println("The topmost element of the stack is : "+st[top]);
		}
	}
}
public class Pdf9_qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the capacity of the stack : ");
		int n = sc.nextInt();
		
		Stack<Integer> s=new Stack(n);
		while(true) {
			System.out.println("****MENU****");
			System.out.println("1. Push an element");
			System.out.println("2. Pop an element");
			System.out.println("3. Peek an element");
			System.out.println("4. Display the stack");
			System.out.println("5. Exit");
			System.out.println("Please enter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter the element which you want to insert : ");
					int e = sc.nextInt();
					s.push(e);
					break;
			case 2: s.pop();
					break;
			case 3: s.peek();
					break;
			case 4: s.display();
					break;
			case 5: System.out.println("thank you for using this program.....");
			        System.exit(0);
			default: System.out.println("Invalid choice!!!!!!!!");
			}
		}

	}

}



/*
 * 
 *Output:
 *
 * 		Enter the capacity of the stack : 5
		Stack created successfully
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert : 
		2
		2 inserted successfully.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert : 
		3
		3 inserted successfully.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		4
		The stack is:
		2 3 
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert : 
		5
		5 inserted successfully.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert : 
		6
		6 inserted successfully.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert : 
		7
		7 inserted successfully.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert : 
		8
		Stack is overflow.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		4
		The stack is:
		2 3 5 6 7 
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		3
		The topmost element of the stack is : 7
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		2
		7 deleted successfully.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		2
		6 deleted successfully.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		2
		5 deleted successfully.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		3
		The topmost element of the stack is : 3
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		2
		3 deleted successfully.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		2
		2 deleted successfully.....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		2
		stack is underflow....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		4
		Stack is empty....
		****MENU****
		1. Push an element
		2. Pop an element
		3. Peek an element
		4. Display the stack
		5. Exit
		Please enter your choice : 
		5
		thank you for using this program.....

 * 
 */
