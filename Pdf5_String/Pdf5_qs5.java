/*
 * 
 * 5. Write a Java class called ArrayExample to declare an array of String objects called
Products of the size 10, assign values to each element while declarations and print and
sort them.
 */

package Pdf5;

public class Pdf5_qs5 {
	public static void main(String[] args) {
		String [] Products = {"Product1","Product2","Product3","Product4","Product5","Product6","Product7","Product8","Product9","Product10"};
		//Print this array
		System.out.println("The array of the string is : ");
		for(String word: Products) {
			System.out.print(word+" ");
		}
		System.out.println();
		
		//sort the array
		for(int i=0;i<Products.length;i++) {
			for(int j=i+1;j<Products.length;j++) {
				if(Products[i].compareTo(Products[j])>0) {
					//swap
					String t = Products[i];
					Products[i] = Products[j];
					Products[j] = t;
				}
			}
		}
		
		//Display the sorted array
		System.out.println("The sorted array is : ");
		for(String word: Products) {
			System.out.print(word+" ");
		}
		System.out.println();
	}
	

}

/*
 * Output:
 * 	The array of the string is : 
	Product1 Product2 Product3 Product4 Product5 Product6 Product7 Product8 Product9 Product10 
	The sorted array is : 
	Product1 Product10 Product2 Product3 Product4 Product5 Product6 Product7 Product8 Product9 

 * 
 * 
 */
