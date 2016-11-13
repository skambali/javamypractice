package SampleBasicProg99;

import java.util.Scanner;

public class prg47_sumofIdividualDigit {
	public static void main(String [] args)
	{
		System.out.println("Sum of individual digits");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		int sum=0;
		while(num!=0)
		{
			int n=num%10;
			sum=sum+n;
			num=num/10;
		}
		System.out.println("Sum of individual no:"+sum);
		sc.close();
		
		
	}

}
