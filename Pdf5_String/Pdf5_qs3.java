/*
 * Write a program that takes a String from the user on the command-line and print it in
reverse.
“This is a test” must be printed as: “test a is This”.
 */

package Pdf5;

public class Pdf5_qs3 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("No command line argument provided....");
		}else {
			System.out.print("Input : ");
			for(String word: args) {
				System.out.print(word+" ");
			}
			System.out.println();
			System.out.print("Output: ");
			for(int i=(args.length-1);i>=0;i--) {
				System.out.print(args[i]+" ");
			}
		}
	}

}

/*
 * 	Output :
 * 	Input : this is a test 
	Output: test a is this 
 * 
 */
