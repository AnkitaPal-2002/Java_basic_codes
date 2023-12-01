/*
 * 1. Write a Java program to pass the string “Have a nice day!” from the command line, and
	display each word in a new line. Use proper import statement for this program.
 * 
 */

package Pdf5;

public class Pdf5_qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("No arguments are provided...");
		}else {
			for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}

}
}


/*
 * 
 * Output :
 * Set 1:
	Have
	a
	nice
	day!


	
	

 * 
 */
