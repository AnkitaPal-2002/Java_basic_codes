/*
 * Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone
from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override
these two methods in each of the derived classes to calculate the volume and whole surface
area of each type of three-dimensional objects. The dimensions of the objects are to be taken
from the users and passed through the respective constructors of each derived class. Write a
main method to test these classes.
 */

package Pdf4;
import java.util.*;
abstract class ThreeDObject{
	private int rad,height,len,wid,side;
	ThreeDObject(){
		this.rad=0;
		this.len=0;
		this.height=0;
		this.wid=0;
		this.side=0;
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	
	//For cylinder and cone
	ThreeDObject(int rad, int height){
		this.rad=rad;
		this.height=height;
	}
	
	//For Box
	ThreeDObject(int len, int height, int wid){
		this.len=len;
		this.height=height;
		this.wid=wid;
	}
	
	//for cube
	ThreeDObject(int side){
		this.side=side;
	}
	
	abstract void wholeSurfaceArea();
	abstract void volume();
}

//Box class
class Box extends ThreeDObject{
	Box(int l, int w, int h){
		super(l,h,w);
	}
	void wholeSurfaceArea() {
		int w = super.getWid();
		int h= super.getHeight();
		int l=super.getLen();
		
		int a = 2*((w*l)+(h*l)+(h*w));
		System.out.println("Total surface area of the box is : "+a);
	}
	void volume() {
		int w = super.getWid();
		int h= super.getHeight();
		int l=super.getLen();
		int v = w*h*l;
		System.out.println("The volume  of the box is : "+v);
		
	}
}


//Cube class
class Cube extends ThreeDObject{
	Cube(int side){
		super(side);
	}
	void wholeSurfaceArea() {
		int side = super.getSide();
		
		int a = 6*side*side;
		System.out.println("Total surface area of the cube is : "+a);
	}
	void volume() {
		
		int v = (int)Math.pow(super.getSide(), 3);
		System.out.println("The volume  of the cube is : "+v);
		
	}
}

//Cylinder class
class Cylinder extends ThreeDObject{
	Cylinder(int r, int h){
		super(r,h);
	}
	void wholeSurfaceArea() {
		int r = super.getRad();
		int h= super.getHeight();
		
		
		double a = (2*Math.PI*r*(r+h));
		System.out.println("Total surface area of the cylinder is : "+a);
	}
	void volume() {
		int r=super.getRad();
		int h= super.getHeight();
		
		double v = Math.PI+r*r*h;
		System.out.println("The volume  of the cylinder is : "+v);
		
	}
}

//Cone class
class Cone extends ThreeDObject{
	Cone(int r, int h){
		super(r,h);
	}
	void wholeSurfaceArea() {
		int r = super.getRad();
		int h= super.getHeight();
		double l = Math.sqrt((r*r)+(h*h));
		
		double a = Math.PI*r*(l+r);
		System.out.println("Total surface area of the cone is : "+a);
	}
	void volume() {
		int r=super.getRad();
		int h= super.getHeight();
		
		double v = (Math.PI*r*r*h)/3;
		System.out.println("The volume  of the cone is : "+v);
		
	}
}


public class Pdf4_qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b = new Box(2,3,4);
		b.wholeSurfaceArea();
		b.volume();
		
		Cube c =  new Cube(5);
		c.wholeSurfaceArea();
		c.volume();
		
		Cone co = new Cone(3,4);
		co.wholeSurfaceArea();
		co.volume();
		
		Cylinder cy = new Cylinder(2,5);
		cy.wholeSurfaceArea();
		cy.volume();

	}

}

/*
 * Output :
 * 	Total surface area of the box is : 52
	The volume  of the box is : 24
	Total surface area of the cube is : 150
	The volume  of the cube is : 125
	Total surface area of the cone is : 75.39822368615503
	The volume  of the cone is : 37.69911184307752
	Total surface area of the cylinder is : 87.96459430051421
	The volume  of the cylinder is : 23.141592653589793

 * 
 */
