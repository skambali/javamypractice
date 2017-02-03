package SampleBasicProg99;

//to read one character value and display the same

import java.io.IOException;
import java.util.Scanner;

public class Fib {
	public static void main(String [] args) throws IOException
	{
		
		int a=0;
		int b=1;
		int fib;
		System.out.print(+a +" "+ +b +" ");
		for(int i=2;i<=5;i++){
			fib=a+b;
			a=b;
			b=fib;
		 
			System.out.print(fib);
			
			System.out.print(" ");
		}
		
	}

}
