//Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write 
//a program to merge them into single sorted array C that contains every item from arrays. 
//A & B, in ascending order.

package java_info_cls1;
import java.util.*;
public class Pdf2_q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of the elements of the array a : ");
		int n = sc.nextInt();
		System.out.print("Enter the no of the elements of the array b : ");
		int x = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[x];
		System.out.println("Enter the data in the array A : ");
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("the array A is : ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		
		System.out.println("Enter the data in the array B : ");
		for(int i=0;i<x;i++) {
			System.out.print("b["+i+"] : ");
			b[i] = sc.nextInt();
		}
		Arrays.sort(b);
		System.out.println("the array B is : ");
		for(int i=0;i<x;i++) {
			System.out.print(b[i]+" ");
			
		}
		System.out.println();
		
		int y = n+x;
		int c[] = new int[y];
		for(int i=0;i<n;i++) {
			c[i]=a[i];
		}
		int i,j;
		for(i=0,j=n;j<y;j++,i++) {
			c[j]=b[i];
		}
		
		Arrays.sort(c);
		
		System.out.println("the array C is : ");
		for(i=0;i<y;i++) {
			System.out.print(c[i]+" ");
			
		}
		System.out.println();
		
	}

}

//Output:
//	Enter the no of the elements of the array a : 4
//	Enter the no of the elements of the array b : 5
//	Enter the data in the array A : 
//	a[0] : 7
//	a[1] : 5
//	a[2] : 6
//	a[3] : 4
//	the array A is : 
//	4 5 6 7 
//	Enter the data in the array B : 
//	b[0] : 8
//	b[1] : 7
//	b[2] : 4
//	b[3] : 9
//	b[4] : 5
//	the array B is : 
//	4 5 7 8 9 
//	the array C is : 
//	4 4 5 5 6 7 7 8 9 

