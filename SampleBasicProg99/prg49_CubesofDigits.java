package SampleBasicProg99;

import java.util.Scanner;

public class prg49_CubesofDigits {
	public static void main(String []args)
	{
		System.out.println("Cubes of Individual Digits");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num= sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int n= num%10;
			sum=sum+(n*n*n);
			num=num/10;
		}
		System.out.println("Cube of entered number is:"+sum);
		sc.close();
	}

}
