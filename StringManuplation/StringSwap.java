package StringManuplation;

public class StringSwap {

	public static void main(String[] args){
		String a="welcome";
		String b="swaping";
		System.out.println(a+b);
		
		System.out.println("a value is:"+a); 
		System.out.println("b balue is:"+b); 
		
		a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length(),a.length());
        
           System.out.println("After Swaping");
		System.out.println("a value is:"+a); 
		System.out.println("b balue is:"+b); 
		
		
		
		
		//a=a.substring(0,)
        //welcomeswaping
        //0,length()=10
        //
		
	}
}
