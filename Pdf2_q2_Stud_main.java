//Admission to a professional course is subject to the following conditions:
//(a) marks in Mathematics >= 60 (b) marks in Physics >=50
//(c) marks in Chemistry >=40 (d) Total in all 3 subjects >=200
// (Or)
//Total in Maths & Physics>=150
// Given the marks in the 3 subjects of n (user input) students, write a program to process
// the applications to list the eligible candidates.
// 
package java_info_cls1;
import java.util.*;
public class Pdf2_q2_Stud_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of the students : ");
		int n =sc.nextInt();
		Student s[] = new Student[n];
		System.out.println("Enter the marks of the students : ");
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of student"+(i+1)+" : ");
			
			System.out.print("Enter the marks of the mathematics : ");
			double m=sc.nextDouble();
			System.out.print("Enter the marks of the physics : ");
			double p=sc.nextDouble();
			System.out.print("Enter the marks of the chemistry : ");
			double c=sc.nextDouble();
			s[i] = new Student(m,p,c);
		}
		System.out.println("The marks of the students : ");
		for(int i=0;i<n;i++) {
			System.out.println("Student"+(i+1)+" : "+s[i].toString());
		}
		
		for(int i=0;i<n;i++) {
			double sum = s[i].getMath()+s[i].getPhy()+s[i].getChem();
			double sum1= s[i].getMath()+s[i].getPhy();
			if((s[i].getMath()>=60 && s[i].getPhy()>=50 && s[i].getChem()>=40 && sum>=200) || sum1>=150) {
				System.out.println("Student"+(i+1)+" is eligible for taking admission");
			}

		}
		
	}

}

//Output:
//	Enter the number of the students : 3
//	Enter the marks of the students : 
//	Enter the marks of student1 : 
//	Enter the marks of the mathematics : 50
//	Enter the marks of the physics : 50
//	Enter the marks of the chemistry : 50
//	Enter the marks of student2 : 
//	Enter the marks of the mathematics : 50
//	Enter the marks of the physics : 100
//	Enter the marks of the chemistry : 30
//	Enter the marks of student3 : 
//	Enter the marks of the mathematics : 56
//	Enter the marks of the physics : 89
//	Enter the marks of the chemistry : 70
//	The marks of the students : 
//	Student1 : [math=50.0, phy=50.0, chem=50.0]
//	Student2 : [math=50.0, phy=100.0, chem=30.0]
//	Student3 : [math=56.0, phy=89.0, chem=70.0]
//	Student2 is eligible for taking admission
//
//	
