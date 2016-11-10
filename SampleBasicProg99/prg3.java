package SampleBasicProg99;

//to display each characters in a string

import java.util.Scanner;

public class prg3 {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enetr the string:");
	String str=sc.next();
	
	int length=str.length();
	for(int i=0;i<length;i++){
		System.out.println("char is:"+str.charAt(i));
	sc.close();
	}
	}
}
