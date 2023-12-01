package Myclasspackage;
import Mypackageinterface.Myinterface;

public class Myclass {
	public Myclass(){
		System.out.println("Myclass created....");
	}
	protected class Innerclass implements Myinterface{
		
		

		public Innerclass() {
			// TODO Auto-generated constructor stub
			System.out.println("Innerclass created....");
		}

		@Override
		public void some_method() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
