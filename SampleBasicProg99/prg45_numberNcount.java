package SampleBasicProg99;

import java.util.Scanner;

public class prg45_numberNcount {

	public static void main(String[] args){
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int number= sc.nextInt();
		int count=0;
	//30
		 while(number!=0){
			 count ++;//1//2
			 number=number/10;//3
			 
		 }
		 
		 System.out.println("total number is:"  +count);
		
	}
}
