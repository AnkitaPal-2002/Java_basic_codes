//The formula for resistors connected in parallel is a little more complex. Given two 
//resistors with resistances R1 and R2 connected in parallel the equivalent resistance is 
//given by the inverse of the sum of the inverses, i.e. * If there are more than two resistors 
//you continue to invert the sum of their inverses; e.g. for four resistors you have: * Write a 
//program that calculates the resistance of a group of resistors arranged in parallel.


package java_info_cls1;
import java.util.*;
public class Pdf2_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of the resistors : ");
		int n=sc.nextInt();
		double r[] = new double[n];
		double x[] = new double[n];
		double s = 0;
		System.out.println("Enter the resistances of the resistors : ");
		for(int i=0;i<n;i++) {
			System.out.print("Enter the resistance of resistor"+(i+1)+" : ");
			r[i] = sc.nextDouble();
			x[i] = 1/r[i];
			s=s+x[i];
		}
		double s1 = 1/s;
		System.out.println("The resistance of the equivalent resistor : "+s1);

	}

}

//Output:
//	Enter the no of the resistors : 
//		4
//		Enter the resistances of the resistors : 
//		Enter the resistance of resistor1 : 2
//		Enter the resistance of resistor2 : 3
//		Enter the resistance of resistor3 : 4
//		Enter the resistance of resistor4 : 5
//		The resistance of the equivalent resistor : 0.7792207792207793
