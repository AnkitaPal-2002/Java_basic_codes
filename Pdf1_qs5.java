//Write a program to find the prime factors of the given number . (e.g. Input : 315 Output: 3 3 
//5 7)

package java_info_cls1;


import java.util.*;
import java.lang.Math;

public class Pdf1_qs5 {

   public static int isprime(int n){

      for(int i = 2; i<=Math.sqrt(n); i++){
        if(n%i==0)
          return 0;
      }

      return 1;
   }

   public static void primeFactors(int n)
   {

      for(int i = 2; i<= n; i++){
          if(isprime(i)==1){
             int x = n;
             while(x%i==0){
                System.out.print(i + " ");
                x /= i;
             }
          }
       }

   }

   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter any number : ");
       int n = sc.nextInt();
       System.out.println("Prime factors of "+n+" are : ");
       primeFactors(n);
   }
}

/* Output
 * 	Set 1:
 * 		Enter any number : 315
		Prime factors of 315 are : 
		3 3 5 7 
	Set 2:
		Enter any number : 90
		Prime factors of 90 are : 
		2 3 3 5 
 */
