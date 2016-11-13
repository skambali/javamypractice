package SampleBasicProg99;

// To find the entered character is a digit or not

import java.util.Scanner;

public class prg21_sptlchar {
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		boolean name = false;
		char ch=sc.next().charAt(0);
		 if((ch>=97 && ch<=122)){
			 name=true;  
		 }else  if((ch>=65 && ch<=90)){
			 name=true;
		 }else  if((ch>=48 && ch<=57)){
			 name=true;
		 }
		 else{
				System.out.println("Entered character:-"   +ch + " is A Sptl character:");
					 
		 }
		 
		 if (name) System.out.println("Entered character:-"   +ch + " is A NOT A Sptl character:");
			 
		 	
		sc.close();
				
		
	}
	

}
