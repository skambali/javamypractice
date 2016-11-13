package SampleBasicProg99;

import java.util.Scanner;

public class prg31_SumofNNumber {

	public static void main(String ... args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("enter the range: you want for Natural Number");
	int num=sc.nextInt();
	if(num>=1){
		for (int i=1;i<=num;i++){
			
			System.out.print(i +" ");
			
			sum=sum+i;
		}
	}
			
	System.out.println("total sum is:"+sum);

	}

}
