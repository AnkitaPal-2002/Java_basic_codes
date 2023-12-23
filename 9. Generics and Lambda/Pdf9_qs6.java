/*
 * 6. Write a methods [double operation(double a, double b)]; ] that return a lambda expression implement a
calculator perform Addition, Subtraction, Division, Multiplication operation.
 * 
 */

package Pdf9;
import java.util.*;
interface Multioperation{
	public double operation(double a, double b);
}
public class Pdf9_qs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a=0,b=0;
		Multioperation add = (a1,b1)-> a1+b1;
		Multioperation sub = (a1,b1)-> a1-b1;
		Multioperation mul = (a1,b1)-> a1*b1;
		Multioperation div = (a1,b1)->{
			if(b1==0) {
				throw new ArithmeticException("Cannot divide by 0!");
			}else {
				return a1/b1;
			}
		};
		
		
		while(true) {
			System.out.println("**This calculator is made by Ankita Pal**");
			System.out.println("****MENU****");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("Please enter your choice : ");
			int ch = sc.nextInt();
			if(ch>=1 && ch<=4) {
				System.out.print("Enter 1st no : ");
				a = sc.nextDouble();
				System.out.print("Enter 2nd no : ");
				b = sc.nextDouble();
			}
			
			switch(ch) {
			case 1: System.out.println("The result is : "+add.operation(a, b));
					break;
			case 2: System.out.println("The result is : "+sub.operation(a, b));
			        break;
			case 3: System.out.println("The result is : "+mul.operation(a, b));
					break;
			case 4: System.out.println("The result is : "+div.operation(a, b));
			        break;
			case 5: System.out.println("Thank you for using this program.....");
			        System.exit(0);
			default: System.out.println("Invalid choice !!!!");
			}
		}
		
		
		
	}

}

/*Output:
 * 
		**This calculator is made by Ankita Pal**
		****MENU****
		1. Addition
		2. Subtraction
		3. Multiplication
		4. Division
		5. Exit
		Please enter your choice : 
		1
		Enter 1st no : 2
		Enter 2nd no : 3
		The result is : 5.0
		**This calculator is made by Ankita Pal**
		****MENU****
		1. Addition
		2. Subtraction
		3. Multiplication
		4. Division
		5. Exit
		Please enter your choice : 
		2
		Enter 1st no : 4
		Enter 2nd no : 5
		The result is : -1.0
		**This calculator is made by Ankita Pal**
		****MENU****
		1. Addition
		2. Subtraction
		3. Multiplication
		4. Division
		5. Exit
		Please enter your choice : 
		3
		Enter 1st no : 6
		Enter 2nd no : 7
		The result is : 42.0
		**This calculator is made by Ankita Pal**
		****MENU****
		1. Addition
		2. Subtraction
		3. Multiplication
		4. Division
		5. Exit
		Please enter your choice : 
		4
		Enter 1st no : 2
		Enter 2nd no : 3
		The result is : 0.6666666666666666
		**This calculator is made by Ankita Pal**
		****MENU****
		1. Addition
		2. Subtraction
		3. Multiplication
		4. Division
		5. Exit
		Please enter your choice : 
		5
		Thank you for using this program.....

 * 
 * 
 */
