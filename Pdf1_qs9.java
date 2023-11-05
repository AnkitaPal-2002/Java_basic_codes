/*
Write a program to obtain the sum of the n terms (n to be taken from the user) of the 
following series 1 - 3
2
/2 + 53
/3 - 7
4
/4.................................................
*/

package java_info_cls1;
import java.util.*;
public class Pdf1_qs9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		double s=0;
		int i,j;
		for(i=1,j=1;i<=n;i++,j=j+2) {
			double x = Math.pow(j,i);
			double y = x/i;
			if(i%2 == 0) {
				s=s-y;
			}else {
				s=s+y;
			}
		}
		
		System.out.println("The output of the series is : "+String.format("%.2f", s));
	}

}

/*
Output:
	Set 1:
		Enter the value of n : 4
		The output of the series is : -562.08
	Set 2:
		Enter the value of n : 8
		The output of the series is : -311681266.72
*/
