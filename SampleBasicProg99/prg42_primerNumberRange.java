package SampleBasicProg99;

import java.util.Scanner;

public class prg42_primerNumberRange {

	 
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Number to check the prime Number or Not: StartinRange");
				int n=sc.nextInt();
				System.out.println("Enter the Number to check the prime Number or Not: Ending range");
				int y=sc.nextInt();
				 
				int count =0;
				for(int i=n;i<=y;i++){
					for(int j=2;j<=i;j++){
						if(i==j){
							System.out.println("Number is Primer Number--"+i);
							count++;
						}
						//Mod of same number is zero
						if(i%j==0){
							break;
						}
						
					}
				}
				
				count=count+1;
				System.out.println("Total NUmber of Prime Number is"+count);
				
				
			}

	}


