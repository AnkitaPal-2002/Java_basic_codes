package Pdf6;
interface InterfaceA{
	public void methodA1();
	public void metodA2();
}
interface InterfaceB{
	public void methodB1();
	public void metodB2();
}
interface InterfaceC{
	public void methodC1();
	public void metodC2();
}

interface Newinterface extends InterfaceA, InterfaceB, InterfaceC{
	public void newmethod();
	
}

class Concreteclass{
	Concreteclass(){
		System.out.println("Concreteclass created");
	}
}

class Myclass extends Concreteclass implements Newinterface{
	
	Myclass(){
		System.out.println("Myclass created...");
	}
	@Override
	public void methodA1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodA2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodB1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodB2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodC2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newmethod() {
		// TODO Auto-generated method stub
		
	}
	
	public void methodforinterfaceA(InterfaceA obj) {
		System.out.println("Object of interface A is passed....");
	}
	public void methodforinterfaceB(InterfaceB obj) {
		System.out.println("Object of interface B is passed....");
	}
	public void methodforinterfaceC(InterfaceC obj) {
		System.out.println("Object of interface C is passed....");
	}
	public void methodfornewinterface(Newinterface obj) {
		System.out.println("Object of New interface  is passed....");
	}
	
	}
	

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass ob = new Myclass();
		ob.methodforinterfaceA(ob);
		ob.methodforinterfaceB(ob);
		ob.methodforinterfaceC(ob);
		ob.methodfornewinterface(ob);
	}

}

/*
 * Output :
 * 	Concreteclass created
	Myclass created...
	Object of interface A is passed....
	Object of interface B is passed....
	Object of interface C is passed....
	Object of New interface  is passed....

 * 
 */
