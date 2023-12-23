/*
 * 
 * 5. Write the following methods that return a lambda expression performing a specified action:
	isOdd(): The lambda expression must return true if a number is odd or false if it is even.
	isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
	isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.
 */


package Pdf9;
import java.util.*;

@FunctionalInterface
interface CheckOdd{
	public boolean isOdd(int a);
}
@FunctionalInterface
interface CheckPrime{
	public boolean isPrime(int a);
}
@FunctionalInterface
interface CheckPallindrome{
	public boolean isPallindrome(int a);
}
public class Pdf9_qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CheckOdd o = (a) -> a%2!=0;
		CheckPrime p = (a) ->{
			int s=0;
			for(int i=1;i<=a;i++) {
				if(a%i == 0) {
					s++;
				}
			}
			if(s == 2) {
				return true;
			}else {
				return false;
			}
		};
		
		CheckPallindrome pal = (a)->{
			int rev ,s =0, x;
			x = a;
			while(a>0) {
				rev = a%10;
				s = (s*10) + rev;
				a = a/10;
			}
			if(x == s) {
				return true;
			}else {
				return false;
			}
			
		};
		
		System.out.println("Enter any no : ");
		int x = sc.nextInt();
		System.out.println("Is "+x+" odd ? "+o.isOdd(x));
		System.out.println("Is "+x+" prime ? "+p.isPrime(x));
		System.out.println("Is "+x+" pallindrome ? "+pal.isPallindrome(x));
		
		

	}

}

/*Output:
 * 
 * Set 1:
 * 	Enter any no : 
	121
	Is 121 odd ? true
	Is 121 prime ? false
	Is 121 pallindrome ? true
	
   Set 2:
   	Enter any no : 
	19
	Is 19 odd ? true
	Is 19 prime ? true
	Is 19 pallindrome ? false
   Set 3:
    Enter any no : 
	122
	Is 122 odd ? false
	Is 122 prime ? false
	Is 122 pallindrome ? false


 */
