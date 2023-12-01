/*
	3. Create a private inner class that implements a public interface. Write a method that
	returns a reference to an instance of the private inner class, up cast to the interface. Show
	that the inner class is completely hidden by trying to downcast to it.
 */

package Pdf6;
interface Myinterface{
	void somemethod();
	
}

class Outerclass{
	Outerclass(){
		System.out.println("outerclass created....");
	}
	private class Innerclass implements Myinterface{
		public Innerclass() {
			System.out.println("Innerclass creted.....");
		}
		@Override
		public void somemethod() {
			// TODO Auto-generated method stub
			System.out.println("In private innerclass method....");
		}
		
	}
	
	
	public Myinterface getinnerclassobject() {
		return new Innerclass();
	}
	
	//Method attempting to downcasting to the private innerclass (will fail)
	public void downcastingobject(Myinterface obj) {
		//Attempting to downcast to privateinnerclass
		//This will return in a compile - time error as Private innerclass is not accessible here
		//Innerclass ob = (Innerclass) obj;
		//Uncommenting this line will result in a complication error
		System.out.println("Downcast to privateInnerclass attemptor");
	}
}
public class Pdf6_qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outerclass out = new Outerclass();
		
		//Get reference to the innerclass object, upcast to the interface
		Myinterface in = out.getinnerclassobject();
		
		in.somemethod();
		out.downcastingobject(in);
	}

}

/*
 * Output :
	outerclass created....
	Innerclass creted.....
	In private innerclass method....
	Downcast to privateInnerclass attemptor

 * 
 */
