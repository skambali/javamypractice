package SampleBasicProg99;

import java.util.Scanner;

public class prg40_primerNumber {

	 
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Number to check the prime Number or Not");
				int n=sc.nextInt();
			 	prg40_primerNumber na= new prg40_primerNumber();
					  System.out.println("Prime number its:"+na.isPrime(n));    
					}  
			boolean isPrime(int n) {
			    for(int i=2;2*i<n;i++) {
			        if(n%i==0)
			            return false;
			    }
			    return true;
			}
			

	}
 
