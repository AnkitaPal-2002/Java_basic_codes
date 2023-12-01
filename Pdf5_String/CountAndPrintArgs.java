/*
 * 		 2. Write a Java class called CountAndPrintArgs to print the number of arguments passed on
		the command-line as well as the 1st letter of the arguments. For example, if the command
		line arguments are: “Mango Cucumber Apple” then the output will be
		No. of arguments – 3 MCA
		Write a main method to test the class.
 * 
 */

package Pdf5;

public class CountAndPrintArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("No arguments are provided...");
		}else {
			System.out.print("No of arguments : "+args.length+" ");
			for(String s : args) {
				System.out.print(s.charAt(0));
			}
		}
		
	}

}

/*
 * Output : 
 * 	No of arguments : 3 MCA
 * 	
 */
