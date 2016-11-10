// Given no is positive or negative
package SampleBasicProg99;
import java.util.Scanner;

public class prg11 {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the number:");
		int a= sc.nextInt();
		if(a>0)
		
			System.out.println("the given no s positive");
			else
				System.out.println("The given no is negative");
		sc.close();
	}

}
