package SampleBasicProg99;

import java.util.Scanner;

public class prg50_reverseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		System.out.println("enter number you want to revearse:");
		int number=in.nextInt();		
		int reverse=0;
		int reminder;
		//12
		while(number!=0){
			reminder=number%10;//2//1
			reverse=reverse*10+reminder;//2//21
			number=number/10;//1.2//
			
		}
		
		System.out.println("Reverse number is:"+reverse);
		
		in.close();
		 

	}

}
