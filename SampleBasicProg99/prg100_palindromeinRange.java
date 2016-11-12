
package SampleBasicProg99;

import java.util.Scanner;

public class prg100_palindromeinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num=new Scanner(System.in);
		System.out.println("enter the 1 number to check its palindrome:");
		int number1=num.nextInt();
		System.out.println("enter the 2 number to check its palindrome:");
		int number2=num.nextInt();
	 
		int reverse = 0,count=0;
		int temp;
		
		for(int i=number1;i<=number2;i++){
			
			 temp=i;
		 
		while(temp!=0){
			int reminder=temp%10;
			reverse=reverse*10+reminder;
			temp=temp/10;
		 	
		}
		
		if (i==reverse){
			System.out.println(i +" ");
			 count++;
		} 
		reverse=0;
		}
		System.out.println("total palindrome in this Range is:" +count);
	}

}
