package org.shapes;

public class Circle {
	private double r;
	public Circle(double r){
		this.r=r;
	}
	
	public void area() {
		double a = Math.PI*this.r*this.r;
		System.out.println("The area of the circle is : "+a);
	}
	
	public void perimeter() {
		double p = 2*Math.PI*this.r;
		System.out.println("The perimeter of the circle is : "+p);
	}
}
