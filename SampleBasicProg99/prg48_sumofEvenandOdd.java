package SampleBasicProg99;

import java.util.Scanner;

public class prg48_sumofEvenandOdd {

	public static void main(String []args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			int number= sc.nextInt();
			
			int ecount=0;
			int ocount=0;
			int esum=0;
			int osum=0;
			
			while(number!=0)
			{
				int n=number%10;
				if(n%2==0)
				{
					System.out.println("Even:"+n);
					ecount++;
					
					esum=esum+n;
				}
				else
				{
					System.out.println("odd:"+n);
					ocount++;
					
					osum=osum+n;
				}
				number=number/10;
			}
			System.out.println("Total no of Even numbers:"+ecount);
			System.out.println("Total no of odd numbers:"+ocount);
			System.out.println("Sum of Even numbers:"+esum);
			System.out.println("Sum of Odd numbers:"+osum);
			
			sc.close();
			
		}
	}



