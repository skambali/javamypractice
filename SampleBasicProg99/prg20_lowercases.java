package SampleBasicProg99;

// To find the entered character is a digit or not

import java.util.Scanner;

public class prg20_lowercases {
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		
		char ch=sc.next().charAt(0);
		
		if(ch>=65 && ch<=90)
			System.out.println("Entered character is a UpperCase & its:" +ch);
		else
			System.out.println("Entered character is not a Uppercases & its:" +ch);
		sc.close();
				
		
	}
	

}
