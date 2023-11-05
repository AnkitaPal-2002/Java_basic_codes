//Write a program that reads three coordinate and calculate the side of triangle. Check whether 
//these numbers can be considered as the three sides of a triangle. If so, find the type 
//(isosceles, equilateral or right-angled) and area of the triangle
package java_info_cls1;

import java.text.DecimalFormat;
import java.util.*;


public class Pdf1_qs1 {
	private static final DecimalFormat decfor = new DecimalFormat("0.00");
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first coordinate");
		System.out.println("Enter value of x: ");
		double x1=sc.nextDouble();
		System.out.println("Enter value of y: ");
		double y1=sc.nextDouble();
		
		System.out.println("Enter second coordinate");
		System.out.println("Enter value of x: ");
		double x2=sc.nextDouble();
		System.out.println("Enter value of y: ");
		double y2=sc.nextDouble();
		
		System.out.println("Enter third coordinate");
		System.out.println("Enter value of x: ");
		double x3=sc.nextDouble();
		System.out.println("Enter value of y: ");
		double y3=sc.nextDouble();
		
		double a = (Math.sqrt((Math.pow((x2-x1), 2)) + Math.pow((y2-y1), 2)));
		double b = (Math.sqrt((Math.pow((x3-x1), 2)) + Math.pow((y3-y1), 2)));
		double c = (Math.sqrt((Math.pow((x3-x2), 2)) + Math.pow((y3-y2), 2)));
		
		
		System.out.println("The sides of the triangle are:");
		System.out.println("AB = "+a);
		System.out.println("AC = "+b);
		System.out.println("BC = "+c);
		
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("These are the sides of a triangle.");
			
			if(((a*a)+(b*b)) == (c*c) || ((a*a)+(c*c)) == (b*b) || ((c*c)+(b*b)) == (a*a))
				System.out.println("This is a right-angled triangle.");
			else if(a==b && b==c && c==a)
				System.out.println("This is an equilateral triangle.");
			else if(a==b && a!=c && b!=c || a==c && a!=b && c!=b || b==c && b!=a && c!=a)
				System.out.println("This is an isosceles triangle.");
			else
				System.out.println("This is a scalane trangle.");
			
			double s=(a+b+c)/2;
			double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("Area of the triangle is "+area);
		}
		else
			System.out.println("These are not the sides of a triangle");

	}

}

//Output:
//Set 1:
//Enter first coordinate
//Enter value of x: 
//0
//Enter value of y: 
//0
//Enter second coordinate
//Enter value of x: 
//0
//Enter value of y: 
//6
//Enter third coordinate
//Enter value of x: 
//5
//Enter value of y: 
//0
//The sides of the triangle are:
//AB = 6.0
//AC = 5.0
//BC = 7.810249675906654
//These are the sides of a triangle.
//This is a scalane trangle.
//Area of the triangle is 15.0
//Set 2:
//Enter first coordinate
//Enter value of x: 
//6
//Enter value of y: 
//7
//Enter second coordinate
//Enter value of x: 
//8
//Enter value of y: 
//4
//Enter third coordinate
//Enter value of x: 
//5
//Enter value of y: 
//9
//The sides of the triangle are:
//AB = 3.605551275463989
//AC = 2.23606797749979
//BC = 5.830951894845301
//These are the sides of a triangle.
//This is a scalane trangle.
//Area of the triangle is 0.5000000000000027

