/*
 * 4. Write a program to accept a string from the user and find out the following statistics:

(a) Count of uppercase character
(b) Count of lowercase character
(c) Count of digits
(d) Count of spaces
 * 
 */

package Pdf5;
import java.util.*;
public class Pdf5_qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u = 0, l=0, d=0, s=0;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter your sentence : ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				u++;
			}else if(Character.isLowerCase(ch)) {
				l++;
			}else if(Character.isDigit(ch)) {
				d++;
			}else if(Character.isSpace(ch)) {
				s++;
			}
		}
		
		System.out.println("Total number of uppercase characters : "+u);
		System.out.println("Total number of lowercase characters : "+l);
		System.out.println("Total number of digits : "+d);
		System.out.println("Total number of spaces : "+s);
	}

}

/*
 * Output :
 * Enter your sentence : My name is Ankita. My roll no is 17.
Total number of uppercase characters : 3
Total number of lowercase characters : 21
Total number of digits : 2
Total number of spaces : 8

 * 
 */
