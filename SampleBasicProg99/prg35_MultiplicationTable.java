package SampleBasicProg99;

import java.util.Scanner;

public class prg35_MultiplicationTable {
	public static void main(String []args)
	{
		System.out.println("Multiplication Table");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int mul=n*i;
			System.out.println(n+"*"+i+"="+mul);
		}
		sc.close();
	}

}
