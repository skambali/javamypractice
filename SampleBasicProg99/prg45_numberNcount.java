package SampleBasicProg99;

import java.util.Scanner;

public class prg45_numberNcount {

	public static void main(String[] args){
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int number= sc.nextInt();
		int count=0;
	
		 while(number!=0){
			 count ++;
			 number=number/10;
			 
		 }
		 
		 System.out.println("total number is:"  +count);
		 sc.close();
		
	}
}
