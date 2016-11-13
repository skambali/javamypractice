package SampleBasicProg99;

import java.util.Scanner;

public class prg43_Fibanocciseries {
	public static void main(String []args)
	{
		System.out.println("Fibanocii Series");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+"\t"+n2+"\t");
		int sum;
		for(int i=2;i<num;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
			System.out.print(sum+"\t");
		}
		sc.close();
	}
	

}
