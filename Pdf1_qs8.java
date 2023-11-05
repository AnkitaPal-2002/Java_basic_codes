//Write a Program in Python to find the sum of all the Prime numbers between a given range of 
//numbers.

package java_info_cls1;
import java.util.*;
public class Pdf1_qs8 {
	static int Isprime(int n) {
		int f=0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				f++;
			}
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower range : ");
		int l=sc.nextInt();
		System.out.println("Enter the upper range : ");
		int u=sc.nextInt();
		int s=0;
		System.out.println("Prime numbers are : ");
		for(int i=l;i<=u;i++) {
			//1 is composite nor prime and 0 is composite nor prime
			if(i==0 || i==1) {
				continue;
			}else {
				if(Isprime(i) == 2) {
					System.out.print(i+" ");
					s=s+i;
				}
				
			}
		}
		System.out.println();
		System.out.println("The sum of the prime numbers is : "+s);
	}

}

/*
Output:

Enter the lower range : 
2
Enter the upper range : 
100
Prime numbers are : 
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
The sum of the prime numbers is : 1060

*/
