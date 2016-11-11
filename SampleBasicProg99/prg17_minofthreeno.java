package SampleBasicProg99;

import java.util.Scanner;

public class prg17_minofthreeno {
	public static void main(String []args)
	{
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter three no:");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int num3=sc.nextInt();
	
	if (num1<num2 && num1<num3)
		System.out.println("num1 is smallest");
	else if (num2<num1 && num2<num3)
		System.out.println("num2 is smallest");
	else if (num3<num1 && num3<num2)
		System.out.println("num3 is smallest");
	else
		System.out.println("Entered nos are not distinct");
		
	sc.close();
}

}
