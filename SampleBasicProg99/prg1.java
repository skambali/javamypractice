package SampleBasicProg99;
// to read a string from user

import java.util.Scanner;

public class prg1 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a good string value:");
		String str=sc.next();
		System.out.print("The entered string is:"+str);
		sc.close();
	}
}
