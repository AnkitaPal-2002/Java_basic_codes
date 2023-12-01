/*
 * 7. Write a program to determine if a string has all Unique Characters.[remove white space]
Given a string, determine if the string has all unique characters.
Examples :
Input: ab cd 10jk
Output: true
Input: hutg9mnd!nk9
Output: false
 */

package Pdf5;
import java.util.*;
public class Pdf5_qs7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : ");
		String str = sc.nextLine();
		String s = str.replace(" ", "");
		//System.out.println((s));
		
		char ch[] = s.toCharArray();
		boolean f = true;
		loop:
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					f= false;
					break loop;
				}
			}
		}
		
		if(f == true) {
			System.out.println(f);
		}else {
			System.out.println(f);
		}

	}

}

/*
 * Output:
 * Set 1:
 * 	Enter your string : 
	ab cd 10jk
	true

 * Set 2:
 * 	Enter your string : 
	hutg9mnd!nk9
	false

 * 
 */
