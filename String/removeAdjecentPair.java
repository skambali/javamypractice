package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeAdjecentPair {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		

	//String input = "aaaaabbbbccccdddef";
	
	String d = "abbbb**sSS";
String input=	d.toLowerCase();
  // Pattern p = Pattern.comtpile("(.)(?!\\1)");
   Pattern p = Pattern.compile("(.)(?!\\1)");
    
    Matcher m = p.matcher(input);
    String a = null;

    while(m.find()){
    	
       a=m.group();
       System.out.print(a);
        	sb=sb.append(a);
        System.out.print(" ");
    }
    System.out.println("--------------------");
    System.out.println(sb);
	//String s = "abc";
		            
		//String s = "aaaaabbbbccccdddef";
		/*String s="ABCCBCBA";
		int l = s.length();
		        char ch;
		      //  String ans="";
		        StringBuilder ans=new StringBuilder(); 
		        for(int i=0; i<l; i++)
		        {
		            ch = s.charAt(i);
		            if(ch!=' ')
		                ans = ans.append(ch);
		            s = s.replace(ch,' '); //Replacing all occurrence of the current character by a space
		        }
		 
		       System.out.println("Word after removing duplicate characters : " + ans);
		    }
		  */

}}