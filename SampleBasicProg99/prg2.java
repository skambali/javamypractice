package SampleBasicProg99;
//to read integer value

import java.util.Scanner;

public class prg2 {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the integer value:");
		int a= sc.nextInt(); 
		System.out.println("The entered value is:"+a);
		sc.close();
	}

}
