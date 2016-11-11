package SampleBasicProg99;

import java.util.Scanner;

public class prg99_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	 int num1=sc.nextInt();
	System.out.println("Enter the Second Number"); 
	int num2=sc.nextInt();
	System.out.println("Calc: what you want to do..."); 
	 
	String operator=sc.next();
	
	if(operator.equalsIgnoreCase("+")){
		System.out.println("Adding two numbers:" +"\ncalculator="+(num1+num2));
		
	}else if(operator.equalsIgnoreCase("-")){
		System.out.println("Subtration of  two numbers:"+"\ncalculator" +(num1-num2));
		
	}else if(operator.equalsIgnoreCase("*")){
		System.out.println("Multiplication of  two numbers:"+"\ncalculator" +(num1*num2));
		
	}else if(operator.equalsIgnoreCase("/")){
		System.out.println("Divison of  two numbers:"+"\ncalculator" +(num1*num2));
		
	}else if(operator.equalsIgnoreCase("%")){
		System.out.println("Mod of  two numbers:"+"\ncalculator" +(num1%num2));
		
	}else{
		System.out.println("its not a Basic calucator operator: Good bye..");
		return;
	}
	}

}
