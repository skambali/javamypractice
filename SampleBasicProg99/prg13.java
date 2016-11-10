package SampleBasicProg99;
// Number is EVEN or ODD

import java.util.Scanner;

public class prg13 {

	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the number:");
		int n= sc.nextInt();
		if(n%2==0)
		System.out.println("The no is Even");
		else
			System.out.println("The no is Odd");
		sc.close();
	}
			
}
