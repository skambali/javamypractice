package SampleBasicProg99;
//Eligibility for voting

import java.util.Scanner;

public class prg12 {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the age of a person:");
		int age= sc.nextInt();
		if(age>=18)
		
			System.out.println("Person is eligible");
			else
				System.out.println("Person is not eligible");
		sc.close();
	}
}
