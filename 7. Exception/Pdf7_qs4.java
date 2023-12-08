/*
 * 4. Write a class that keeps a running total of all characters passed to it (one at a time) and
throws an exception if it is passed a non-alphabetic character.
 */
package Pdf7_Exception;
import java.util.*;
class NonAlphabeticException extends Exception{
	private String errMsg;
	NonAlphabeticException(char c){
		this.errMsg = c+" is a non-alphabetic";
	}
	public String getMessage() {
		return errMsg; 
	}
}
class TotalCharacter{
	private int total;
	TotalCharacter(){
		this.total = 0;
	}
	public void addCharacter(char c) {
		try {
			if(Character.isAlphabetic(c)) {
				this.total++;
			}else {
				throw new NonAlphabeticException(c);
			}
		}catch(NonAlphabeticException e) {
			System.out.println("Exception handled....");
			System.out.println("Exception is : "+e);
			System.out.println("The message is : "+e.getMessage());
		}
	}
	public int getTotal() {
		return total;
	}
	
	
	
}
public class Pdf7_qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TotalCharacter ch = new TotalCharacter();
		System.out.println("Enter the number of the charcters : ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			System.out.println("Enter the character : ");
			char newch = sc.next().charAt(0);
			ch.addCharacter(newch);
		}
		System.out.println("The total number of characters is : "+ch.getTotal());
	}

}

/*
 * Output :
 * Set 1:
 * 	Enter the number of the charcters : 
	5
	Enter the character : 
	a
	Enter the character : 
	b
	Enter the character : 
	5
	Exception handled....
	Exception is : Pdf7_Exception.NonAlphabeticException: 5 is a non-alphabetic
	The message is : 5 is a non-alphabetic
	Enter the character : 
	c
	Enter the character : 
	@
	Exception handled....
	Exception is : Pdf7_Exception.NonAlphabeticException: @ is a non-alphabetic
	The message is : @ is a non-alphabetic
	The total number of characters is : 3

 * 
 * 
 */
