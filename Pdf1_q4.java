//Write a program for determining whether a number is a Perfect number or not. (e.g. 28 is a 
//Perfect Number because Sum of the Divisor of 28 = 1+2+4+7+14 =28.)

package java_info_cls1;

import java.util.Scanner;
public class Pdf1_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n=sc.nextInt();
		int x=n;
		int s=0;
		for(int i=1;i<n;i++) {
			if(n%i == 0)
				s+=i;
		}
		if(s==x)
			System.out.println(s+" is a perfect no.");
		else
			System.out.println(x+" is not a perfect no.");
	}

}

/*
 * Output
 * 	Set 1:
 * 		Enter any number : 
		28
		28 is a perfect no.
	Set 2:
		Enter any number : 
		23
		23 is not a perfect no.


 */
