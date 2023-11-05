//Write a program for determining whether a number is a Pearson number or not.
//(e.g. 145 is a Pearson number because 1! + 4! + 5! =145.)

package java_info_cls1;
import java.util.*;
public class Pdf1_qs6 {
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
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		int x = n;
		int s=0;
		while(n>0) {
			int r = n%10;
			int f =fact(r);
			s=s+f;
			n=n/10;
		}
		if(s == x) {
			System.out.println(x+" is Pearson no ");
		}else {
			System.out.println(x+" is not a Pearson no ");
		}
		
	}

}

/* Output
 
Set1:
Enter any number : 
145
145 is Pearson no
 
Set2:
Enter any number : 
123
123 is not a Pearson no 

*/

