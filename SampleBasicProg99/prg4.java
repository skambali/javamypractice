package SampleBasicProg99;

//to read one character value and display the same

import java.io.IOException;
import java.util.Scanner;

public class prg4 {
	public static void main(String [] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
 	 System.out.println("enter the character is:");
		char c = sc.next().charAt(0);
	    System.out.println("The entered character is:"+c);
	    sc.close();
	}

}
