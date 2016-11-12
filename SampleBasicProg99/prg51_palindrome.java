package SampleBasicProg99;

import java.util.Scanner;

public class prg51_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num=new Scanner(System.in);
		System.out.println("enter the number to check its palindrome:");
		int number=num.nextInt();
		
		int temp=number;
		int reverse=0;
		while(number!=0){
			int reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		 	
		}
		
		if (temp==reverse){
			System.out.println("its a Palindrome:"+temp);
		}else{
			System.out.println("its NOT A Palindrome:"+temp);
			
		}

	}

}