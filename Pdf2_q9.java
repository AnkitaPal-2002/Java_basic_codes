//Write a program to find the elements, a [i, j] in a two-dimensional array which are 
//maximum element to the ith row and jth column.

package java_info_cls1;
import java.util.*;
public class Pdf2_q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of the rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the no of the cols : ");
		int c = sc.nextInt();
		
		int a[][] = new int[r][c];
		System.out.println("Enter the data : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("The 2-d array is : ");
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		int max=a[0][0];
		int maxi=0;
		int maxj=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(max<=a[i][j]) {
					max=a[i][j];
					maxi=i;
					maxj=j;
				}
			}
		}
		
		//Display the maximum element
		System.out.println("Maximum element is : "+max);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(max == a[i][j]) {
					System.out.println("It is situated at "+i+"th row and "+j+"th column");
				}
			}
		}
		
		
		//System.out.println("Maximum element is : "+max+" at "+maxi+"th row and "+maxj+"th col");
	}
}

//Output :
//	Enter the no of the rows : 3
//	Enter the no of the cols : 3
//	Enter the data : 
//	a[0][0] : 4
//	a[0][1] : 7
//	a[0][2] : 5
//	a[1][0] : 9
//	a[1][1] : 8
//	a[1][2] : 3
//	a[2][0] : 9
//	a[2][1] : 5
//	a[2][2] : 9
//	The 2-d array is : 
//	4 7 5 
//	9 8 3 
//	9 5 9 
//	Maximum element is : 9
//	It is situated at 1th row and 0th column
//	It is situated at 2th row and 0th column
//	It is situated at 2th row and 2th column

