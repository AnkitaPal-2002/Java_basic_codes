//An election is contested by 5 candidates. The candidates are numbered 1-5 and the voting 
//is done by marking the candidate number on the ballot paper. Write a program to read the 
//ballots and count the votes casts for each candidate using an array variable count. In case, 
//a number read is outside the range 1 – 5, the ballot should be considered as a ‘spoilt ballot’ 
//and the program should also count the number of spoilt ballot.

package java_info_cls1;
import java.util.*;
public class Pdf2_q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of ballet papers ? ");
		int n = sc.nextInt();
		int b[] = new int[7];
		System.out.println("Press 1 for give vote to candidate 1");
		System.out.println("Press 2 for give vote to candidate 2");
		System.out.println("Press 3 for give vote to candidate 3");
		System.out.println("Press 4 for give vote to candidate 4");
		System.out.println("Press 5 for give vote to candidate 5");
		
		System.out.println("Please enter the candidate no of the ballot papers : ");
		for(int i=1;i<=n;i++) {
			System.out.print("At ballot paper"+i+" : ");
			int x = sc.nextInt();
			if(x==1) {
				b[x]+=1;
			}else if(x==2) {
				b[x]+=1;
			}else if(x==3) {
				b[x]+=1;
			}else if(x==4) {
				b[x]+=1;
			}else if(x==5) {
				b[x]+=1;
			}else {
				b[6]+=1;
			}
		}
		
		System.out.println("Counting of the votes : ");
		for(int i=1;i<=6;i++) {
			if(i>=1 && i<=5)
				System.out.println("Candidate"+i+" : "+b[i]);
			else
				System.out.println("Spoilt ballot = "+b[6]);
		}
	}

}

//Output:
//	No. of ballet papers ? 
//			12
//			Press 1 for give vote to candidate 1
//			Press 2 for give vote to candidate 2
//			Press 3 for give vote to candidate 3
//			Press 4 for give vote to candidate 4
//			Press 5 for give vote to candidate 5
//			Please enter the candidate no of the ballot papers : 
//			At ballot paper1 : 1
//			At ballot paper2 : 1
//			At ballot paper3 : 3
//			At ballot paper4 : 2
//			At ballot paper5 : 4
//			At ballot paper6 : 3
//			At ballot paper7 : 4
//			At ballot paper8 : 2
//			At ballot paper9 : 8
//			At ballot paper10 : 5
//			At ballot paper11 : 2
//			At ballot paper12 : 10
//			Counting of the votes : 
//			Candidate1 : 2
//			Candidate2 : 3
//			Candidate3 : 2
//			Candidate4 : 2
//			Candidate5 : 1
//			Spoilt ballot = 2
