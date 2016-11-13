package SampleBasicProg99;

import java.util.Scanner;

public class prg53_armstringInRange {
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
			Scanner sc= new Scanner(System.in);
			int a;
			
			int c=0;
			System.out.println("enter the number to check its Armstrongs:");
			int number1=sc.nextInt();
			System.out.println("enter the 2 number Range to check its Armstrongs:");
			int number2=sc.nextInt();
			 	 
		for(int  i=number1;i<=number2;i++)
		{
			 
			 int n=i;
		while (n!=0)
		{
		
	    	a=n%10;//get last digit
	    	    	c=c+(a*a*a);//armstrong logic
	    	n=n/10;
	    	
	   }
	    
		if (c==i)
	    {
	 System.out.println(i+" ");
         }
	    c=0;
		}
sc.close();		
}
}
