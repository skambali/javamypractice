package SampleBasicProg99;//Maximum of two nos


import java.util.Scanner;

public class prg14 {
	public static void main(String args[])
	{
		System .out.println("Finding maximumof two numbers");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the values for a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b)
			System.out.println("a is maximum");
		else
			System.out.println("b is maximum");
		sc.close();
	}
}
