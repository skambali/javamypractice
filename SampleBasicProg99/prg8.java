package SampleBasicProg99;//Addition of two no's

import java.util.Scanner;

public class prg8 {
	public static void main(String args[])
	{
		System .out.println("Addition of two nos");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the vaues for a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("result="+c);
        sc.close();
}

}