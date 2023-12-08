/*
 * 5. Write a program that outputs the name of the capital of the country entered at the
	command line. The program should throw a “NoMatchFoundException” when it fails to
	print the capital of the country entered at the command line.
 */


package Pdf7_Exception;
class NoMatchFoundException_Country extends Exception{
	private String errMsg;
	NoMatchFoundException_Country(String con){
		super();
		String msg = (con+" is not found");
		this.errMsg=msg;
	}
	public String getMessage() {
		return errMsg;
	}
	
}
public class Pdf7_qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country[] = {"Australia","Bangladesh","Brazil","India","Fizi" };
		String capital[] = {"Canberra","Dhaka","Brasilia","New Delhi","Suva"};
		boolean f = false;
		try {
			String con = args[0];
			
			for(int i=0;i<country.length;i++) {
				if(con.equalsIgnoreCase(country[i])) {
					f = true;
					System.out.println("The capital of the country "+con+" is "+capital[i]);
					break;
				}
			}
			
			if(f == false) {
				throw new NoMatchFoundException_Country(con);
			}
		}catch(NoMatchFoundException_Country e) {
			System.out.println("Exception handled....");
			System.out.println("Exception is : "+e);
			System.out.println("The message is : "+e.getMessage());
		}

	}

}

/*
 * Output :
 * Set 1:
 * The capital of the country India is New Delhi
 * Set 2:
 * 	Exception handled....
	Exception is : Pdf7_Exception.NoMatchFoundException_Country: USA is not found
	The message is : USA is not found


 */

