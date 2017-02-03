package OthesInJava;

public class ProgramRevereAnum {
	public static void main(String[] args){
		
		int a=10;
		int b=20;
		System.out.println("Before swap"+a +"::" +b);
		a=a+b; //30
		b=a-b;//30-10=20
		a=a-b;//20-10=10
		System.out.println("After swap"+a +"::" +b);
		
		String a1="abc";
		String b1="cd";
		System.out.println("Before swap: "+a1 +"::" +b1);
		 
		a1=a1+b1;
		//1 abccd
		//b1=0,5-2=3
		//b1=0,3
		b1=a1.substring(0,a1.length()-b1.length());
		
		//a1=b1,a1
		//a1=3,5
		a1=a1.substring(b1.length(),a1.length());
		System.out.println("After swap: "+a1 +"::" +b1);
		
		int num=12345;
		int reverse=0;
		//revese it
		  int reminder=0;
		  while(num!=0){ 
			  reminder=num%10; //to get last digit
			  
			  reverse=reverse*10+reminder;
			  
			  num=num/10; // to remove last digit in a number
		  
		  }
		  
		  System.out.println(reverse);
		  
		  
		  
		  String re="abcde";
		 char c[]=re.toCharArray();
		 
		for(int i= c.length-1;i>=0;i--){
			System.out.print(c[i]);
			
		}
		
		System.out.println();
		
		String re1=String.valueOf(c);
		System.out.println("value of char array:"+re1);
		StringBuffer a2=new StringBuffer(re1);
		System.out.println("after revese using StringBuilder:"+a2.reverse());
		
		
		
				 
	 
		
	}

}
