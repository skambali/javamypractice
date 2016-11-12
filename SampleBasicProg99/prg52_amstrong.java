package SampleBasicProg99;

import java.util.Scanner;

public class prg52_amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int a,b;
		
		int c=0;
		System.out.println("enter the number to check its Armstrongs:");
		int number=sc.nextInt();
		int	temp=number;
    while (number!=0){
	
    	a=number%10;//get last digit
    	    	c=c+(a*a*a);//armstrong logic
    	number=number/10;
    	
   }
    
    if (temp==c){
    	 System.out.println("number is an Armstrong:" +temp);

    }else{
    	
    	System.out.println("number is Not an Armstrong:" +temp);
    }
    

	}

}
