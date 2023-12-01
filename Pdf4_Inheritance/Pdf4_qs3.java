/*
 * Write a program to create a class named Vehicle having protected instance variables
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle
class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private
instance variables routeNumber in Bus and manufacturerName in Car and both of them
having showData ( ) method showing all details of Bus and Car respectively with content of
the super class’s showData ( ) method.
 */

package Pdf4;
class Vehicle{
	protected int regnNumber;
	protected double speed;
	protected String color;
	protected String ownerName;	
	Vehicle(){
		this.regnNumber=0;
		this.speed=0;
		this.color=null;
		this.ownerName=null;
	}
	Vehicle(int r, double s, String c, String o){
		this.regnNumber=r;
		this.speed=s;
		this.color=c;
		this.ownerName=o;
	}
	
	
	void showData() {
		System.out.println("This is a vehicle");
	}
	
}

//Bus
class Bus extends Vehicle{
	private int routeNumber;
	Bus(int r, double s, String c, String o,int rn){
		super(r,s,c,o);
		this.routeNumber=rn;
	}
	
	void showData() {
		super.showData();
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Bus [routeNumber=" + routeNumber + ", regnNumber=" + regnNumber + ", speed=" + speed + ", color="
				+ color + ", ownerName=" + ownerName + "]";
	}
}

//Car
class Car extends Vehicle{
	private String manufacturerName;
	Car(int r, double s, String c, String o,String mn){
		super(r,s,c,o);
		this.manufacturerName = mn;
	}
	
	void showData() {
		super.showData();
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Car [manufacturerName=" + manufacturerName + ", regnNumber=" + regnNumber + ", speed=" + speed
				+ ", color=" + color + ", ownerName=" + ownerName + "]";
	}
	
	

}

public class Pdf4_qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b = new Bus(123456,76.9,"Red","Ram",217);
		b.showData();
		
		Car c = new Car(456778902,100,"Pink","Jadu","Maruti");
		c.showData();

	}

}

/*
 * Output
 * 	
 * 	This is a vehicle
	Bus [routeNumber=217, regnNumber=123456, speed=76.9, color=Red, ownerName=Ram]
	This is a vehicle
	Car [manufacturerName=Maruti, regnNumber=456778902, speed=100.0, color=Pink, ownerName=Jadu]

 */
