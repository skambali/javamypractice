package SampleBasicProg99;

// To find the entered character is a digit or not

import java.util.Scanner;

public class prg19_upercases {
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		
		char ch=sc.next().charAt(0);
		
		if(ch>=97 && ch<=122)
			System.out.println("Entered character:-"   +ch + " is A LowerCase:");
		else
			System.out.println("Entered character:- " +ch + " is not a LowerCase:");
		sc.close();
				
		
	}
	

}
