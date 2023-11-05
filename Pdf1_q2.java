//Write a program to find the roots (real and imaginary) of the quadratic equation of the form 
//ax2
//+ bx + c = 0.
package java_info_cls1;

import java.util.Scanner;
public class Pdf1_q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficients of the equation a,b,c : ");
		System.out.print("a = ");
		double a =sc.nextDouble();
		System.out.print("b = ");
		double b =sc.nextDouble();
		System.out.print("c = ");
		double c=sc.nextDouble();
		double d=Math.pow(b, 2) - (4*a*c);
		if(d>0) {
			double r1= (-b+Math.sqrt(d)) / (2*a);
			double r2= (-b-Math.sqrt(d)) / (2*a);
			System.out.println("Two real and distinct roots are:\nroot1 = "+r1+" and root2 = "+r2);
		}else if(d==0) {
			double r1=(-b)/(2*a);
			double r2=r1;
			System.out.println("One real root(repeated):\nroot1 = "+r1+" and root2 = "+r2);
		}else {
			double real = -b / (2 * a);
			double img = Math.sqrt(-d)/(2*a);
			System.out.println("Complex roots are:\nroot1 = "+String.format("%.2f", real)+"+i"+String.format("%.2f", img)+" and root2 = "+String.format("%.2f", real)+"-i"+String.format("%.2f", img));
		}
	}
}

//Output:
//	Set 1:
//		Enter the coefficients of the equation a,b,c : 
//			a = 2.3
//			b = 4
//			c = 5.6
//			Complex roots are:
//			root1 = -0.87+i1.30 and root2 = -0.87-i1.30
//	Set 2:
//		Enter the coefficients of the equation a,b,c : 
//			a = 1
//			b = -2
//			c = 1
//			One real root(repeated):
//			root1 = 1.0 and root2 = 1.0
//	Set 3:
//		Enter the coefficients of the equation a,b,c : 
//			a = 1
//			b = 5
//			c = 2
//			Two real and distinct roots are:
//			root1 = -0.4384471871911697 and root2 = -4.561552812808831
