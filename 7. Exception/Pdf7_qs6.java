/*
 * 6. Write a program that takes a value at the command line for which factorial is to be
computed. The program must convert the string to its integer equivalent. There are three
possible user input errors that can prevent the program from executing normally.
The first error is when the user provides no argument while executing the program and an
ArrayIndexOutOfBoundsException is raised. You must write a catch block for this.
The second error is NumberFormalException that is raised in case the user provides a
non-integer (float double) value at the command line.The third error is IllegalArgument
Exception. This needs to be thrown manually if the value at the command line is 0.
 * 
 */


package Pdf7_Exception;

public class Pdf7_qs6 {
	public static int factorial(int n) {
		if(n ==1) {
			return n;
		}else {
			return n * factorial(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if(args.length == 0) {
				throw new ArrayIndexOutOfBoundsException("Please provide a value for factorial calculation.");
			}else {
				int num = Integer.parseInt(args[0]);
				if(num == 0) {
					throw new IllegalArgumentException("The factorial of 0 is 1.Please enter value greater than 0.");
				}
				else {
					int fact = factorial(num);
					System.out.println("The factorial of "+num+" is : "+fact);
				}
				
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: "+e.getMessage());
		}catch(NumberFormatException e1) {
			System.out.println("Error : Please provide integer value.");
		}catch(IllegalArgumentException e2) {
			System.out.println("Error: "+e2.getMessage());
		}
		
	}

}


/*
Output:

Set 1:
	java Pdf7_qs6.java
	Error: Please provide a value for factorial calculation.
Set 2:
	java Pdf7_qs6.java 2.4
	Error : Please provide integer value.
Set 3:
	java Pdf7_qs6.java 0
	Error: The factorial of 0 is 1.Please enter value greater than 0.
Set 4:
	java Pdf7_qs6.java 5
	The factorial of 5 is : 120

*/