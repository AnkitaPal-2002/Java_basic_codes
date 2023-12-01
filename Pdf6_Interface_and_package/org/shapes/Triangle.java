package org.shapes;

public class Triangle {
	private double s1;
	private double s2;
	private double s3;
	private double h;
	private double b;
	
	public Triangle(double s1, double s2, double s3, double b , double h){
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.b=b;
		this.h=h;
		
	}
	
	public void area() {
		double a = (this.b*this.h)/2;
		
		System.out.println("The area of the traingle is : "+a);
	}
	
	public void perimeter() {
		double p = this.s1+this.s2+this.s3;
		
		System.out.println("The perimeter of the triangle is : "+p);
	}
}
