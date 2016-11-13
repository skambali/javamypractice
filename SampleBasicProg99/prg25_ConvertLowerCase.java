package SampleBasicProg99;

import java.util.Scanner;

public class prg25_ConvertLowerCase {
public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Ente the Upper case character to convert to Lower Case:");
	char c=sc.next().charAt(0);
	 
    c+=32;
	System.out.println("LowerrCase -Converted is:"+c);
	sc.close();
	
}
}
