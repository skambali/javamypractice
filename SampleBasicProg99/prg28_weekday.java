package SampleBasicProg99;

import java.util.Scanner;

public class prg28_weekday {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number in day to check:");
	int day=sc.nextInt();
	System.out.println("Day is:");
	switch(day){
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("monday");
		break;
	case 3:
		System.out.println("Tuesday");
		break;
	case 4: 
		System.out.println("wednesday");break;
	case 5:
		System.out.println("thursday");break;
	case 6:
		System.out.println("Friday");break;
	case 7:
		System.out.println("Saturday");break;
		default:
			System.out.println("enter a valid day");
	}
	
	
	
}
	
}
