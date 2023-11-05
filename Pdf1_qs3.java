//The nos. in the sequence 0 1 1 2 3 5 8 13 21…………. are called Fibonacci nos. Write a 
//program to print the first n (to be taken as input) Fibonacci nos.

package java_info_cls1;

import java.util.Scanner;
public class Pdf1_qs3 {
	static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		else
			return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n :");
		int n=sc.nextInt();
		System.out.println("Fibonacci series is:");
		for(int i=0;i<=n;i++) {
			System.out.print(fibo(i)+" ");
		}
		System.out.println();
	}

}

//Output:
//	Enter the value of n :10
//	Fibonacci series is:
//	0 1 1 2 3 5 8 13 21 34 55 
