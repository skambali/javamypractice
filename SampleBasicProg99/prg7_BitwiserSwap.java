package SampleBasicProg99;

import java.util.Scanner;

public class prg7_BitwiserSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter a and b value");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("before swap=" +a+"\nb="+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("after swap= "+a+"\nb="+b);
		
	}

}
