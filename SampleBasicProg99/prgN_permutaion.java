/**
 * 
 */
package SampleBasicProg99;

import java.util.Scanner;

/**
 * @author rkambali
 *
 */
public class prgN_permutaion {
	
	void swap(String[] a, String[] b){
		String[] temp;
		temp=a;
		a=b;
		b=temp;
	}
	/* Function to print permutations of string
	   This function takes three parameters:
	   1. String
	   2. Starting index of the string
	   3. Ending index of the string. */
	void permute(String[] a, int l, int r)
	{
	   int i;
	   if (l == r)
	     System.out.println(a);
	   else
	   {
	       for (i = l; i <= r; i++)
	       {
	        /*  swap((a+l), (a+i));
	          permute(a, l+1, r);
	          swap((a+l), (a+i)); //backtrack
*/	       }
	   }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// char[]  ar={"A","B","C"};
		 String[]  ar={"ABC"};
			
		// ar={"A","B","C"};
		 int n=ar.length;
		 
		 prgN_permutaion per= new prgN_permutaion();
		 per.permute(ar, 0, n-1);
		 
		 
	}

}
