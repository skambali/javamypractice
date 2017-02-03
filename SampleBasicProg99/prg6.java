package SampleBasicProg99;

//Swapping without temporary variable

import java.util.Scanner;
public class prg6 {
	public static void main(String args[])
	{
		System .out.println("Swapping of two nos without using temporary variable");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the vaues for a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("values of a and b before swapping are:"+a+"\t"+b);
		// 5 10
		a=a+b;//15
		b=a-b;//15-10=5
		a=a-b;//15-5=10
		System.out.println("values of a and b after swapping are:"+a+"\t"+b);
		sc.close();
		
	}

}
