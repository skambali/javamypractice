package SampleBasicProg99;

import java.util.Scanner;

public class prg27_owelrConstant {
public static void main(String[] args) {
	System.out.println("enter the char to check owel or Constant:");
	 //Owel is AEIOU
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	if((c>=65 && c<=90) || (c>=97 && c<=122)){
		switch(c){
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		
			
			
			System.out.println("its owel: "+c);
			
			break;
			
			default:
				System.out.println("its a constant" +c);
		}
	}else{
		System.out.println("its a invalid input" +c);
	}
	 
}
}
