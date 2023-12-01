


/*
 *  Consider an example of book shop which sells books & video tapes. It’s modeled by Book &
	Tape classes. These two classes are inherited from the abstract class called Media. The Media
	class has common data members such as title & publication. The Book class has data
	member for storing a no. of pages in a book & Tape class has the playing time in a tape. Each
	class will have method such as read ( ) & show ( ). Write a program that models this class
	hierarchy & processes objects using reference to base class only.
 *
 */
package Pdf4;
abstract class Media{
	protected String title;
	protected String publication;
	
	Media (String title, String publication){
		this.title = title;
		this.publication = publication;
	}
	public abstract void read();
	public abstract void show();
}

class Book extends Media{
	
	private int noOfpages;
	
	Book(String title, String publication ,int noOfpages){
		super(title, publication);
		this.noOfpages = noOfpages;
	}
	
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Reading  the book is "+ super.title);
	}
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Book Title : "+ super.title);
		System.out.println("Book Publication : "+ super.publication);
		System.out.println("Page Number : "+ this.noOfpages);
	}
}
class Tape  extends Media{
	
	private int timeOfPlaying;
	
	Tape(String title, String publication ,int timeOfPlaying){
		super(title, publication);
		this.timeOfPlaying = timeOfPlaying;
	}
	
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("The Title of the tape is "+ super.title);
	}
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Tape Title : "+ super.title);
		System.out.println("Tape Publication : "+ super.publication);
		System.out.println("Time of playing of the tape is  : "+ this.timeOfPlaying);
	}
}


public class Pdf4_qs5{

	
	public static void objRef(Media m){
		m.read();
		m.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media book = new Book("Hello world Book","Ankita Pal",100);
		Media tape = new Tape("Hello kolkata tape","Tuktuki Pal",70);
		objRef(book);
		System.out.println();
		objRef(tape);
	}

}

/*
 * Output:
 * 
	Reading  the book is Hello world Book
	Book Title : Hello world Book
	Book Publication : Ankita Pal
	Page Number : 100
	
	The Title of the tape is Hello kolkata tape
	Tape Title : Hello kolkata tape
	Tape Publication : Tuktuki Pal
	Time of playing of the tape is  : 70

 */
