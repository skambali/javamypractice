package SampleBasicProg99;

import java.util.Scanner;

public class prg41_PerfectNo {
	public static void main(String ...args)
	{
		System.out.println("Find a Perfect no....");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
				sum=sum+i;
		}
		if (sum==number)
			System.out.println("Number " +number+" is a perfect no");
		else
			System.out.println("Number "+number+" is not a perfect no");
		sc.close();
		}
		
		
	}


