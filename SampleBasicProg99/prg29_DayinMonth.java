package SampleBasicProg99;

import java.util.Scanner;

public class prg29_DayinMonth {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Year");
	int year=sc.nextInt();
	System.out.println("Enter the month:");
int month=sc.nextInt();

if((month==1||month==3||month==5||month==7||month==9||month==11)){
	System.out.println("Dates in this month is::31");
	
}else if(month==2){
	if(((year%4)==0) ||((year%400)==0)&&((year%100)!=0)){
		
	//	if( ((year%4)==0) &&((year%400)==0) ||((year%100)!=0)){

		System.out.println("its a leap year:"+year+"Date in this month is::29");}
		else{
			System.out.println("Dates in this month is::28");
				
		}

		
	}else if((month==2||month==4||month==6||month==8||month==10)){
		System.out.println("Dates in this month is:30");

	
}else{
	System.out.println("invalid month");
}

}
}
