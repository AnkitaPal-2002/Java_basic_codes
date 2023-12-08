/*1. Write a program called Factorial.java that computes factorials and catches the result in an
array of type long for reuse. The long type of variable has its own range. For example 20!
Is as high as the range of long type. So check the argument passes and “throw an
exception”, if it is too big or too small. If x is less than 0 throw an IllegalArgument
Exception with a message “Value of x must be positive”.If x is above the length of the
array throw an IllegalArgumentException with a message “Result will overflow”.
Here x is the value for which we want to find the factorial.
 * 
 * 
 */



package Pdf7_Exception;
import java.util.*;
class rangeexception extends Exception{
	private String errMsg;
	rangeexception(int n){
		this.errMsg=n+"! is as high as the range of long type";
	}
	public String getMessage() {
		return errMsg;
	}
}
public class Pdf7_qs1 {
	public static int factorial(int n) {
		
				if(n == 0|| n == 1) {
					return 1;
				}else {
					return n * factorial(n-1);
				}
}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the max size : ");
		int max = sc.nextInt();
		int x=0;
		int i=0;
		long arr[] = new long[max];
		try {
			while(true) {
				System.out.println("Enter the element "+(i+1)+" : ");
				x = sc.nextInt();
				if(x<0) {
					throw new IllegalArgumentException("Value of x must be positive");
				}else if(x>=max) {
					throw new IllegalArgumentException("Result will be overflow");
				}else if(x>=17) {
					throw new rangeexception(x);
				}else {
					arr[i] = factorial(x);
				}
				i++;
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Error : "+e.getMessage());
		}catch(rangeexception e1) {
			System.out.println("Error : "+e1.getMessage());
		}finally {
			System.out.println("Element Of the array is :");
			for(long ele: arr){
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		
		
	}

}
/*
 * Output:
 * 	Set 1:
 * 	Please enter the max size : 
	6
	Enter the element 1 : 
	4
	Enter the element 2 : 
	2
	Enter the element 3 : 
	7
	Error : Result will be overflow
	Element Of the array is :
	24 2 0 0 0 0 
	Set 2:
	Please enter the max size : 
	5
	Enter the element 1 : 
	2
	Enter the element 2 : 
	3
	Enter the element 3 : 
	4
	Enter the element 4 : 
	-9
	Error : Value of x must be positive
	Element Of the array is :
	2 6 24 0 0 
	Set 3:
	Please enter the max size : 
	21
	Enter the element 1 : 
	2
	Enter the element 2 : 
	3
	Enter the element 3 : 
	20
	Error : 20! is as high as the range of long type
	Element Of the array is :
	2 6 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 




 */
