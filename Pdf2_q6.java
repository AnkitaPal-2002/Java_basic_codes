//For a certain electrical circuit with an inductance L and resistance R, the damped natural 
// frequency is given by: 
//Frequency = √ [( 1 / LC ) – ( R2
///4C2 )]
// It is desired to study the variations of the frequency with C (capacitance). Write a 
//program to calculate the frequency of difference values of C starting 0.01 to 0.1 in steps 
//of 0.01.



package java_info_cls1;
import java.util.*;
public class Pdf2_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of inductance (L) : ");
		double l = sc.nextDouble();
		System.out.print("Enter the value of resistance (R) : ");
		double r = sc.nextDouble();
		for(double c = 0.01;c<=0.1;c=c+0.01) {
			System.out.print("When C = "+String.format("%.2f", c)+" then frequency = ");
			double x = 1/(l*c);
			
			double y = (Math.pow(r, 2) / (4*(Math.pow(c, 2))));
			
			double z = x-y;
			
			double f = Math.sqrt(Math.abs(z));
			System.out.println(String.format("%.2f", f));
		}
	}

}

//Output :
//	Enter the value of inductance (L) : 400
//	Enter the value of resistance (R) : 500
//	When C = 0.01 then frequency = 25000.00
//	When C = 0.02 then frequency = 12500.00
//	When C = 0.03 then frequency = 8333.33
//	When C = 0.04 then frequency = 6250.00
//	When C = 0.05 then frequency = 5000.00
//	When C = 0.06 then frequency = 4166.67
//	When C = 0.07 then frequency = 3571.43
//	When C = 0.08 then frequency = 3125.00
//	When C = 0.09 then frequency = 2777.78
//	When C = 0.10 then frequency = 2500.00

