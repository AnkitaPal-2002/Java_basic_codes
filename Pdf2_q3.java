//Write a program to evaluate, the following investment equation: V=P ( 1 + r )n
//and print the tables which would give the values of V for various combinations of the 
//following values of P, r & n.
//P : 1000,2000,3000,………..,10,000 R : 0.10,0.11,0.12,…………….0.20
//n : 1,2,3,…………………………,10

package java_info_cls1;

public class Pdf2_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r=0.1;
		for(int i=1;i<=10;i++) {
			int p = (1000*i);
			System.out.print("When P = "+p+", r = "+String.format("%.2f",r)+", n = "+i+" : V = ");
			double x=(1+r);
			double y=Math.pow(x,i);
			double v = p*y;
			System.out.println(String.format("%.2f",v));
			r=r+0.01;
		}
			
	}

}

//Output
//
//When P = 1000, r = 0.10, n = 1 : V = 1100.00
//When P = 2000, r = 0.11, n = 2 : V = 2464.20
//When P = 3000, r = 0.12, n = 3 : V = 4214.78
//When P = 4000, r = 0.13, n = 4 : V = 6521.89
//When P = 5000, r = 0.14, n = 5 : V = 9627.07
//When P = 6000, r = 0.15, n = 6 : V = 13878.36
//When P = 7000, r = 0.16, n = 7 : V = 19783.54
//When P = 8000, r = 0.17, n = 8 : V = 28091.63
//When P = 9000, r = 0.18, n = 9 : V = 39919.08
//When P = 10000, r = 0.19, n = 10 : V = 56946.84

