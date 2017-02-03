package SampleBasicProg99;

// Maximum of three numbers

import java.util.Scanner;

public class prg16_maxofthreeno {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter three no:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if (num1>num2 && num1>num3)
			System.out.println("num1 is greatest");
		else if (num2>num3 && num2>num1)
			System.out.println("num2 is greatest");
		else if (num3>num1 && num3>num2)
			System.out.println("num3 is greatest");
		else
			System.out.println("Entered nos are not distinct");
			
		sc.close();
	}

}
