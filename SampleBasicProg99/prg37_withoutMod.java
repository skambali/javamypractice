package SampleBasicProg99;

import java.util.Scanner;

public class prg37_withoutMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner n=new Scanner(System.in);
		  System.out.println("enter the Divisor:");
			 
		  int a=n.nextInt();
		  System.out.println("enter the Divident:");
			 
		  int b=n.nextInt();
	 
		 
		/* int a = 10;
		    int b = 5;
*/
		    int c = a%b;
		 //   int d = a - (a/b)*b;
		 int d=   a - b * (a/b);
		  
		//  int d=a *(a/b)-b;
		    System.out.println(c);
		    System.out.println(d);
		}

	}


