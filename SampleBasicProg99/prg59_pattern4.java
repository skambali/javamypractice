package SampleBasicProg99;

import java.util.Scanner;

public class prg59_pattern4 {
	public static void main(String[]args)
	{
		System.out.println("PATTERN");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			int n=i%2==0?0:1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+"");
				n=n==0?1:0;
			}
			System.out.println();
		}
		sc.close();
		
		
	}

}
