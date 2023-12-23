package Pdf9;

import java.util.Arrays;

class SecondMinMax<T extends Comparable<T>>{
	public Pair<T,T> findsecondminmax(T[] arr){
		if(arr ==null || arr.length<2) {
			new IllegalArgumentException("The array must contain atleast 2 elements ....");
			
		}
		
		Arrays.sort(arr);
		T secondmin = arr[1];
		T secondmax = arr[arr.length-2];
		
		return new Pair<>(secondmin, secondmax);
	}
}

class Pair<X,Y>{
	X firstno;
	Y secondno;
	Pair(X firstno, Y secondno){
		this.firstno = firstno;
		this.secondno = secondno;
	}
	
	X getfirstno() {
		return firstno;
	}
	Y getsecondno() {
		return secondno;
	}
	
}
public class Pdf9_qs4{
	public static void main(String[] args) {
		Integer arr[] = {3,2,4,5,7,6,8,10,9};
		SecondMinMax sm = new SecondMinMax();
		Pair p = sm.findsecondminmax(arr);
		System.out.println("Second minimum element is : "+p.getfirstno());
		System.out.println("Second maximum element is : "+p.getsecondno());
	}
}

/*Output
 * 	Second minimum element is : 3
	Second maximum element is : 9

 * 
 * 
 * 
 * */
 