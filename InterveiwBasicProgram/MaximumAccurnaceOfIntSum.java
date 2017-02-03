package InterveiwBasicProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaximumAccurnaceOfIntSum {
	public static void main(String[] args) {
		//Problem:223312344
	int a=	1112;
	
	String s=String.valueOf(a);
	char c[]=s.toCharArray();
	
   HashMap<Character,Integer> h=new HashMap<Character,Integer>();
   ArrayList al=new ArrayList();
  
   int count = 0;
  
   int cou=0;
   for(char ch:c){
	   al.add(ch);
		
	   if(h.containsKey(ch)){
		   h.put(ch, h.get(ch)+1);
		   String str=String.valueOf(ch);
		   int in=Integer.valueOf(str);
		   count=in+in;
		    
		  
		  System.out.println(count);
		  
		  cou=count;
	   }else{
		   h.put(ch, 1);
	   }
   }
   System.out.println("Sum is"+cou);
   
   System.out.println(h);
   System.out.println(al);
	
	}

}
