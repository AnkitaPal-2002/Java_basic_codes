/*
 Write a program to obtain the sum of the n terms (n and x to be taken from the user) of the 
following series x – x
3
/3! + x5
/5! - x
7
/7! ...........................................
 */

package java_info_cls1;
import java.util.*;
public class Progrm10_series {
	static int fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of 1st no of the series(x) : ");
		int x=sc.nextInt();
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		double s=0;
		for(int i=1,j=1;i<=n;i++,j=j+2) {
			double p = Math.pow(x, j);
			int f = fact(j);
			double y = p/f;
			if(i%2==0) {
				s = s - y;
			}else {
				s = s + y;
			}
		}
		System.out.println("the output is : "+s);
	}

}

//Output:
//	Enter the value of 1st no of the series(x) : 2
//	Enter the value of n : 4
//	the output is : 0.9079365079365079

