package SampleBasicProg99;

import java.util.Scanner;

public class prg36_Quotient {
	public static void main(String []args)
	{
		System.out.println("Quotient for the given no without using operator /");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int quo=0;
		while(n1>=n2)
		{
			n1-=n2;
			quo+=1;
		}
		System.out.println("Quotient is:"+quo);
		sc.close();
	}

}
