package SampleBasicProg99;

// To find the entered character is a digit or not

import java.util.Scanner;

public class prg18_digitornot {
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		
		char ch=sc.next().charAt(0);
		
		if(ch>=48 && ch<=57)
			System.out.println("Entered character is a digit ");
		else
			System.out.println("Entered character is not a digit ");
		sc.close();
				
		
	}
	

}
