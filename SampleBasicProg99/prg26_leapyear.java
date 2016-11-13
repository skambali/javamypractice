package SampleBasicProg99;

import java.util.Scanner;

public class prg26_leapyear {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year to check is Leap Year:");
		int year= sc.nextInt();
		
		/*Logic 
		 * number should be divisible by 4 
		 * 
		 * 
		 * divisible by 400
		 * but not from 100
		 * ex: 2004
		 * 1900 its divisible by 4 but not from 400
		 * 
		 * */
		//
		
	
		if( ((year%4)==0) ||((year%400)==0) && ((year%100)!=0)){
	
	
	System.out.println("Leap year" +year);
		 } else{
				System.out.println("It Not a Leap year" +year);
				
		 }
				
	}
}
