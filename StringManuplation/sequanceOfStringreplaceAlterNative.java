package StringManuplation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sequanceOfStringreplaceAlterNative {
	
	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\s");
		String s[]=p.split("welcome to ebay is grater than string");
		
		boolean count = true;
		for(String s1:s){
			
			if(count)
			{
				System.out.println(s1.toLowerCase());
				
				
				count=false;
				
			}else{
							
				
				System.out.println(s1.toUpperCase());
				count=true;
			}
			
			 
		}
	
		/*String s="aol";
		System.out.println(s.toUpperCase());*/
		 
					}
	 
	}

 
