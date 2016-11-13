package SampleBasicProg99;//Addition of two no's without using + operator

import java.util.Scanner;

public class prg9 {
	public static void main(String args[])
	{
		System .out.println("Addition of two nos without using + operator");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the vaues for a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int carry;
		while (b!=0)
		{
			carry=a&b;//
			a=a^b;
			b=carry<<1;
		}
System.out.println("sum="+a);
sc.close();
	}
}
