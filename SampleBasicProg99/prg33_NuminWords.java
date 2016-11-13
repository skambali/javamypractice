package SampleBasicProg99;

import java.util.Scanner;

public class prg33_NuminWords {
	public static void main(String ...args)
	{
		System.out.println("Numbers displyed in words");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		String msg=" ";
		int rev=0;
		while(num!=0)
		{
			int r=num%10;
		    rev=rev*10+r;
			num=num/10;
		}
		while(rev!=0)
		{
			int n=rev%10;
			switch(n)
			{
			case 0:msg="Zero \t";
			break;
			case 1:msg="One \t";
			break;
			case 2:msg="Two \t";
			break;
			case 3:msg="Three \t";
			break;
			case 4:msg="Four \t";
			break;
			case 5:msg="Five \t";
			break;
			case 6:msg="Six \t";
			break;
			case 7:msg="Seven \t";
			break;
			case 8:msg="Eight \t";
			break;
			case 9:msg="Nine \t";
			break;
			}
			rev=rev/10;
			System.out.println(msg);
		}
		sc.close();
	}

}
