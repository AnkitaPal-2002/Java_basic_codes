
/*
 * Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle
and Square. Use Quadrilateral as the super class of the hierarchy. Specify the instance
variables and methods for each class. The private instance variables of Quadrilateral should
be the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that
instantiates objects of your classes and outputs each object's area (except Quadrilateral).
 */
package Pdf4;
abstract class Quadrilateral{
	private double x1, x2, x3, x4, y1, y2, y3, y4;
	Quadrilateral(double x1,double y1,double x2, double y2, double x3,double y3,double x4, double y4){
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
		this.y4=y4;
	}
	
	abstract void Area();
	@Override
	public String toString() {
		return "Coordinates [x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", y1=" + y1 + ", y2=" + y2
				+ ", y3=" + y3 + ", y4=" + y4 + "]";
	}
}

//Trapezoid
class Trapezoid extends Quadrilateral{
	Trapezoid(double x1,double y1,double x2, double y2, double x3,double y3,double x4, double y4){
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	void Area() {
		System.out.println("In Trapezoid");
		System.out.println(super.toString());
	}
}

//Parallelogram
class Parallelogram extends Quadrilateral{
	Parallelogram(double x1,double y1,double x2, double y2, double x3,double y3,double x4, double y4){
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	void Area() {
		System.out.println("In Parallelogram");
		System.out.println(super.toString());
	}
}

//Rectangle
class Rectangle extends Quadrilateral{
	Rectangle(double x1,double y1,double x2, double y2, double x3,double y3,double x4, double y4){
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	void Area() {
		System.out.println("In Rectangle");
		System.out.println(super.toString());
	}
}


//Square
class Square extends Quadrilateral{
	Square(double x1,double y1,double x2, double y2, double x3,double y3,double x4, double y4){
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	void Area() {
		System.out.println("In Square");
		System.out.println(super.toString());
	}
}

public class Pdf4_qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trapezoid t = new Trapezoid(1,2,3,4,5,6,7,8);
		t.Area();
		Parallelogram p =new Parallelogram(2,4,6,7,3,8,9,10);
		p.Area();
		Rectangle r =new Rectangle(2,4,6,7,3,8,9,10);
		r.Area();
		Square s =new Square(2,4,6,7,3,8,9,10);
		s.Area();
		
	}

}

/*
 * 
 * Output:
 * 
 * 	set 1:
 * In Trapezoid
Coordinates [x1=1.0, x2=3.0, x3=5.0, x4=7.0, y1=2.0, y2=4.0, y3=6.0, y4=8.0]
In Parallelogram
Coordinates [x1=2.0, x2=6.0, x3=3.0, x4=9.0, y1=4.0, y2=7.0, y3=8.0, y4=10.0]
In Rectangle
Coordinates [x1=2.0, x2=6.0, x3=3.0, x4=9.0, y1=4.0, y2=7.0, y3=8.0, y4=10.0]
In Square
Coordinates [x1=2.0, x2=6.0, x3=3.0, x4=9.0, y1=4.0, y2=7.0, y3=8.0, y4=10.0]

 * 
 */

