//Write a program to find all Armstrong numbers in the range 1 to M, where M is taken 
//as input.

package java_info_cls1;
import java.util.*;
public class Prog_7_armstrong {
	static void armstrong(int n) {
		int x=n;
		int n1=n;
		int s=0;
		int count=0;
		while(n>0) {
			int r = n%10;
			count=count+1;
			n=n/10;
		}
		while(n1>0) {
			int r=n1%10;
			int p=(int)Math.pow(r, count);
			s=s+p;
			n1=n1/10;
		}
		if(s==x) {
			System.out.print(x+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the value of m : ");
		int m = sc.nextInt();
		System.out.println("Armstrong nos. : ");
		for(int i=1;i<=m;i++) {
			armstrong(i);
		}
		System.out.println();
	}

}

//Output:
//	
//	Set 1:
//		Enter the value of m : 8000
//		Armstrong nos. : 
//		1 2 3 4 5 6 7 8 9 153 370 371 407 1634 
//	Set 2:
//		Enter the value of m : 999
//		Armstrong nos. : 
//		1 2 3 4 5 6 7 8 9 153 370 371 407 
