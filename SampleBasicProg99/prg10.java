package SampleBasicProg99;
import java.util.Scanner;

// Conversion of Fahrenheit to celsius


public class prg10 {
	public static void main(String [] args) 
	{
		Scanner sc=new Scanner(System.in);
 	 System.out.println("enter the value of farenheit f:");
 	 int f=sc.nextInt();
 	 int c= (f-32)*5/9;
 	 System.out.println("result="+c);
	sc.close();
	}
}
