package SampleBasicProg99;

import java.util.Scanner;

public class prg39_Factorial {
	public static void main(String ...args)
	{
		System.out.println("Factorial of a given number");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: \n");
		int num=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a given number is:"+fact);
		sc.close();
	}

}
