/*
		4. Create an interface Department containing attributes deptName and deptHead. It also
		has abstract methods for getting data and printing the attributes. Create a class hostel
		containing hostelName, hostelLocation and numberofRooms. The class contains methods
		for getting and printing the attributes. Then write Student class extending the Hostel
		class and implementing the Department interface. This class contains attributes
		studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and
		printData methods for this class. Also implement the abstract methods of the Department
		interface. Write a driver class to test the Student class. The program should be menu
		driven containing the options:
		i) Admit new student
		ii) Migrate a student
		iii) Display details of a student
		For the third option a search is to be made on the basis of the entered registration number.
 * 
 * 
 */


package Pdf6;
import java.util.*;

interface Department{
	public static final String DeptName = "Computer Science";
	public static final String DeptHead = "ABC";
	String getData();
	void printData();
}

class Hostel{
	String hostelName;
	String hostelLocation;
	int numberofRooms;
	
	public Hostel(String hostelName, String hostelLocation, int numberofRooms) {
		super();
		this.hostelName = hostelName;
		this.hostelLocation = hostelLocation;
		this.numberofRooms = numberofRooms;
	}
	
	public Hostel(Hostel ht) {
		super();
		this.hostelName = ht.hostelName;
		this.hostelLocation = ht.hostelLocation;
		this.numberofRooms = ht.numberofRooms;
	}
	
	public String getHostelName() {
		return hostelName;
	}
	public String getHostelLocation() {
		return hostelLocation;
	}
	public int getNumberofRooms() {
		return numberofRooms;
	}
	@Override
	public String toString() {
		return "Hostel [hostelName=" + hostelName + ", hostelLocation=" + hostelLocation + ", numberofRooms="
				+ numberofRooms + "]";
	}
	public String getData() {
		return "Hostel [hostelName=" + hostelName + ", hostelLocation=" + hostelLocation + ", numberofRooms="
				+ numberofRooms + "]";
	}
	
	public void printData() {
		System.out.println(this.toString());
	}
	
}

class Student extends Hostel implements Department{
	String studentName;
	int regdNo;
	String electiveSubject;
	float avgMarks;
	
	
	public Student(String hostelName, String hostelLocation, int numberofRooms, String studentName, int regdNo,
			String electiveSubject, float avgMarks) {
		super(hostelName, hostelLocation, numberofRooms);
		this.studentName = studentName;
		this.regdNo = regdNo;
		this.electiveSubject = electiveSubject;
		this.avgMarks = avgMarks;
	}
	
	public Student(Hostel ht,String studentName, int regdNo, String electiveSubject, float avgMarks) {
		super(ht);
		this.studentName = studentName;
		this.regdNo = regdNo;
		this.electiveSubject = electiveSubject;
		this.avgMarks = avgMarks;
	}
	

	
	

	@Override
	public void printData() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
		
	}


	@Override
	public String getData() {
		return "Student [studentName=" + studentName + ", regdNo=" + regdNo + ", electiveSubject=" + electiveSubject
				+ ", avgMarks=" + avgMarks + ", hostelName=" + hostelName + ", hostelLocation=" + hostelLocation
				+ ", numberofRooms=" + numberofRooms + "]";
	}
	
}
public class Pdf6_qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student capacity : ");
		int n = sc.nextInt();
		
		

	}

}
