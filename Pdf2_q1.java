//Given a list of marks (ranging from 0 to 100) of n (user input) students, write a program to 
//print the number of students who have obtain marks:
//(a) in the range 81 to 100 (b) in the range 61 to 80
//(c) in the range 41 to 60 (d) in the range 0 to 40



package java_info_cls1;
import java.util.*;
public class Pdf2_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the students : ");
		int n=sc.nextInt();
		if(n>=0 && n<=100) {
			int res[] = new int[4];
			Student1 s[]=new Student1[n];
			System.out.println("Enter the marks of the students : ");
			for(int i=0;i<n;i++) {
				System.out.print("Enter the marks of the student"+(i+1)+" : ");
				double m = sc.nextDouble();
				
				if(m>=0 && m<=40) {
					res[0] = res[0]+1;
				}else if(m>=41 && m<=60) {
					res[1] = res[1]+1;
				}else if(m>=61 && m<=80) {
					res[2] = res[2] + 1;
				}else if(m>=81 && m<=100) {
					res[3] = res[3]+1;
				}else {
					System.out.println("Please enter the marks between 0 to 100");
					m=0;
				}
				s[i] = new Student1(m);
			}
			
			System.out.println("Total number of the students who get the following nos ");
			for(int i=0;i<n;i++) {
				if(i==0) {
					System.out.println("0 - 40 : "+res[i]);
				}else if(i==1) {
					System.out.println("41 - 60 : "+res[i]);
				}else if(i==2) {
					System.out.println("61 - 80 : "+res[i]);
				}else if(i==3) {
					System.out.println("81 - 100 : "+res[i]);
				}
			}
		}else {
			System.out.println("Please give no of students between 0 to 100......");
		}
		
	}

}

//Output:
//	Enter the number of the students : 
//		10
//		Enter the marks of the students : 
//		Enter the marks of the student1 : 45
//		Enter the marks of the student2 : 60
//		Enter the marks of the student3 : 70.4
//		Enter the marks of the student4 : 78
//		Enter the marks of the student5 : 34
//		Enter the marks of the student6 : 89
//		Enter the marks of the student7 : 96
//		Enter the marks of the student8 : 45
//		Enter the marks of the student9 : 79
//		Enter the marks of the student10 : 29
//		Total number of the students who get the following nos 
//		0 - 40 : 2
//		41 - 60 : 3
//		61 - 80 : 3
//		81 - 100 : 2

