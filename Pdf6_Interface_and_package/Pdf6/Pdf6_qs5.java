/*
5. Complete the following:
i) Create a package named org.shapes.
ii) Create some classes in the package representing some common geometric shapes like
Square, Triangle, Circle and so on. The classes should contain area and perimeter
methods in them.
iii) Compile the package.
iv) Use this package to find area and perimeter of different shapes as chosen by the user.

 * 
 */


package Pdf6;
import org.shapes.*;
import java.util.*;
public class Pdf6_qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("****MENU****");
			System.out.println("Choose any option : ");
			System.out.println("1. Square");
			System.out.println("2. Circle");
			System.out.println("3. Triangle");
			System.out.println("4. Exit");
			System.out.println("Enter your option : ");
			int c = sc.nextInt();
			
			switch(c) {
			case 1: System.out.println("Enter the side of the square : ");
			        double s = sc.nextDouble();
			        Square square = new Square(s);
			        square.area();
			        square.perimeter();
			        break;
			case 2: System.out.println("Enter the radius of circle : ");
			        double r = sc.nextDouble();
			        Circle circle = new Circle(r);
			        circle.area();
			        circle.perimeter();
			        break;
			case 3: System.out.println("Enter the 1st side of the triangle : ");
			        double s1 = sc.nextDouble();
			        System.out.println("Enter the 2nd side of the triangle : ");
			        double s2 = sc.nextDouble();
			        System.out.println("Enter the 3rd side of the triangle : ");
			        double s3 = sc.nextDouble();
			        System.out.println("Enter the base of the triangle : ");
			        double b = sc.nextDouble();
			        System.out.println("Enter the height of the triangle : ");
			        double h = sc.nextDouble();
			        Triangle triangle = new Triangle(s1,s2,s3,b,h);
			        triangle.area();
			        triangle.perimeter();
			        break;
			case 4: System.out.println("Thank you for using this program.....");
			        System.exit(0);
			default : System.out.println("Invalid choice .... Please enter valid choice .....");
			        
			}
		}
	}

}


/*
Output :
		****MENU****
		Choose any option : 
		1. Square
		2. Circle
		3. Triangle
		4. Exit
		Enter your option : 
		1
		Enter the side of the square : 
		2
		The area of the square is : 4.0
		The perimeter of the square is : 8.0
		****MENU****
		Choose any option : 
		1. Square
		2. Circle
		3. Triangle
		4. Exit
		Enter your option : 
		1
		Enter the side of the square : 
		4
		The area of the square is : 16.0
		The perimeter of the square is : 16.0
		****MENU****
		Choose any option : 
		1. Square
		2. Circle
		3. Triangle
		4. Exit
		Enter your option : 
		1
		Enter the side of the square : 
		5
		The area of the square is : 25.0
		The perimeter of the square is : 20.0
		****MENU****
		Choose any option : 
		1. Square
		2. Circle
		3. Triangle
		4. Exit
		Enter your option : 
		2
		Enter the radius of circle : 
		4
		The area of the circle is : 50.26548245743669
		The perimeter of the circle is : 25.132741228718345
		****MENU****
		Choose any option : 
		1. Square
		2. Circle
		3. Triangle
		4. Exit
		Enter your option : 
		3
		Enter the 1st side of the triangle : 
		1
		Enter the 2nd side of the triangle : 
		2
		Enter the 3rd side of the triangle : 
		3
		Enter the base of the triangle : 
		4
		Enter the height of the triangle : 
		5
		The area of the traingle is : 10.0
		The perimeter of the triangle is : 6.0
		****MENU****
		Choose any option : 
		1. Square
		2. Circle
		3. Triangle
		4. Exit
		Enter your option : 
		3
		Enter the 1st side of the triangle : 
		5
		Enter the 2nd side of the triangle : 
		6
		Enter the 3rd side of the triangle : 
		7
		Enter the base of the triangle : 
		8
		Enter the height of the triangle : 
		9
		The area of the traingle is : 36.0
		The perimeter of the triangle is : 18.0
		****MENU****
		Choose any option : 
		1. Square
		2. Circle
		3. Triangle
		4. Exit
		Enter your option : 
		4
		Thank you for using this program.....

 * 
 * 
 * 
 * 
 * 
 */
