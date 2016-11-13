package SampleBasicProg99;

import java.util.Scanner;

public class prg61_PatternofDigits {
	public static void main(String ...args)
	{
		System.out.println("Pattern of Digits");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for n");
		int n=sc.nextInt();
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+"\t");
		       num++;
		        
			}
			
			System.out.println("");
		}
		sc.close();
	}
}
