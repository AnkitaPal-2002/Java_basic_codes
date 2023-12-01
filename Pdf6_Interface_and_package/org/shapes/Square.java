package org.shapes;

public class Square {
	private double side;
	public Square(double s){
		this.side=s;
	}
	
	public void area() {
		double a = this.side*this.side;
		System.out.println("The area of the square is : "+a);
	}
	
	public void perimeter() {
		double p = 4 * this.side;
		System.out.println("The perimeter of the square is : "+p);
	}
}
