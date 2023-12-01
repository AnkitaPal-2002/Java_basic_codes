/*
 * 6. Write a method (not the entire application) called CountVowels, which takes the input
arguments as character and checks whether it is a vowel; increment the instance variable
called vCnt by 1.
 */

package Pdf5;
import java.util.*;
class CountVowels{
	private int vCnt;
	CountVowels(){
		this.vCnt=0;
	}
	public void checkvowel(char ch) {
		if(IsVowel(ch)) {
			vCnt++;
		}
	}
	
	public boolean IsVowel(char ch) {
		char newch = Character.toLowerCase(ch);
		return newch=='a'||newch=='e'||newch=='i'||newch=='o'||newch=='u';
	}
	
	public void display() {
		System.out.println("Total number of vowels are : "+vCnt);
	}
}
public class Pdf5_qs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CountVowels cv = new CountVowels(); 
		System.out.println("Enter your charcaters : ");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			cv.checkvowel(ch[i]);
		}
		
		cv.display();
	}

}


/*
 * Output:
 * 
 * Set 1:
 * 	Enter your charcaters : 
	a bc e df r o i we au wx
	Total number of vowels are : 7
	
	Set 2:
	Enter your charcaters : 
	ae io e wxc v qstrbnhordt
	Total number of vowels are : 6


 */
