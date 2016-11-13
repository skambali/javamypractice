package SampleBasicProg99;

import java.util.Scanner;

public class prg24_ConvertUpperCase {
public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Ente the lower case character to convert to Upper Case:");
	char c=sc.next().charAt(0);
	 
    c-=32;
	System.out.println("UpperCase -Converted is:"+c);
	sc.close();
	
}
}
