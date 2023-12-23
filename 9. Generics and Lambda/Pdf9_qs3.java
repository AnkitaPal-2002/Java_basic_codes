package Pdf9;
import java.util.Arrays;
public class Pdf9_qs3 {
	public static <T extends Comparable<T>> void sort(T[] arr) {
		Arrays.sort(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer intarr[] = {3,5,7,4,2};
		Double doubarr[] = {3.8,5.3,7.9,4.2,20.0};
		
		sort(intarr);
		sort(doubarr);
		
		System.out.println("Integer array after sorting : "+Arrays.toString(intarr));
		System.out.println("Double array after sorting : "+Arrays.toString(doubarr));

	}

}

/*
Output:
Integer array after sorting : [2, 3, 4, 5, 7]
Double array after sorting : [3.8, 4.2, 5.3, 7.9, 20.0]

*/