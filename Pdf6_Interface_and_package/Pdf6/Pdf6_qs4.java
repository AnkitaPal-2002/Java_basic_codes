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
	public static final String DeptName = "MCA";
	public static final String DeptHead = "Souvik Basu";
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
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public void setHostelLocation(String hostelLocation) {
		this.hostelLocation = hostelLocation;
	}

	public void setNumberofRooms(int numberofRooms) {
		this.numberofRooms = numberofRooms;
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
	double avgMarks;
	
	
	public Student(String hostelName, String hostelLocation, int numberofRooms, String studentName, int regdNo,
			String electiveSubject, double marks) {
		super(hostelName, hostelLocation, numberofRooms);
		this.studentName = studentName;
		this.regdNo = regdNo;
		this.electiveSubject = electiveSubject;
		this.avgMarks = marks;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRegdNo() {
		return regdNo;
	}

	public void setRegdNo(int regdNo) {
		this.regdNo = regdNo;
	}

	public String getElectiveSubject() {
		return electiveSubject;
	}

	public void setElectiveSubject(String electiveSubject) {
		this.electiveSubject = electiveSubject;
	}

	public double getAvgMarks() {
		return avgMarks;
	}

	public void setAvgMarks(float avgMarks) {
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
		//System.out.println(this.toString());
		System.out.println("Student details -->");
		System.out.println("Name : "+this.studentName);
		System.out.println("regdno : "+this.regdNo);
		System.out.println("Department name : "+this.DeptName);
		System.out.println("Department HOD : "+this.DeptHead);
		System.out.println("Elective subject : "+this.electiveSubject);
		System.out.println("Average marks : "+this.avgMarks);
		System.out.println("Hostel details : ");
		System.out.println("Hostel name : "+this.hostelName);
		System.out.println("Location : "+this.hostelLocation);
		System.out.println("No of rooms : "+this.numberofRooms);
		
		
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
		
		int regd = 1000;
		int i =0;
		Student s[] = new Student[n];
		
		while(true) {
			System.out.println("This system is made by Ankita Pal");
			System.out.println("Welcome to my system");
			System.out.println("---------------------------------------------------------");
			System.out.println("****MENU****");
			System.out.println("Choose any option : ");
			System.out.println("1. Admit a student");
			System.out.println("2. Migrate a student");
			System.out.println("3. Display details of a student");
			System.out.println("4. Exit");
			System.out.println("Please enter your choice : ");
			int c = sc.nextInt();
			switch(c) {
			case 1: System.out.println("****Admit new student****");
					System.out.println("Please enter the student details : ");
					sc.nextLine();
					System.out.println("Enter the name of the student : ");
			        String name = sc.nextLine();
			        System.out.println("Enter the elective subject : ");
			        String sub = sc.nextLine();
			        System.out.println("Enter the average marks : ");
			        double marks = sc.nextDouble();
			        System.out.println("Enter the hostel details : ");
			        sc.nextLine();
			        System.out.println("Enter the hostel name : ");
			        String hname = sc.nextLine();
			        System.out.println("Enter the location of the hostel : ");
			        String location = sc.nextLine();
			        System.out.println("Enter the number of the rooms : ");
			        int no = sc.nextInt();
			        s[i] = new Student(hname,location,no,name,regd,sub,marks);
			        System.out.println("Please note down your details : ");
			        s[i].printData();
			        i++;
			        regd++;
			        break;
			case 2: System.out.println("****Migration of the student****");
					System.out.println("Enter the registration no : ");
					int r = sc.nextInt();
					boolean f = false;
			        for(int j=0;j<i;j++) {
			        	if(s[j].regdNo == r) {
			        		System.out.println("Hello "+s[j].studentName);
			        		sc.nextLine();
			        		System.out.println("Enter the new hostel name : ");
			        		String htname = sc.nextLine();
			        		System.out.println("Enter the new hostel location : ");
			        		String loc = sc.nextLine();
			        		System.out.println("Enter the no of the rooms : ");
			        		int room = sc.nextInt();
			        		s[j].setHostelName(htname);
			        		s[j].setHostelLocation(loc);
			        		s[j].setNumberofRooms(room);
			        		System.out.println("Migration of the student successfully done.....");
			        		System.out.println("Please note down the student details :");
			        		s[j].printData();
			        		f = true;
			        		break;
			        	}
			        }
			        
			        if(f == false) {
			        	System.out.println("Student does not exist....");
			        }
			        
			        break;
			case 3: System.out.println("Enter the registration no : ");
			        int rn = sc.nextInt();
			        boolean fl = false;
			        for(int j=0;j<i;j++) {
			        	if(s[j].regdNo == rn) {
			        		s[j].printData();
			        		fl = true;
			        		break;
			        	}
			        }
			        
			        if(fl == false) {
			        	System.out.println("Student does not exist....");
			        }
			        
			        break;
			case 4: System.out.println("Thank you for using this program....");
			        System.exit(0);
			        break;
			default : System.out.println("Invalis choice.....Please enter valid choice from the next time.....");
			        
			}
			
		}
		
		
		
		

	}

}


/*
 * Output :
		Enter the student capacity : 
		1000
		This system is made by Ankita Pal
		Welcome to my system
		---------------------------------------------------------
		****MENU****
		Choose any option : 
		1. Admit a student
		2. Migrate a student
		3. Display details of a student
		4. Exit
		Please enter your choice : 
		1
		****Admit new student****
		Please enter the student details : 
		Enter the name of the student : 
		Ankita Pal
		Enter the elective subject : 
		Mathemetics
		Enter the average marks : 
		90
		Enter the hostel details : 
		Enter the hostel name : 
		Heritage Hostel
		Enter the location of the hostel : 
		Anandapur, Kolkata
		Enter the number of the rooms : 
		100
		Please note down your details : 
		Student details -->
		Name : Ankita Pal
		regdno : 1000
		Department name : MCA
		Department HOD : Souvik Basu
		Elective subject : Mathemetics
		Average marks : 90.0
		Hostel details : 
		Hostel name : Heritage Hostel
		Location : Anandapur, Kolkata
		No of rooms : 100
		This system is made by Ankita Pal
		Welcome to my system
		---------------------------------------------------------
		****MENU****
		Choose any option : 
		1. Admit a student
		2. Migrate a student
		3. Display details of a student
		4. Exit
		Please enter your choice : 
		1
		****Admit new student****
		Please enter the student details : 
		Enter the name of the student : 
		Uma Pal
		Enter the elective subject : 
		Physics
		Enter the average marks : 
		80
		Enter the hostel details : 
		Enter the hostel name : 
		Heritage Hostel
		Enter the location of the hostel : 
		Anandapur, Kolkata
		Enter the number of the rooms : 
		200
		Please note down your details : 
		Student details -->
		Name : Uma Pal
		regdno : 1001
		Department name : MCA
		Department HOD : Souvik Basu
		Elective subject : Physics
		Average marks : 80.0
		Hostel details : 
		Hostel name : Heritage Hostel
		Location : Anandapur, Kolkata
		No of rooms : 200
		This system is made by Ankita Pal
		Welcome to my system
		---------------------------------------------------------
		****MENU****
		Choose any option : 
		1. Admit a student
		2. Migrate a student
		3. Display details of a student
		4. Exit
		Please enter your choice : 
		3
		Enter the registration no : 
		1000
		Student details -->
		Name : Ankita Pal
		regdno : 1000
		Department name : MCA
		Department HOD : Souvik Basu
		Elective subject : Mathemetics
		Average marks : 90.0
		Hostel details : 
		Hostel name : Heritage Hostel
		Location : Anandapur, Kolkata
		No of rooms : 100
		This system is made by Ankita Pal
		Welcome to my system
		---------------------------------------------------------
		****MENU****
		Choose any option : 
		1. Admit a student
		2. Migrate a student
		3. Display details of a student
		4. Exit
		Please enter your choice : 
		3
		Enter the registration no : 
		1001
		Student details -->
		Name : Uma Pal
		regdno : 1001
		Department name : MCA
		Department HOD : Souvik Basu
		Elective subject : Physics
		Average marks : 80.0
		Hostel details : 
		Hostel name : Heritage Hostel
		Location : Anandapur, Kolkata
		No of rooms : 200
		This system is made by Ankita Pal
		Welcome to my system
		---------------------------------------------------------
		****MENU****
		Choose any option : 
		1. Admit a student
		2. Migrate a student
		3. Display details of a student
		4. Exit
		Please enter your choice : 
		2
		****Migration of the student****
		Enter the registration no : 
		1000
		Hello Ankita Pal
		Enter the new hostel name : 
		Ruby Hostel
		Enter the new hostel location : 
		Ruby Crossing
		Enter the no of the rooms : 
		100
		Migration of the student successfully done.....
		Please note down the student details :
		Student details -->
		Name : Ankita Pal
		regdno : 1000
		Department name : MCA
		Department HOD : Souvik Basu
		Elective subject : Mathemetics
		Average marks : 90.0
		Hostel details : 
		Hostel name : Ruby Hostel
		Location : Ruby Crossing
		No of rooms : 100
		This system is made by Ankita Pal
		Welcome to my system
		---------------------------------------------------------
		****MENU****
		Choose any option : 
		1. Admit a student
		2. Migrate a student
		3. Display details of a student
		4. Exit
		Please enter your choice : 
		3
		Enter the registration no : 
		1001
		Student details -->
		Name : Uma Pal
		regdno : 1001
		Department name : MCA
		Department HOD : Souvik Basu
		Elective subject : Physics
		Average marks : 80.0
		Hostel details : 
		Hostel name : Heritage Hostel
		Location : Anandapur, Kolkata
		No of rooms : 200
		This system is made by Ankita Pal
		Welcome to my system
		---------------------------------------------------------
		****MENU****
		Choose any option : 
		1. Admit a student
		2. Migrate a student
		3. Display details of a student
		4. Exit
		Please enter your choice : 
		3
		Enter the registration no : 
		1300
		Student does not exist....
		This system is made by Ankita Pal
		Welcome to my system
		---------------------------------------------------------
		****MENU****
		Choose any option : 
		1. Admit a student
		2. Migrate a student
		3. Display details of a student
		4. Exit
		Please enter your choice : 
		4
		Thank you for using this program....

 * 
 */
