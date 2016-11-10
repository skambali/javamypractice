package SampleBasicProg99;
//Minimum of two nos
import java.util.Scanner;

public class prg15 {
	public static void main(String args[])
	{
		System.out.println("Finding minimun of two numbers");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the values for a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a<b)
			System.out.println("a is minimum");
		else
			System.out.println("b is minimum");
		sc.close();
	}
}


