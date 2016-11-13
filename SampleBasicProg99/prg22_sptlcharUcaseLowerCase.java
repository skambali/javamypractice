package SampleBasicProg99;

// To find the entered character is a digit or not

import java.util.Scanner;

public class prg22_sptlcharUcaseLowerCase {
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		 if((ch>=97 && ch<=122)){
			 System.out.println("Entered character:-"   +ch + " is a LowerCase:");
		 }else  if((ch>=65 && ch<=90)){
			 System.out.println("Entered character:-"   +ch + " is a  UpperCase:");
				
		 }else  if((ch>=48 && ch<=57)){
			 System.out.println("Entered character:-"   +ch + " is a Number:");
							
		 }
		 else{
				System.out.println("Entered character:-"   +ch + " is a Sptl character:");
					 
		 }
		 
			 
		 	
		sc.close();
				
		
	}
	

}
