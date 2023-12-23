/*
 * 2. Design the Queue Using Generic Class that can contain any type of data. Implement the
	insertion, deletion methods.
 */

package Pdf9;
import java.util.*;
class Queue<T>{
	int size;
	int front;
	int rear;
	T[] q;
	Queue(int n){
		this.size = n;
		this.front = -1;
		this.rear = -1;
		this.q = (T[]) new Object[size];
		System.out.println("Queue is created successfully....");
	}
	
	void enqueue(T ele) {
		if(rear == size-1) {
			System.out.println("Queue is overflow....");
		}else if(front == -1 && rear == -1) {
			q[++front] = ele;
			q[++rear] = ele;
			System.out.println(ele+" is inserted sucessfully....");
		}else {
			q[++rear] = ele;
			System.out.println(ele+" is inserted sucessfully....");
		}
	}
	
	void dequeue() {
		if(front == -1) {
			System.out.println("Queue is unerflow....");
			
		}else{
			if(front == rear) {
				System.out.println("The deleted element is : "+q[front]);
				front = -1;
				rear = -1;
			}else {
				System.out.println("The deleted element is : "+q[front++]);
			}
		}
	}
	
	void display() {
		if(front == -1) {
			System.out.println("The queue is empty....");
		}else {
			System.out.println("The queue is :");
			for(int i=front;i<=rear;i++) {
				System.out.print(q[i]+" ");
			}
			System.out.println();
		}
	}
}
public class Pdf9_qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the queue : ");
		int n = sc.nextInt();
		Queue<Integer> q = new Queue(n);
		while(true) {
			System.out.println("****MENU****");
			System.out.println("1. Enqueue an element");
			System.out.println("2. Dequeue an element");
			System.out.println("3. Display queue");
			System.out.println("4. Exit");
			System.out.println("Please enter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1: System.out.print("Enter the element which you want to insert :");
						int e = sc.nextInt();
						q.enqueue(e);
						break;
				case 2: q.dequeue();
						break;
				case 3: q.display();
						break;
				case 4: System.out.println("Thank you for using this program.....");
				        System.exit(0);
				default : System.out.println("Invalid choice!!!!!");
			}
		}

	}

}


/*
 * Output:
 * 		Enter the size of the queue : 5
		Queue is created successfully....
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert :1
		1 is inserted sucessfully....
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is :
		1 
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert :2
		2 is inserted sucessfully....
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is :
		1 2 
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert :3
		3 is inserted sucessfully....
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is :
		1 2 3 
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert :4
		4 is inserted sucessfully....
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is :
		1 2 3 4 
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert :5
		5 is inserted sucessfully....
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is :
		1 2 3 4 5 
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		1
		Enter the element which you want to insert :6
		Queue is overflow....
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is :
		1 2 3 4 5 
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		2
		The deleted element is : 1
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is :
		2 3 4 5 
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		2
		The deleted element is : 2
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is :
		3 4 5 
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		2
		The deleted element is : 3
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is :
		4 5 
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		2
		The deleted element is : 4
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is :
		5 
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		2
		The deleted element is : 5
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		3
		The queue is empty....
		****MENU****
		1. Enqueue an element
		2. Dequeue an element
		3. Display queue
		4. Exit
		Please enter your choice : 
		4
		Thank you for using this program.....

 */
