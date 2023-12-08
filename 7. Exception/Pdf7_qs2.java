/*
 * 2. Define an exception called “NoMatchFoundException” that is thrown when a string is
not equal to “University”. Write a program that uses this exception.
 */


package Pdf7_Exception;
import java.util.*;
class NoMatchFoundException extends Exception{
	private String errmsg;
	NoMatchFoundException(String msg){
		super();
		this.errmsg = msg;
	}
	public String getMessage() {
		return errmsg;
	}
}
public class Pdf7_qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		try {
			System.out.println("Enter the string : ");
			s = sc.nextLine();
			String s1 = "University";
			if(s.equals(s1)) {
				System.out.println("The string is University");
			}else {
				throw new NoMatchFoundException("The string is not University");
			}
		}catch(NoMatchFoundException e) {
			System.out.println(e);
			System.out.println("The message is : "+e.getMessage());
		}
		
		System.out.println("Normal flow....");
	}

}

/*
 * Output :
	Set 1:
	Enter the string : 
	University
	The string is University
	Normal flow....
	Set 2:
	Enter the string : 
	My name is Ankita
	Pdf7_Exception.NoMatchFoundException: The string is not University
	The message is : The string is not University
	Normal flow....


 * 
 */
